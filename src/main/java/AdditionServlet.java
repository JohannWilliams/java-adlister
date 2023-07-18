import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AdditionServlet", urlPatterns = "/add")
public class AdditionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        try {
            int num1 = Integer.parseInt(req.getParameter("num1"));
            int num2 = Integer.parseInt(req.getParameter("num2"));
            out.println(String.format("%d + %d = %d", num1, num2, num1 + num2));
        } catch (Exception e){
            out.println("Include parameters of num1 and num2 to request to add the numbers together!");
        }


    }
}
