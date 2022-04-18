/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.*;
import java.util.*;
import entities.*;
public class Daidymoneydao {
    
    
    public boolean create(DailyMoney dm){
        try {
            PreparedStatement ps = ConnectDatabase.getConnection().prepareStatement("insert into DailyMoney values(?,?,?,?,?)");
            
            ps.setString(1, dm.getNamemoney());
            ps.setLong(2, dm.getMoney());
            ps.setDate(3, new java.sql.Date(dm.getDate().getTime()));
            ps.setString(4, dm.getDescription());
            ps.setInt(5, dm.getUsersid().getUsersid());
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            return false;
            
        }
    }
    
       public boolean updates(DailyMoney dm){
        try {
            PreparedStatement ps = ConnectDatabase.getConnection().prepareStatement("update DailyMoney\n" +
"set namemoney =?, money=?,Date=?,description=?,usersid=? where  id = ?");
            
            ps.setString(1, dm.getNamemoney());
            ps.setLong(2, dm.getMoney());
            ps.setDate(3, new java.sql.Date(dm.getDate().getTime()));
            ps.setString(4, dm.getDescription());
            ps.setInt(5, dm.getUsersid().getUsersid());
            ps.setInt(6, dm.getId());
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            return false;
            
        }
    }
       
      public List<DailyMoney> findll(int userid){
          List<DailyMoney> daimoney = new ArrayList<DailyMoney>();
        try {
            PreparedStatement ps = ConnectDatabase.getConnection().prepareStatement("select id,namemoney, money, Date, description \n" +
"from  DailyMoney where usersid = ?");
            ps.setInt(1, userid);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                DailyMoney dm = new DailyMoney();
                dm.setId(rs.getInt("id"));
                dm.setNamemoney(rs.getString("namemoney"));
                dm.setMoney(rs.getLong("money"));
                dm.setDate(Happy.Add(rs.getDate("Date"), 2));
                dm.setDescription(rs.getString("description"));
                daimoney.add(dm);
            }
        } catch (Exception e) {
            return daimoney = null;
            
        }
        
        return daimoney;
    }
      
      
      
       public List<DailyMoney> findllday(int userid,int month,int year){
          List<DailyMoney> daimoney = new ArrayList<DailyMoney>();
        try {
            PreparedStatement ps = ConnectDatabase.getConnection().prepareStatement("select id,namemoney, money, Date, description \n" +
"from DailyMoney \n" +
"where usersid = ? and month(Date)= ? and year(Date) = ?");
            ps.setInt(1, userid);
            ps.setInt(2, month);
            ps.setInt(3, year);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                DailyMoney dm = new DailyMoney();
                dm.setId(rs.getInt("id"));
                dm.setNamemoney(rs.getString("namemoney"));
                dm.setMoney(rs.getLong("money"));
                dm.setDate(Happy.Add(rs.getDate("Date"), 2));
                dm.setDescription(rs.getString("description"));
                daimoney.add(dm);
            }
        } catch (Exception e) {
            return daimoney = null;
            
        }
        
        return daimoney;
    }
      
      
       
        public DailyMoney find(int userid){
          DailyMoney daimoney = new DailyMoney();
        try {
            PreparedStatement ps = ConnectDatabase.getConnection().prepareStatement("select * \n" +
"from  DailyMoney where id= ?");
            ps.setInt(1, userid);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
           
                daimoney.setId(rs.getInt("id"));
                daimoney.setNamemoney(rs.getString("namemoney"));
                daimoney.setMoney(rs.getLong("money"));
                daimoney.setDate(Happy.Add(rs.getDate("Date"), 2));
                daimoney.setDescription(rs.getString("description"));
                daimoney.getUsersid().setUsersid(rs.getInt("usersid"));
               
            }
        } catch (Exception e) {
            return daimoney = null;
            
        }
        
        return daimoney;
    }
       
        
        public boolean delete(int id){
            try {
                
                  PreparedStatement ps = ConnectDatabase.getConnection().prepareStatement("delete\n" +
"from DailyMoney\n" +
"where id=?");
                
                  ps.setInt(1, id);
                  
                  return ps.executeUpdate() >0;
                  
                  
            } catch (Exception e) {
                return false;
            }
        }
    
}
