package com.course.syntax;

public class Address {
    int id;
    String country;
    String city;
    String street;
    String building;
    String room;
    String zip_code;
    int userID = 1;

    public Address(String country, String city, String street, String building, String zip_code) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.building =  building;
        this.zip_code = zip_code;
        this.id = userID;
        userID++;
    }

    public int getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getBuilding() {
        return building;
    }

    public String getRoom() {
        return room;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

}
