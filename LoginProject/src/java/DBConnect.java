
import java.sql.*;

public class DBConnect {
    
    private Connection con;
    private Statement st;
    private ResultSet rs;

      public DBConnect(){
        try{
            
            //setup driver
            Class.forName("com.mysql.jdbc.Driver");
            //get connection
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","kaustubh","Mbappe@1");
            st=  con.createStatement();
        }
        catch(Exception e){
            System.out.println("Error"+e);
        }
    }
      public ResultSet getData(){
          try{
              String query="select * from person";
              rs=st.executeQuery(query);
              System.out.println("Records");
              
          }
          catch(Exception e){
              System.out.println("exception");
      
          }
          return rs;
      }
    
}

