import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="GuessServlet", urlPatterns = "/guess")
public class GuessServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/guess.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int randomGuess = (int)(Math.random() * 3) + 1;
        int guess = 0;

        try {
            guess = Integer.parseInt(req.getParameter("guess"));
        }catch (Exception e){
            resp.sendRedirect("/guess.jsp");
        }

        if(guess > 3 || guess < 1){
            resp.sendRedirect("/guess.jsp");
        }

        if(guess == randomGuess){
//            req.getRequestDispatcher("/correct").forward(req,resp);
            resp.sendRedirect("/correct");
        } else {
//            req.getRequestDispatcher("/incorrect").forward(req, resp);
            resp.sendRedirect("/incorrect");
        }

    }
}
