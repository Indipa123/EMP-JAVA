/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emp;
import java.sql.*;

/**
 *
 * @author indipa
 */
public class dbconnection {
    
    private static Connection conn;
    public static Connection getMyConnection()
    {
        try {
            String dbpath = "jdbc:mysql://localhost/ems";
        conn = DriverManager.getConnection(dbpath, "root", "");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
        return conn;
    }
    
}
