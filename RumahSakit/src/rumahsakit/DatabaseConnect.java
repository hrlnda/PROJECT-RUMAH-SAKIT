/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rumahsakit;
import java.sql.*;

/**
 *
 * @author LENOVO
 */
public class DatabaseConnect {
    private static Connection connect;
    private static String jdbcurl = "jdbc:mysql://localhost:3306/rumahsakit";
    private static String password = "";
    
    
    public static Connection getConnection() throws ClassNotFoundException {
        
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                connect = DriverManager.getConnection(jdbcurl, "root", password);
            } catch(Exception e) {
                System.out.println("Error " + e.getMessage());
            }
            
        return connect;
    }
}
