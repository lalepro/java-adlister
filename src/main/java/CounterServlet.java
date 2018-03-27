import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "CounterServlet", urlPatterns = "/counter")



public class CounterServlet extends HttpServlet {
    private int hitCount;
    String reset;


    public void init() {
        hitCount = 0;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        hitCount++;
        response.getWriter().println("<h1>Hello, World!</h1>");
        response.getWriter().println("<h1>Counter!</h1>");
        response.getWriter().println("<h2>Total Number of hits: " + hitCount + "</h2>");

        if (reset != null && reset.equalsIgnoreCase("reset")) {

            hitCount = 0;
            reset = request.getParameter("reset");
            response.getWriter().println("<h2> Visitors: " + hitCount + "</h2>");

        }

        response.getWriter().println("<form>");
        response.getWriter().println("<input name = 'reset' value='Reset' type='submit'>");
        response.getWriter().println("</form>");
        String Count;
        Count = request.getParameter(" ");
        if (Count != null && Count.equalsIgnoreCase(" ")) {
            hitCount = 0;
            response.getWriter().println("<form>");
            response.getWriter().println("<input name = 'Count' value='Count' type='submit'>");
            response.getWriter().println("</form>");
        }

//        response.getWriter().println("<h1>Counter!</h1>");
//        response.getWriter().println("<h2>Total Number of hits: " + hitCount + "</h2>");
//        do {
//            String reset = request.getParameter("reset");
//            if (reset != null && reset.equalsIgnoreCase("reset")) {
//                hitCount = 0;
//            } else {
//                hitCount++;
//            }
//            response.getWriter().println("<form>");
//            response.getWriter().println("<input name = 'reset' value='Reset' type='submit'>");
//            response.getWriter().println("</form>");
//        } while (reset != null) {
//            String Count = request.getParameter(" ");
//            if (Count != null && Count.equalsIgnoreCase("count")) {
//                hitCount = 0;
//            } else {
//                hitCount++;
//            }
//        }
//        response.getWriter().println("<form>");
//        response.getWriter().println("<input name = 'Count' value='Count' type='submit'>");
//        response.getWriter().println("</form>");

//    http://localhost:8080/counter?restart=restart

    }
}


//        hitCount++;
//    String name = request.getParameter("name");
//    if (name == null) {
//        name = "World";
//    }