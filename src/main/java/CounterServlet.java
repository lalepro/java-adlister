import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "CounterServlet", urlPatterns = "/counter")



public class CounterServlet extends HttpServlet {
    private int hitCount;

    public void init(){
        hitCount = 0;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        hitCount++;

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>" + " Visitors "  + hitCount + "</h2>");

    }

}