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
    private boolean is_paid;
    private Date payment_date;

    public ServiceFee() {
    }

    public ServiceFee(int id, int apartment_id, Date month, double water_fee, double parking_fee, double service_fee, double total_fee, boolean is_paid, Date payment_date) {
        this.id = id;
        this.apartment_id = apartment_id;
        this.month = month;
        this.water_fee = water_fee;
        this.parking_fee = parking_fee;
        this.service_fee = service_fee;
        this.total_fee = total_fee;
        this.is_paid = is_paid;
        this.payment_date = payment_date;
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

    public boolean isIs_paid() {
        return is_paid;
    }

    public void setIs_paid(boolean is_paid) {
        this.is_paid = is_paid;
    }

    public Date getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(Date payment_date) {
        this.payment_date = payment_date;
    }

    @Override
    public String toString() {
        return "ServiceFee{" + "id=" + id + ", apartment_id=" + apartment_id + ", month=" + month + ", water_fee=" + water_fee + ", parking_fee=" + parking_fee + ", service_fee=" + service_fee + ", total_fee=" + total_fee + ", is_paid=" + is_paid + ", payment_date=" + payment_date + '}';
    }   
}
