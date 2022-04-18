/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;




import java.util.*;

public class Happy {
    
    
    public static Date Add(Date d1,int days){
        
        try {
            
            Calendar c1 = Calendar.getInstance();
            c1.setTime(d1);
            c1.add(Calendar.DATE, days);
            return c1.getTime();
            
        } catch (Exception e) {
            return null;
        }
    }
    
}
