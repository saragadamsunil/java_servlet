import java.io.*;
import jakarta.servlet.*;

public class GServlet extends GenericServlet {

    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>MyServlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>This is an Example Servlet!</h1>");
        out.println("</body>");
        out.println("</html>");
    }


}

