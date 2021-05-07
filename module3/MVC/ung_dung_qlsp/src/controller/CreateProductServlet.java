package controller;

import model.Product;
import service.ProductService;
import service.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CreateProductServlet"  ,urlPatterns = "/create")
public class CreateProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int number = Integer.parseInt(request.getParameter("number"));
        String type = request.getParameter("type");
        float price = Float.parseFloat(request.getParameter("price"));
        Product product = new Product(id,name,number,type,price);
        ProductService productService = new ProductServiceImpl();
        productService.save(product);
        response.sendRedirect("list");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("product/create.jsp").forward(request , response);
    }
}
