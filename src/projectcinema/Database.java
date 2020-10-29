/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcinema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author User
 */
public class Database {
     
     private static Connection MySQLConfig;
    
    public static Connection configDB()throws SQLException{
        try{
            String url = "jdbc:mysql://localhost/projectpbo";
            String user = "root";
            String pass= "";
            
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLConfig = DriverManager.getConnection(url,user,pass);
            System.out.println("Connected");
        }catch(SQLException e){
            System.out.println("Failed Connection"+e.getMessage());
        }
        return MySQLConfig;
    }
}
    
    
    
//    public void disconnect(){
//        try {
//            conn.close();
//            stmt.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    
   