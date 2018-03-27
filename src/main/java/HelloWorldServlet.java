import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().println("<h1>Hello, World!</h1>");
    }
}
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
//        String name = request.getParameter("name");
//        request.setAttribute("name", name);
//        request.getRequestDispatcher("/hello.jsp").forward(request, response);
//    }