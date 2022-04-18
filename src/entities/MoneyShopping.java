/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.*;

public class MoneyShopping {

    private int id;
    private String namemoney;
    private long money;
    private Date date;
    private String description;
    private Users usersid;

    public MoneyShopping() {
        this.usersid = new Users();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamemoney() {
        return namemoney;
    }

    public void setNamemoney(String namemoney) {
        this.namemoney = namemoney;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Users getUsersid() {
        return usersid;
    }

    public void setUsersid(Users usersid) {
        this.usersid = usersid;
    }

}
