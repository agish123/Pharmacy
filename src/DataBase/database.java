/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Akish
 */
public class database {
    
    public static void main (String [] args)

    {
        ConnectDb();
    }
    public static Connection ConnectDb()
    {
       Connection connection = null;
        
         try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy system", "root","");
             return connection;
         } catch (ClassNotFoundException | SQLException ex) {

             JOptionPane.showMessageDialog(null, ex);
             
         }
       return connection;
    }
}
