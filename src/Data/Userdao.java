/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import entities.*;
import java.util.*;
import java.sql.*;

public class Userdao {
    
    
    public boolean  create(Users us){
        try {
            PreparedStatement ps = ConnectDatabase.getConnection().prepareStatement("insert into users(name,username,password,dataofbrith) values(?,?,?,?)");
            
            ps.setString(1, us.getName());
            ps.setString(2, us.getUsername());
            ps.setString(3, us.getPassword());
            ps.setDate(4, new java.sql.Date(us.getDataofbrith().getTime()) );
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            
            return false;
        }
    }
    
    public List<Users> finllusername(){
        List<Users> listus = new ArrayList<Users>();
        try {
            PreparedStatement ps = ConnectDatabase.getConnection().prepareStatement("select username\n" +
"from users");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Users us = new Users();
                us.setUsername(rs.getString("username"));
                listus.add(us);
            }
        } catch (Exception e) {
            return listus = null;
        }
        return listus;
    }
    
    
    
    public Users find(String username,String password){
         Users us = null;
        try {
            PreparedStatement ps = ConnectDatabase.getConnection().prepareStatement("select *\n" +
"from users\n" +
"where username=? and password=? ");
            
           ps.setString(1, username);
           ps.setString(2, password);
           ResultSet rs =  ps.executeQuery();
           while(rs.next()){
               us = new Users();
               us.setUsersid(rs.getInt("usersid"));
               us.setName(rs.getString("name"));
               us.setUsername(rs.getString("username"));
               us.setPassword(rs.getString("password"));
               us.setDataofbrith(Happy.Add(rs.getDate("dataofbrith"), 2));
           }
            
        } catch (Exception e) {
            return us=null;
        }
        
        return us;
    }
    
     public Users findusername(String username){
         Users us = null;
        try {
            PreparedStatement ps = ConnectDatabase.getConnection().prepareStatement("select *\n" +
"from users\n" +
"where username=? ");
            
           ps.setString(1, username);
          
           ResultSet rs =  ps.executeQuery();
           while(rs.next()){
               us = new Users();
               us.setUsersid(rs.getInt("usersid"));
               us.setName(rs.getString("name"));
               us.setUsername(rs.getString("username"));
               us.setPassword(rs.getString("password"));
               us.setDataofbrith(Happy.Add(rs.getDate("dataofbrith"), 2));
           }
            
        } catch (Exception e) {
            return us=null;
        }
        
        return us;
    }
}
