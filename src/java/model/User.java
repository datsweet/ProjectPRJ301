/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author GIGABYTE
 */
public class User {
    private int id;
    private String username;
    private String password_hash;
    private String email;
    private int role_id;
    private Date create_at;

    public User() {
    }

    public User(int id, String username, String password_hash, String email, int role_id, Date create_at) {
        this.id = id;
        this.username = username;
        this.password_hash = password_hash;
        this.email = email;
        this.role_id = role_id;
        this.create_at = create_at;
    }   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword_hash() {
        return password_hash;
    }

    public void setPassword_hash(String password_hash) {
        this.password_hash = password_hash;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public Date getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Date create_at) {
        this.create_at = create_at;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", username=" + username + ", password_hash=" + password_hash + ", email=" + email + ", role_id=" + role_id + ", create_at=" + create_at + '}';
    } 
}
