
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfigExample extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
    
        response.setContentType("text/html");
        ServletConfig s=this.getServletConfig();
        response.getWriter().print(s.getServletName()+"</br>");
        Enumeration e = s.getInitParameterNames();
        while(e.hasMoreElements())
        {
            String name=(String)e.nextElement();
            response.getWriter().print(name+" "+s.getInitParameter(name)+"</br>");

        }
       
        }
        catch(Exception e){response.getWriter().print(e.getMessage());}
    }
}
            