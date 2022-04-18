/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cryptography;

import java.util.*;
import java.security.*;
import javax.crypto.Cipher;
import sun.misc.*;
public class Cryptography {
    
    private Key key;

    public Cryptography(Key key) {
        this.key = key;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }
    
    public String Enctypt(String content){
        try {
            Cipher ci = Cipher.getInstance("DES");
            ci.init(Cipher.ENCRYPT_MODE, key);
            byte[] bytecontent = content.getBytes();
            byte[] result = ci.doFinal(bytecontent);
            BASE64Encoder encoder = new BASE64Encoder();
            return encoder.encode(result);
         } catch (Exception e) {
          return null;
        }
    }
    
    public String DeEnctypt(String content){
        try {
            Cipher ci = Cipher.getInstance("DES");
            ci.init(Cipher.DECRYPT_MODE, key);
            BASE64Decoder decoder = new BASE64Decoder();
            byte[] resultcontent = decoder.decodeBuffer(content);
            byte[] result = ci.doFinal(resultcontent);
            return new String(result);
        } catch (Exception e) {
            return null;
        }
    }
    
}
