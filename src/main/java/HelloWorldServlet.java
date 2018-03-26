//import com.sun.xml.internal.ws.util.StringUtils;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "HelloServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.setContentType("text/html");
        String name = request.getParameter("name");
        if (name == null) {
            name = "World";
        }
       response.getWriter().println("<h1>Hello, " + name + "!</h1>");


    }

}


