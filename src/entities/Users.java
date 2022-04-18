/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.*;

public class Users {
    
    private int usersid;
    private String name;
    private String username;
    private String password;
    private Date dataofbrith;

    public Users() {
    }

    public Users(int usersid, String name, String username, String password, Date dataofbrith) {
        this.usersid = usersid;
        this.name = name;
        this.username = username;
        this.password = password;
        this.dataofbrith = dataofbrith;
    }

    public int getUsersid() {
        return usersid;
    }

    public void setUsersid(int usersid) {
        this.usersid = usersid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDataofbrith() {
        return dataofbrith;
    }

    public void setDataofbrith(Date dataofbrith) {
        this.dataofbrith = dataofbrith;
    }
    
    
    
    
}
