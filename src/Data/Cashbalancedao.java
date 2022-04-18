/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.*;
import entities.*;
import java.util.*;

public class Cashbalancedao {
    public boolean create(cashbalance cb) {
        try {
            PreparedStatement ps = ConnectDatabase.getConnection().prepareStatement("insert into cashbalance values(?,?,?,?,?)");
            
            ps.setString(1, cb.getNamemoney());
            ps.setLong(2, cb.getMoney());
            ps.setDate(3, new java.sql.Date(cb.getDate().getTime()));
            ps.setString(4, cb.getDescription());
            ps.setInt(5, cb.getUsersid().getUsersid());
            
            return ps.executeUpdate() > 0;
            
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean updates(cashbalance cb) {
        try {
            PreparedStatement ps = ConnectDatabase.getConnection().prepareStatement("update cashbalance \n"
                    + "set namemoney =?, money=?,Date=?,description=?,usersid=? where  id = ?");
            
            ps.setString(1, cb.getNamemoney());
            ps.setLong(2, cb.getMoney());
            ps.setDate(3, new java.sql.Date(cb.getDate().getTime()));
            ps.setString(4, cb.getDescription());
            ps.setInt(5, cb.getUsersid().getUsersid());
            ps.setInt(6, cb.getId());
            
            return ps.executeUpdate() > 0;
            
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean delete(int id) {
        try {
            PreparedStatement ps = ConnectDatabase.getConnection().prepareStatement("delete\n"
                    + "from cashbalance\n"
                    + "where id=?");
            
            ps.setInt(1, id);
            
            return ps.executeUpdate() > 0;
            
        } catch (Exception e) {
            return false;
        }
    }
    
    public List<cashbalance> findll(int userid) {
        List<cashbalance> cashbalanlist = new ArrayList<cashbalance>();
        try {
            PreparedStatement ps = ConnectDatabase.getConnection().prepareStatement("select id,namemoney, money, Date, description \n"
                    + "from  cashbalance where usersid = ?");
            ps.setInt(1, userid);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cashbalance cb = new cashbalance();
                cb.setId(rs.getInt("id"));
                cb.setNamemoney(rs.getString("namemoney"));
                cb.setMoney(rs.getLong("money"));
                cb.setDate(Happy.Add(rs.getDate("Date"), 2));
                cb.setDescription(rs.getString("description"));
                cashbalanlist.add(cb);
            }
        } catch (Exception e) {
            return cashbalanlist = null;
            
        }
        
        return cashbalanlist;
    }
    
    public List<cashbalance> findday(int userid, int month, int year) {
        List<cashbalance> cashbalancelist= new ArrayList<cashbalance>();
        try {
            PreparedStatement ps = ConnectDatabase.getConnection().prepareStatement("select id,namemoney, money, Date, description \n"
                    + "from cashbalance\n"
                    + "where usersid = ? and month(Date)=? and year(Date) = ?");
            ps.setInt(1, userid);
            ps.setInt(2, month);
            ps.setInt(3, year);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cashbalance cb = new cashbalance();
                cb.setId(rs.getInt("id"));
                cb.setNamemoney(rs.getString("namemoney"));
                cb.setMoney(rs.getLong("money"));
                cb.setDate(Happy.Add(rs.getDate("Date"), 2));
                cb.setDescription(rs.getString("description"));
                cashbalancelist.add(cb);
            }
        } catch (Exception e) {
            return cashbalancelist = null;
            
        }
        
        return cashbalancelist;
    }
    
    public cashbalance find(int userid) {
        cashbalance cb = new cashbalance();
        try {
            PreparedStatement ps = ConnectDatabase.getConnection().prepareStatement("select * \n"
                    + "from  cashbalance where id= ?");
            ps.setInt(1, userid);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
                cb.setId(rs.getInt("id"));
                cb.setNamemoney(rs.getString("namemoney"));
                cb.setMoney(rs.getLong("money"));
                cb.setDate(Happy.Add(rs.getDate("Date"), 2));
                cb.setDescription(rs.getString("description"));
                cb.getUsersid().setUsersid(rs.getInt("usersid"));
                
            }
        } catch (Exception e) {
            return cb = null;
            
        }
        
        return cb;
    }
}
