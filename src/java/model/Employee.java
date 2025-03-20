/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author GIGABYTE
 */
public class Employee {
    private int id;
    private int user_id;
    private String department;
    private String position;
    private boolean is_active;

    public Employee() {
    }   

    public Employee(int id, int user_id, String department, String position, boolean is_active) {
        this.id = id;
        this.user_id = user_id;
        this.department = department;
        this.position = position;
        this.is_active = is_active;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", user_id=" + user_id + ", department=" + department + ", position=" + position + ", is_active=" + is_active + '}';
    }     
}
