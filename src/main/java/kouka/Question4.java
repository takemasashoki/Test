package kouka;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/kouka/Question4"})
public class Question4 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String name = request.getParameter("name");
        
        System.out.println("名前：" + name);
                request.setAttribute("name", name);
        RequestDispatcher dispatcher = request.getRequestDispatcher("Question4output.jsp");
        dispatcher.forward(request, response);
    }
}