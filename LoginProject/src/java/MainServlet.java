
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(urlPatterns = {"/MainServlet"})
public class MainServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        response.setHeader("Cache-control","no-cache,no-store,must-revalidate");
        response.setHeader("Pragma","no-cache");
        response.setHeader("Expires","0");
        HttpSession s=request.getSession();
        
        if(s.getAttribute("uname")==null)
        {
             response.sendRedirect("login.jsp");
        }
        
        try (PrintWriter out = response.getWriter()) {
        ResultSet rs;
             DBConnect connect=new DBConnect();
             rs=connect.getData();
             try{
            while(rs.next()){
                  String name=rs.getString("name");
                  String age=rs.getString("age");
                  System.out.println("Name"+name+"age"+age);
                  out.println("name:"+name+"age:"+age);
                  
                  
            }
             }
             catch(Exception e){
                 System.out.println("exception");
             }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
