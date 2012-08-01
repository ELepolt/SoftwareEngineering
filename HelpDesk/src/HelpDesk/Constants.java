/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HelpDesk;

/**
 *
 * @author lepolted
 */
public class Constants {
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
    
}
