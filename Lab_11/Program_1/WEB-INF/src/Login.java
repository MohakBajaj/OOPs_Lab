import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        PrintWriter pr = response.getWriter();
        String LoginName = request.getParameter("name");
        String l_pass = request.getParameter("pass");
        if (LoginName.equals("admin") && l_pass.equals("root")) {
            pr.print("Login success");
        } else {
            pr.print("invalid");
        }
        pr.close();
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");

    }
}
