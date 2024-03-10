import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class HServlet extends HttpServlet {

    String un, pass, name, regno;

    public void init(ServletConfig config) {

        name = config.getInitParameter("name");
        regno = config.getInitParameter("regno");

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        un = request.getParameter("username");
        pass = request.getParameter("pass");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>HttpServlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Welcome to Http Servlet</h1><br><br>");
        out.println("UserName: "+un+"<br>");
        out.println("Password: "+pass+"<br>");
        out.println("Name: "+name+"<br>");
        out.println("Registration No: "+regno+"<br>");
        out.println("</body>");
        out.println("</html>");
        out.close();


    }

}