/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.*;
import entities.*;
import Data.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class IcomeMoneydao {
      public boolean create(Incomemoney Im){
        try {
            PreparedStatement ps = ConnectDatabase.getConnection().prepareStatement("insert into incomemoney values(?,?,?,?,?)");
            
            ps.setString(1, Im.getNamemoney());
            ps.setLong(2, Im.getMoney());
            ps.setDate(3, new java.sql.Date(Im.getDate().getTime()));
            ps.setString(4, Im.getDescription());
            ps.setInt(5, Im.getUsersid().getUsersid());
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            return false;
            
        }
    }
    
       public boolean updates(Incomemoney im){
        try {
            PreparedStatement ps = ConnectDatabase.getConnection().prepareStatement("update incomemoney\n" +
"set namemoney =?, money=?,Date=?,description=?,usersid=? where  id = ?");
            
            ps.setString(1, im.getNamemoney());
            ps.setLong(2, im.getMoney());
            ps.setDate(3, new java.sql.Date(im.getDate().getTime()));
            ps.setString(4, im.getDescription());
            ps.setInt(5, im.getUsersid().getUsersid());
            ps.setInt(6, im.getId());
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            return false;
            
        }
    }
       
      public List<Incomemoney> findll(int userid){
          List<Incomemoney> inmoney = new ArrayList<Incomemoney>();
        try {
            PreparedStatement ps = ConnectDatabase.getConnection().prepareStatement("select id,namemoney, money, Date, description \n" +
"from  incomemoney where usersid = ?");
            ps.setInt(1, userid);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Incomemoney im = new Incomemoney();
                im.setId(rs.getInt("id"));
                im.setNamemoney(rs.getString("namemoney"));
                im.setMoney(rs.getLong("money"));
                im.setDate(Happy.Add(rs.getDate("Date"), 2));
                im.setDescription(rs.getString("description"));
                inmoney.add(im);
            }
        } catch (Exception e) {
            return inmoney = null;
            
        }
        
        return inmoney;
    }
       
      
      
      
       public List<Incomemoney> findllday(int userid,int month,int year){
          List<Incomemoney> inmoney = new ArrayList<Incomemoney>();
        try {
            PreparedStatement ps = ConnectDatabase.getConnection().prepareStatement("select id,namemoney, money, Date, description \n"
                    + "from incomemoney \n"
                    + "where usersid = ? and month(Date)=? and year(Date) = ?");
            ps.setInt(1, userid);
            ps.setInt(2, month);
            ps.setInt(3, year);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Incomemoney im = new Incomemoney();
                im.setId(rs.getInt("id"));
                im.setNamemoney(rs.getString("namemoney"));
                im.setMoney(rs.getLong("money"));
                im.setDate(Happy.Add(rs.getDate("Date"), 2));
                im.setDescription(rs.getString("description"));
                inmoney.add(im);
            }
        } catch (Exception e) {
            return inmoney = null;
            
        }
        
        return inmoney;
    }
      
      
        public Incomemoney find(int userid){
          Incomemoney im = new Incomemoney();
        try {
            PreparedStatement ps = ConnectDatabase.getConnection().prepareStatement("select * \n" +
"from  incomemoney where id= ?");
            ps.setInt(1, userid);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
           
                im.setId(rs.getInt("id"));
                im.setNamemoney(rs.getString("namemoney"));
                im.setMoney(rs.getLong("money"));
                im.setDate(Happy.Add(rs.getDate("Date"), 2));
                im.setDescription(rs.getString("description"));
                im.getUsersid().setUsersid(rs.getInt("usersid"));
               
            }
        } catch (Exception e) {
            return im = null;
            
        }
        
        return im;
    }
       
        
        public boolean delete(int id){
            try {
                
                  PreparedStatement ps = ConnectDatabase.getConnection().prepareStatement("delete\n" +
"from incomemoney\n" +
"where id=?");
                
                  ps.setInt(1, id);
                  
                  return ps.executeUpdate() >0;
                  
                  
            } catch (Exception e) {
                return false;
            }
        }
}
