package controllers;
import models.DaoFactory;

import models.Ad;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ShowAdServlet", urlPatterns = "/ads/show")
public class ShowAdServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/show.jsp").forward(request,response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int adButton = Integer.parseInt(request.getParameter("adButton"));

        System.out.println(adButton);

        Ad ad = DaoFactory.getAdsDao().all().get(adButton - 1);
        request.setAttribute("adButton", adButton);
        request.getRequestDispatcher("WEB-INF/show.jsp").forward(request,response);
    }
}
