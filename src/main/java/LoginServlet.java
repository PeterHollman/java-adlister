import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        String username = request.getParameter("username");
        String password = request.getParameter("password");
//        boolean validAttempt = username.equals("admin") && password.equals("password");
//
//        if (validAttempt) {
//            response.sendRedirect("/profile");
//        } else {
//            response.sendRedirect("/login");
//        }
        if (username.length() > 0 && password.length() > 0) {
            HttpSession oldSession = request.getSession(false);
            if (oldSession != null) {
                oldSession.invalidate();
            }
            HttpSession newSession = request.getSession(true);

            newSession.setMaxInactiveInterval(5*60);

            Cookie message = new Cookie("message", "Welcome");
            response.addCookie(message);
            response.sendRedirect("/profile");
        } else {
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/login");
            PrintWriter out = response.getWriter();
            out.println("<font color=red>Either username or password is wrong.</font>");
            rd.include(request, response);
        }
    }
}
