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

@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.getWriter().println("<h1>Hello, World!</h1>");

    String restart = request.getParameter("restart");
    if (restart == null){
        hitCount++;
        response.getWriter().println("<h2> Visitors: " + hitCount + "</h2>");
    } else {
        hitCount = 0;
        response.getWriter().println("<h2> Visitors: " + hitCount + "</h2>");
    }
    }
//    http://localhost:8080/counter?restart=restart

}

//        hitCount++;
//    String name = request.getParameter("name");
//    if (name == null) {
//        name = "World";
//    }