
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jegat
 */
public class ConnectionClass 
{
     Connection con;
    Statement stm;
    
    ConnectionClass()
    {
       try
       {
           Class.forName("com.mysql.cj.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/libraryDB","root","iisc");
           stm=con.createStatement();
           if(con!=null)
           {
               System.out.println("Successfully connected");
           }
       }
       catch(Exception e)
       {
           System.out.println("not connected");
           e.printStackTrace();
           
       }
    }
    public static void main(String[] args)
    {
        new ConnectionClass();
    }

    Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    

