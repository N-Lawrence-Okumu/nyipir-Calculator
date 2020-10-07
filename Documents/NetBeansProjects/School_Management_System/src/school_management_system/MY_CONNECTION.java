/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_management_system;

import com.mysql.cj.jdbc.MysqlDataSource;
import com.sun.jdi.connect.spi.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GRAY COMPUTERS
 */
public class MY_CONNECTION { 
    
    
    public Connection creatConnection(){
        Connection connection =  null;
        MysqlDataSource mds=new MysqlDataSource();
        
        mds.setServerName("localhos,t");
        mds.setPortNumber(3306) ; 
        mds.setUser("root");
        mds.setPassword("");
        mds.setDatabaseName("school_management_db");
        
        try {
            connection = (Connection) mds.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(MY_CONNECTION.class.getName()).log(Level.SEVERE, null, ex);
            
        }
           return connection;
    }
}
           
        
        


    
    
    
    
    

