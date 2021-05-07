package controller;

import model.Product;
import service.ProductService;
import service.ProductServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "EditProductServlet" , urlPatterns = "/edit")
public class EditProductServlet extends HttpServlet {
    private ProductService productService;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int number = Integer.parseInt(request.getParameter("number"));
        String type = request.getParameter("type");
        float price = Float.parseFloat(request.getParameter("price"));
        Product product = this.productService.findById(id);
        RequestDispatcher dispatcher ;
            product.setNameProduct(name);
            product.setNumberProduct(number);
            product.setTypeProduct(type);
            product.setPrice(price);
            this.productService.update(id,product);
            request.setAttribute("products",product);
            dispatcher = request.getRequestDispatcher("product/edit.jsp");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productService.findById(id);
        RequestDispatcher dispatcher;
        if(product == null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            request.setAttribute("products", product);
            dispatcher = request.getRequestDispatcher("product/edit.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
