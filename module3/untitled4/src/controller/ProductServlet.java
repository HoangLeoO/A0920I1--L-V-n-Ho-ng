package controller;

import dao.IProductDao;
import dao.impl.ProductDaoImpl;
import model.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet" , urlPatterns = "/product")
public class ProductServlet extends HttpServlet {
    private IProductDao productDao;

    @Override
    public void init() {
        productDao=new ProductDaoImpl();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action==null){
            action ="";
        }
        switch (action){
            case "create":
                createProduct(request,response);
                break;
            default:
                break;
        }
    }

    private void createProduct(HttpServletRequest req, HttpServletResponse resp) {
        String product_id = req.getParameter("product_id");
        String product_name = req.getParameter("product_name");
        float product_price = Float.parseFloat(req.getParameter("product_price"));
        int product_discount = Integer.parseInt(req.getParameter("product_discount"));
        int product_stock = Integer.parseInt(req.getParameter("product_stock"));

        Product product = new Product(product_id,product_name,product_price,product_discount,product_stock);
        productDao.insertProduct(product);
        list(req,resp);

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action==null){
            action ="";
        }
        switch (action){
            case "create":
                showCreateForm(request,response);
                break;
            default:
                list(request,response);
                break;
        }
    }
    private void list(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        List<Product> product = productDao.getAllProduct();

        RequestDispatcher dispatcher = request.getRequestDispatcher("product/list.jsp");
        request.setAttribute("product",product);

        try {
            dispatcher.forward(request,response);
        }catch (ServletException|IOException e){
            e.printStackTrace();
        }
    }

    private void showCreateForm(HttpServletRequest req, HttpServletResponse resp) {

        RequestDispatcher dispatcher = req.getRequestDispatcher("product/create.jsp");
        try {
            dispatcher.forward(req,resp);
        }catch (ServletException|IOException e){
            e.printStackTrace();
        }
    }
}
