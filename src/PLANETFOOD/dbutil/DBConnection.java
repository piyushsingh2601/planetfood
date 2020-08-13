/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PLANETFOOD.dbutil;

import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class DBConnection {

    private static Connection conn;
    static
    {
        try
        {
         Class.forName("oracle.jdbc.OracleDriver");
          JOptionPane.showMessageDialog(null,"Connected succesfully to the database","Succes!",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(ClassNotFoundException e)
        {
        JOptionPane.showMessageDialog(null, "error loading driver class"+e,"Error!",JOptionPane.ERROR_MESSAGE);
       e.getStackTrace();
        }
        try
        {
         conn=DriverManager.getConnection("jdbc:oracle:thin:@//piyush-PC:1521/xe","planetfood","food");
           JOptionPane.showMessageDialog(null,"Connected succesfully","Succes!",JOptionPane.INFORMATION_MESSAGE);
       }
        catch(SQLException ex)
        {
        JOptionPane.showMessageDialog(null, "error in connection"+ex,"Error!",JOptionPane.ERROR_MESSAGE);
       ex.getStackTrace();
        }
    
    
    }
    public static Connection getConnection()
    {
    return conn;
    }
    public static void closeConnection()
    {
    if(conn!=null)
    {
    try
    {
    conn.close();
    }
    catch(SQLException ex)
    {
    JOptionPane.showMessageDialog(null,"Error While Disconnecting","Error!",JOptionPane.ERROR_MESSAGE);
    }
    }
    }
}
