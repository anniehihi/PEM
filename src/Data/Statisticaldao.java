/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.*;
import entities.*;
import java.util.*;
public class Statisticaldao {
    
      
  
       public List<DailyMoney> findlldaily(int userid,int month,int year){
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
      
    
       
        public List<MoneyShopping> findllshop(int userid, int month, int year) {
        List<MoneyShopping> moneyshop = new ArrayList<MoneyShopping>();
        try {
            PreparedStatement ps = ConnectDatabase.getConnection().prepareStatement("select id,namemoney, money, Date, description \n"
                    + "from MoneyShopping\n"
                    + "where usersid = ? and month(Date)=? and year(Date) = ?");
            ps.setInt(1, userid);
            ps.setInt(2, month);
            ps.setInt(3, year);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MoneyShopping ms = new MoneyShopping();
                ms.setId(rs.getInt("id"));
                ms.setNamemoney(rs.getString("namemoney"));
                ms.setMoney(rs.getLong("money"));
                ms.setDate(Happy.Add(rs.getDate("Date"), 2));
                ms.setDescription(rs.getString("description"));
                moneyshop.add(ms);
            }
        } catch (Exception e) {
            return moneyshop = null;
            
        }
        
        return moneyshop;
    }
        
        
        
          
      
      
       public List<Incomemoney> findllimco(int userid,int month,int year){
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
       
       
      public boolean create(Statistical sta){
          try {
              PreparedStatement ps = ConnectDatabase.getConnection().prepareStatement("insert into statistical values(?,?,?,?,?,?)");
              
              ps.setLong(1, sta.getDailyMoney());
              ps.setLong(2, sta.getMoneyShopping());
              ps.setLong(3, sta.getIncomemoney());
              ps.setLong(4, sta.getCashbalance());
              ps.setString(5, sta.getDate());
              ps.setInt(6, sta.getUsersid().getUsersid());
              
              return ps.executeUpdate() >0;
          } catch (Exception e) {
              return false;
          }
      
      }
      
      public List<Statistical> findll(int userid){
          List<Statistical> liststa = new ArrayList<Statistical>();
          try {
              PreparedStatement ps = ConnectDatabase.getConnection().prepareStatement("select *\n" +
"from statistical\n" +
"where usersid= ? ");
              ps.setInt(1, userid);
              ResultSet rs =  ps.executeQuery();
              while(rs.next()){
                  Statistical sta = new Statistical();
                  sta.setId(rs.getInt("id"));
                  sta.setDailyMoney(rs.getLong("DailyMoney"));
                  sta.setMoneyShopping(rs.getLong("MoneyShopping"));
                  sta.setIncomemoney(rs.getLong("incomemoney"));
                  sta.setCashbalance(rs.getLong("cashbalance"));
                  sta.setDate(rs.getString("date"));
                  sta.getUsersid().setUsersid(rs.getInt("usersid"));
                  liststa.add(sta);
              }
          } catch (Exception e) {
              return liststa=null;
          }
          
          return liststa;
      }
      
      
      public boolean delete(int id){
          try {
              PreparedStatement ps =ConnectDatabase.getConnection().prepareStatement("delete from statistical where id =?");
              ps.setInt(1, id);
              return ps.executeUpdate() >0;
          } catch (Exception e) {
              
              return false;
          }
      }
}
