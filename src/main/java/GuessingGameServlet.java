import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GuessingGameServlet", urlPatterns = "/guess")
public class GuessingGameServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int usernumber = Integer.parseInt(request.getParameter("usernumber"));
        String message = " ";

        request.setAttribute("usernumber", usernumber);

        if (usernumber == 13){
            message = "You are correct";
        }
        else if (usernumber > 13 && usernumber < 100){
            message = "Too high";
        }
        else if (usernumber > 100){
            message = "Over 100, start again!";
        }
        else {
            message = "you entered a wrong number";
        }
        request.setAttribute("message", message);
        request.getRequestDispatcher("/numberRedirect.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/enterNumber.jsp").forward(request, response);
    }



}
