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
public class Employee {
    private int id;
    private int user_id;
    private String name;
    private String email;
    private String phone;
    private String position;
    private Date created_at;
    private Date updated_at;

    public Employee() {
    }   

    public Employee(int id, int user_id, String name, String email, String phone, String position, Date created_at, Date updated_at) {
        this.id = id;
        this.user_id = user_id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.position = position;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }  

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", user_id=" + user_id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", position=" + position + ", created_at=" + created_at + ", updated_at=" + updated_at + '}';
    }   
}
