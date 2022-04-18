/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import entities.*;
import java.sql.*;
import java.util.*;

public class Moneyshoppingdao {
    
    public boolean create(MoneyShopping ms) {
        try {
            PreparedStatement ps = ConnectDatabase.getConnection().prepareStatement("insert into MoneyShopping values(?,?,?,?,?)");
            
            ps.setString(1, ms.getNamemoney());
            ps.setLong(2, ms.getMoney());
            ps.setDate(3, new java.sql.Date(ms.getDate().getTime()));
            ps.setString(4, ms.getDescription());
            ps.setInt(5, ms.getUsersid().getUsersid());
            
            return ps.executeUpdate() > 0;
            
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean updates(MoneyShopping ms) {
        try {
            PreparedStatement ps = ConnectDatabase.getConnection().prepareStatement("update MoneyShopping \n"
                    + "set namemoney =?, money=?,Date=?,description=?,usersid=? where  id = ?");
            
            ps.setString(1, ms.getNamemoney());
            ps.setLong(2, ms.getMoney());
            ps.setDate(3, new java.sql.Date(ms.getDate().getTime()));
            ps.setString(4, ms.getDescription());
            ps.setInt(5, ms.getUsersid().getUsersid());
            ps.setInt(6, ms.getId());
            
            return ps.executeUpdate() > 0;
            
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean delete(int id) {
        try {
            PreparedStatement ps = ConnectDatabase.getConnection().prepareStatement("delete\n"
                    + "from MoneyShopping\n"
                    + "where id=?");
            
            ps.setInt(1, id);
            
            return ps.executeUpdate() > 0;
            
        } catch (Exception e) {
            return false;
        }
    }
    
    public List<MoneyShopping> findll(int userid) {
        List<MoneyShopping> moneyshop = new ArrayList<MoneyShopping>();
        try {
            PreparedStatement ps = ConnectDatabase.getConnection().prepareStatement("select id,namemoney, money, Date, description \n"
                    + "from  MoneyShopping where usersid = ?");
            ps.setInt(1, userid);
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
    
    public List<MoneyShopping> findday(int userid, int month, int year) {
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
    
    public MoneyShopping find(int userid) {
        MoneyShopping ms = new MoneyShopping();
        try {
            PreparedStatement ps = ConnectDatabase.getConnection().prepareStatement("select * \n"
                    + "from  MoneyShopping where id= ?");
            ps.setInt(1, userid);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
                ms.setId(rs.getInt("id"));
                ms.setNamemoney(rs.getString("namemoney"));
                ms.setMoney(rs.getLong("money"));
                ms.setDate(Happy.Add(rs.getDate("Date"), 2));
                ms.setDescription(rs.getString("description"));
                ms.getUsersid().setUsersid(rs.getInt("usersid"));
                
            }
        } catch (Exception e) {
            return ms = null;
            
        }
        
        return ms;
    }
}
