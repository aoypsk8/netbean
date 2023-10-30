/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package airport_bill;
import java.sql.*;
import javax.swing.ImageIcon;


public class Airport_bill {



    public static Connection getcon() {
        try {
        String url="jdbc:mysql://localhost:3306/airport_bill";
        String user="root";
        String pass="";
        String driver="com.mysql.cj.jdbc.Driver";
        Class.forName(driver);
return (Connection) DriverManager.getConnection(url,user,pass);

         
     } catch (Exception e) {
         e.printStackTrace();
     }
     return null;
    }
    
}
