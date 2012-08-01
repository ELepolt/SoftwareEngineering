/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HelpDesk;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lepolted
 */
public class DatabaseConnection {
    
    public Connection conn = null;
    public Statement stmt = null;
    public ResultSet rs = null;
    
    public Connection connectToDB(){
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
            } catch (InstantiationException ex) {
                Logger.getLogger(HelpDeskMainFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(HelpDeskMainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HelpDeskMainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            conn = DriverManager.getConnection("jdbc:mysql://ucfilespace.uc.edu/lepolted","lepolted","password");
        } catch (SQLException ex) {
            Logger.getLogger(HelpDeskMainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    
    public ResultSet getResults(Connection conn, String sql){
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(HelpDeskMainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(HelpDeskMainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public ResultSet updateDatabase(Connection conn, String sql){
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(HelpDeskMainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(HelpDeskMainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
        
    }
    
    public void cleanUp(Connection conn){
        /*
        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(HelpDeskMainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(HelpDeskMainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(HelpDeskMainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
