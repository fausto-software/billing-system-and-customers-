/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bill.and.customers.system.controller;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author User
 */
public class BDConnnection {
    
    public static Connection Connecting (){
        Connection conn = null;
            try {
                String url = "jdbc:mysql://localhost:3306/billandclientes?user=root&Password=";
                conn = DriverManager.getConnection(url);
                
            } catch (Exception e) {
            }
            
             return conn;
    }
   
}
