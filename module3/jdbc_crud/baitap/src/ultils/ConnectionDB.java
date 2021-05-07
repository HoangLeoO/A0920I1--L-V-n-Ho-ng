package ultils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    private static String jdbcURL = "jdbc:mysql://localhost:3306/student?useSSL=false";
    private static String jdbcUserName ="root";
    private static String jdbcPassword = "hoang911";

    public static Connection getConnection(){
        Connection connection = null ;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL,jdbcUserName,jdbcPassword);
        }catch (SQLException e){
            // TODO Auto-generated catch block
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }
}
