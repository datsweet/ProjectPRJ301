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
public class Resident {
    private int id;
    private int apartment_id;
    private String full_name;
    private Date date_of_birth;
    private String gender;
    private String id_number;
    private String phone_number;
    private String relationship;
    private boolean is_active;

    public Resident() {
    }

    public Resident(int id, int apartment_id, String full_name, Date date_of_birth, String gender, String id_number, String phone_number, String relationship, boolean is_active) {
        this.id = id;
        this.apartment_id = apartment_id;
        this.full_name = full_name;
        this.date_of_birth = date_of_birth;
        this.gender = gender;
        this.id_number = id_number;
        this.phone_number = phone_number;
        this.relationship = relationship;
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

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId_number() {
        return id_number;
    }

    public void setId_number(String id_number) {
        this.id_number = id_number;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    @Override
    public String toString() {
        return "Resident{" + "id=" + id + ", apartment_id=" + apartment_id + ", full_name=" + full_name + ", date_of_birth=" + date_of_birth + ", gender=" + gender + ", id_number=" + id_number + ", phone_number=" + phone_number + ", relationship=" + relationship + ", is_active=" + is_active + '}';
    }   
}
