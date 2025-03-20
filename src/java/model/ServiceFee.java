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
public class ServiceFee {
    private int id;
    private int apartment_id;
    private Date month;
    private double water_fee;
    private double parking_fee;
    private double service_fee;
    private double total_fee;
    private Date created_at;
    private Date updated_at;

    public ServiceFee() {
    }

    public ServiceFee(int id, int apartment_id, Date month, double water_fee, double parking_fee, double service_fee, double total_fee, Date created_at, Date updated_at) {
        this.id = id;
        this.apartment_id = apartment_id;
        this.month = month;
        this.water_fee = water_fee;
        this.parking_fee = parking_fee;
        this.service_fee = service_fee;
        this.total_fee = total_fee;
        this.created_at = created_at;
        this.updated_at = updated_at;
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

    public Date getMonth() {
        return month;
    }

    public void setMonth(Date month) {
        this.month = month;
    }

    public double getWater_fee() {
        return water_fee;
    }

    public void setWater_fee(double water_fee) {
        this.water_fee = water_fee;
    }

    public double getParking_fee() {
        return parking_fee;
    }

    public void setParking_fee(double parking_fee) {
        this.parking_fee = parking_fee;
    }

    public double getService_fee() {
        return service_fee;
    }

    public void setService_fee(double service_fee) {
        this.service_fee = service_fee;
    }

    public double getTotal_fee() {
        return total_fee;
    }

    public void setTotal_fee(double total_fee) {
        this.total_fee = total_fee;
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
        return "ServiceFee{" + "id=" + id + ", apartment_id=" + apartment_id + ", month=" + month + ", water_fee=" + water_fee + ", parking_fee=" + parking_fee + ", service_fee=" + service_fee + ", total_fee=" + total_fee + ", created_at=" + created_at + ", updated_at=" + updated_at + '}';
    }  
}
