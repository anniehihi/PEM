/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.*;

public class MoneyInvesteed {
         
    
    private int id;
    private String typesofinvestments;
    private String nameinvestments;
    private long  money;
    private Date date;
    private String description;
    private Users userid;

    public MoneyInvesteed() {
        this.userid = new Users();
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypesofinvestments() {
        return typesofinvestments;
    }

    public void setTypesofinvestments(String typesofinvestments) {
        this.typesofinvestments = typesofinvestments;
    }

    public String getNameinvestments() {
        return nameinvestments;
    }

    public void setNameinvestments(String nameinvestments) {
        this.nameinvestments = nameinvestments;
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

    public Users getUserid() {
        return userid;
    }

    public void setUserid(Users userid) {
        this.userid = userid;
    }
    
    
}
