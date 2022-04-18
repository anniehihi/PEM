/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cryptography;

import entities.Users;
import java.util.*;
import java.util.regex.*;
public class Valition {
    
    
    
    

    public boolean checkname(String n) {
        Pattern pt = Pattern.compile("[^a-z,0-9  ]", Pattern.CASE_INSENSITIVE);

        Matcher mt1 = pt.matcher(n);
        if (mt1.find()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkusernamepassword(String n) {
        Pattern pt = Pattern.compile("[^a-z,0-9]", Pattern.CASE_INSENSITIVE);
        Matcher mt1 = pt.matcher(n);
        if (mt1.find()) {
            return true;
        } else {
            return false;
        }

    }
    
    
    public boolean checmoney(String money){
        try {
            Long.parseLong(money);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
