/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HelpDesk;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lepolted
 */
public class HelpFunctions {
    static int VisibleToPublic = 0;
    static int InvisibleToPublic = 1;
    
    static int Math = 1;
    static int Science = 2;
    static int English = 3;
    static int History = 4;
    
    static int subCat(String sc)
    {
        int i = 1;
        if(sc == "Science")
        {
            i = 2;
        }
        if(sc == "English")
        {
            i = 3;
        }
        if(sc == "History")
        {
            i = 4;
        }
        return i;
    }
    
    static String getAuthor(int ID)
    {
        DatabaseConnection db = new DatabaseConnection();
        Connection conn = db.connectToDB();
        
        String sql = "Select Username FROM HD_Accounts where ID='"+ ID + "'";
        ResultSet rs = db.getResults(conn, sql);
        try {
            if (rs.next())
            {
                return rs.getString("Username");
            }
            else
            {
                return "Unknown Author";
            }
        } catch (SQLException ex) {
            Logger.getLogger(HelpFunctions.class.getName()).log(Level.SEVERE, null, ex);
            return "Unknown Author";
        }
    }
    
}
