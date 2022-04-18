/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.*;
public class Statistical {
   private int id; 
   private long DailyMoney;
   private long MoneyShopping; 
   private long incomemoney ;
   private long cashbalance; 
   private String date ;
   private Users usersid;

    public Statistical() {
        
        this.usersid = new Users();
    }

   
   
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getDailyMoney() {
        return DailyMoney;
    }

    public void setDailyMoney(long DailyMoney) {
        this.DailyMoney = DailyMoney;
    }

    public long getMoneyShopping() {
        return MoneyShopping;
    }

    public void setMoneyShopping(long MoneyShopping) {
        this.MoneyShopping = MoneyShopping;
    }

    public long getIncomemoney() {
        return incomemoney;
    }

    public void setIncomemoney(long incomemoney) {
        this.incomemoney = incomemoney;
    }

    public long getCashbalance() {
        return cashbalance;
    }

    public void setCashbalance(long cashbalance) {
        this.cashbalance = cashbalance;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Users getUsersid() {
        return usersid;
    }

    public void setUsersid(Users usersid) {
        this.usersid = usersid;
    }
   
   
   
}
