
package project;
import java.sql.*;

public class connectionprovider {
    public static Connection getcon()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","1234");
            return con;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
                
    }
}
