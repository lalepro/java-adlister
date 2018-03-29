package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean validAttempt = username.equals("admin") && password.equals("password");

        request.setAttribute("password", password);
        request.setAttribute("username", username);

        if(validAttempt){
            response.sendRedirect("/profile");
        }
        else {
            response.sendRedirect("/login");
        }

//        if(username != null){
//            response.sendRedirect("/index");
//        }
//        else if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("password")){
//
//        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/login.jsp").forward(request,response);
    }
}

//
//   if (request.getMethod().equalsIgnoreCase("post")) {
//           String username = request.getParameter("username");
//           String password = request.getParameter("password");
//           if (username.equals("admin") && password.equals("password")) {
//           response.sendRedirect("/profile");
//           }
//           }