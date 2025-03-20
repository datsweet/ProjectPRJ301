/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author GIGABYTE
 */
public class Apartment {
    private int id;
    private String apartment_number;
    private String building_name;
    private int floor_number;
    private String street_address;
    private String district;
    private String city;

    public Apartment() {
    }

    public Apartment(int id, String apartment_number, String building_name, int floor_number, String street_address, String district, String city) {
        this.id = id;
        this.apartment_number = apartment_number;
        this.building_name = building_name;
        this.floor_number = floor_number;
        this.street_address = street_address;
        this.district = district;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApartment_number() {
        return apartment_number;
    }

    public void setApartment_number(String apartment_number) {
        this.apartment_number = apartment_number;
    }

    public String getBuilding_name() {
        return building_name;
    }

    public void setBuilding_name(String building_name) {
        this.building_name = building_name;
    }

    public int getFloor_number() {
        return floor_number;
    }

    public void setFloor_number(int floor_number) {
        this.floor_number = floor_number;
    }

    public String getStreet_address() {
        return street_address;
    }

    public void setStreet_address(String street_address) {
        this.street_address = street_address;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Apartment{" + "id=" + id + ", apartment_number=" + apartment_number + ", building_name=" + building_name + ", floor_number=" + floor_number + ", street_address=" + street_address + ", district=" + district + ", city=" + city + '}';
    }    
}
