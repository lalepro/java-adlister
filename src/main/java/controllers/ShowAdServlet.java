package controllers;
import models.DaoFactory;

import models.Ad;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ShowAdServlet", urlPatterns = "/show")
public class ShowAdServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.getRequestDispatcher("WEB-INF/show.jsp").forward(request,response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));

        System.out.println(id);

        Ad ad = DaoFactory.getAdsDao().all().get(id - 1);
        request.setAttribute("ad", ad);
        request.getRequestDispatcher("/ads/show.jsp").forward(request,response);
    }
}
