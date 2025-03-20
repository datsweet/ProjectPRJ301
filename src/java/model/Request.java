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
public class Request {
    private int id;
    private int apartment_id;
    private String request_type;
    private String description;
    private String status;
    private int assigned_to;
    private Date created_at;

    public Request() {
    }

    public Request(int id, int apartment_id, String request_type, String description, String status, int assigned_to, Date created_at) {
        this.id = id;
        this.apartment_id = apartment_id;
        this.request_type = request_type;
        this.description = description;
        this.status = status;
        this.assigned_to = assigned_to;
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

    public String getRequest_type() {
        return request_type;
    }

    public void setRequest_type(String request_type) {
        this.request_type = request_type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getAssigned_to() {
        return assigned_to;
    }

    public void setAssigned_to(int assigned_to) {
        this.assigned_to = assigned_to;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "Request{" + "id=" + id + ", apartment_id=" + apartment_id + ", request_type=" + request_type + ", description=" + description + ", status=" + status + ", assigned_to=" + assigned_to + ", created_at=" + created_at + '}';
    }   
}
