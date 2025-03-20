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
    private String name;
    private int apartment_id;
    private String relationship_to_owner;
    private Date created_at;

    public Resident() {
    }

    public Resident(int id, String name, int apartment_id, String relationship_to_owner, Date created_at) {
        this.id = id;
        this.name = name;
        this.apartment_id = apartment_id;
        this.relationship_to_owner = relationship_to_owner;
        this.created_at = created_at;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelationship_to_owner() {
        return relationship_to_owner;
    }

    public void setRelationship_to_owner(String relationship_to_owner) {
        this.relationship_to_owner = relationship_to_owner;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "Resident{" + "id=" + id + ", name=" + name + ", apartment_id=" + apartment_id + ", relationship_to_owner=" + relationship_to_owner + ", created_at=" + created_at + '}';
    }   
}
