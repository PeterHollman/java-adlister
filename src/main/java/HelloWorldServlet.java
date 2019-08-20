import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/helloworld")
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws IOException {
        System.out.println("Hello World");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String input = req.getParameter("input");
        out.println("<h1>Hello, " + input + "!</h1>");
        out.println("<form method = 'get'> <input type = 'text' name = 'input'> </input> <input type = 'submit'> </input> </form>");
    }
}
