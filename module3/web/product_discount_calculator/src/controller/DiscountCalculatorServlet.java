package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountCalculatorServlet" ,urlPatterns = "/test")
public class DiscountCalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Product_Description = request.getParameter("PD");
        Float List_Price = Float.parseFloat(request.getParameter("LP"));
        Integer Discount_Percent = Integer.parseInt(request.getParameter("DP"));

        Double Discount_Amount = List_Price * Discount_Percent * 0.01 ;
        Double Discount_Price = List_Price + Discount_Amount ;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1> Discount Amount: " + Discount_Amount + "</h1>");
        writer.println("<h1> Discount Price: " + Discount_Price + "</h1>");
        writer.println("</html>");
    }
}
