/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author GIGABYTE
 */
public class ApartmentUser {
    private int id;
    private int apartment_id;
    private int user_id;
    private String user_type;
    private boolean is_active;

    public ApartmentUser() {
    }

    public ApartmentUser(int id, int apartment_id, int user_id, String user_type, boolean is_active) {
        this.id = id;
        this.apartment_id = apartment_id;
        this.user_id = user_id;
        this.user_type = user_type;
        this.is_active = is_active;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getApartment_id() {
        return apartment_id;
    }

    public void setApartment_id(int apartment_id) {
        this.apartment_id = apartment_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    @Override
    public String toString() {
        return "ApartmentUser{" + "id=" + id + ", apartment_id=" + apartment_id + ", user_id=" + user_id + ", user_type=" + user_type + ", is_active=" + is_active + '}';
    }   
}
