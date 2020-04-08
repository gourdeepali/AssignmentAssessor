/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teacher.dbutil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class DBConnection {
     private static Connection conn;
    static{

        try{
        
            Class.forName("oracle.jdbc.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","assignment","password");
            JOptionPane.showMessageDialog(null,"connected to the database successfully","Success",JOptionPane.INFORMATION_MESSAGE);
            
        }
        catch(Exception ex){

            JOptionPane.showMessageDialog(null,"error connecting database","Error!!",JOptionPane.ERROR_MESSAGE);
            System.out.println("Exception is"+ex);
        }
    }
    public static Connection getConnection(){
    
        return conn;
    }
    
    public static void closeConnection(){
    
        if(conn!=null)
	{
	 try
	  {
	   conn.close();
	   JOptionPane.showMessageDialog(null,"Application closed successfully","Closed!!",JOptionPane.INFORMATION_MESSAGE);

	  }
         catch(SQLException sq)
	  {
	    JOptionPane.showMessageDialog(null,"error inclosing the application"+sq,"Error!!",JOptionPane.ERROR_MESSAGE);

	  }

        }
    }
}
