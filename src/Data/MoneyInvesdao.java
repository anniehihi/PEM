/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.*;
import entities.*;
import java.sql.*;

public class MoneyInvesdao {

    public boolean create(MoneyInvesteed mi) {
        try {
            PreparedStatement ps = ConnectDatabase.getConnection().prepareStatement("insert into moneyinvested values(?,?,?,?,?,?)");

            ps.setString(1, mi.getTypesofinvestments());
            ps.setString(2, mi.getNameinvestments());
            ps.setLong(3, mi.getMoney());
            ps.setDate(4, new java.sql.Date(mi.getDate().getTime()));
            ps.setString(5, mi.getDescription());
            ps.setInt(6, mi.getUserid().getUsersid());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            return false;
        }
    }

    public boolean updates(MoneyInvesteed mi) {
        try {
            PreparedStatement ps = ConnectDatabase.getConnection().prepareStatement("update moneyinvested\n"
                    + "set typesofinvestments =?, nameinvestments=?,money=?,Date=?,description=?,usersid=? where  id = ?");

            ps.setString(1, mi.getTypesofinvestments());
            ps.setString(2, mi.getNameinvestments());
            ps.setLong(3, mi.getMoney());
            ps.setDate(4, new java.sql.Date(mi.getDate().getTime()));
            ps.setString(5, mi.getDescription());
            ps.setInt(6, mi.getUserid().getUsersid());
            ps.setInt(7, mi.getId());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            return false;

        }
    }

    public boolean delete(int id) {
        try {

            PreparedStatement ps = ConnectDatabase.getConnection().prepareStatement("delete\n"
                    + "from moneyinvested\n"
                    + "where id=?");

            ps.setInt(1, id);

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            return false;
        }
    }

    public List<MoneyInvesteed> findll(int userid) {
        List<MoneyInvesteed> milist = new ArrayList<MoneyInvesteed>();
        try {
            PreparedStatement ps = ConnectDatabase.getConnection().prepareStatement("select id, typesofinvestments, nameinvestments, money , Date,description \n"
                    + "from  moneyinvested where usersid = ?");
            ps.setInt(1, userid);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MoneyInvesteed mi = new MoneyInvesteed();
                mi.setId(rs.getInt("id"));
                mi.setTypesofinvestments(rs.getString("typesofinvestments"));
                mi.setNameinvestments(rs.getString("nameinvestments"));
                mi.setMoney(rs.getLong("money"));
                mi.setDate(Happy.Add(rs.getDate("Date"), 2));
                mi.setDescription(rs.getString("description"));
                milist.add(mi);
            }
        } catch (Exception e) {
            return milist = null;

        }

        return milist;
    }

    public List<MoneyInvesteed> findday(int userid, int months, int year) {
        List<MoneyInvesteed> milist = new ArrayList<MoneyInvesteed>();
        try {
            PreparedStatement ps = ConnectDatabase.getConnection().prepareStatement("select id,typesofinvestments,nameinvestments,money,Date,description\n"
                    + "from moneyinvested\n"
                    + "where usersid=? and month(Date)=? and year(Date) = ?");
            ps.setInt(1, userid);
            ps.setInt(2, months);
            ps.setInt(3, year);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MoneyInvesteed mi = new MoneyInvesteed();
                mi.setId(rs.getInt("id"));
                mi.setTypesofinvestments(rs.getString("typesofinvestments"));
                mi.setNameinvestments(rs.getString("nameinvestments"));
                mi.setMoney(rs.getLong("money"));
                mi.setDate(Happy.Add(rs.getDate("Date"), 2));
                mi.setDescription(rs.getString("description"));
                milist.add(mi);
            }
        } catch (Exception e) {
            return milist = null;

        }

        return milist;
    }

    public List<MoneyInvesteed> findyear(int userid, int year) {
        List<MoneyInvesteed> milist = new ArrayList<MoneyInvesteed>();
        try {
            PreparedStatement ps = ConnectDatabase.getConnection().prepareStatement("select id,typesofinvestments,nameinvestments,money,Date,description\n"
                    + "from moneyinvested\n"
                    + "where usersid=?  and year(Date) = ?");
            ps.setInt(1, userid);

            ps.setInt(2, year);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MoneyInvesteed mi = new MoneyInvesteed();
                mi.setId(rs.getInt("id"));
                mi.setTypesofinvestments(rs.getString("typesofinvestments"));
                mi.setNameinvestments(rs.getString("nameinvestments"));
                mi.setMoney(rs.getLong("money"));
                mi.setDate(Happy.Add(rs.getDate("Date"), 2));
                mi.setDescription(rs.getString("description"));
                milist.add(mi);
            }
        } catch (Exception e) {
            return milist = null;

        }

        return milist;
    }

    public MoneyInvesteed find(int id) {
        MoneyInvesteed mi = null;
        try {
            PreparedStatement ps = ConnectDatabase.getConnection().prepareStatement("select id,typesofinvestments,nameinvestments,money,Date,description from moneyinvested where id=?");
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                mi = new MoneyInvesteed();
                mi.setId(rs.getInt("id"));
                mi.setTypesofinvestments(rs.getString("typesofinvestments"));
                mi.setNameinvestments(rs.getString("nameinvestments"));
                mi.setMoney(rs.getLong("money"));
                mi.setDate(Happy.Add(rs.getDate("Date"), 2));
                mi.setDescription(rs.getString("description"));

            }
        } catch (Exception e) {
            return mi = null;

        }

        return mi;
    }
}
