package com.course.syntax;

import java.util.ArrayList;

public class User {
    int id;
    String firstName;
    String lastName;
    String fullName;
    String email;
    String phoneNumber;
    Address billingAddress;
    Address deliveryAddress;;
    ArrayList<String> cards;
    Role role;
    String manager;
    int userID = 1;

    public User(String firstName, String lastName, String email, Role role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.role = role;
        this.fullName = firstName + " " + lastName;
        this.id = userID;
        userID++;
    }

    public User(String fullName, String email, Role role) {
        this.fullName = fullName;
        this.email = email;
        this.role = role;
        this.id = userID;
        userID++;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.startsWith("+")) {
            this.phoneNumber = phoneNumber;
        }
        else {
            System.out.println("Phone number must starts from + symbol");
        }
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void setCard(String card) {
        this.cards.add(card);
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public ArrayList<String> getCards() {
        return cards;
    }

    public Role getRole() {
        return role;
    }

    public String getManager() {
        return manager;
    }

    @Override
    public String toString() {
        return "User{" +
//                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", billingAddress='" + billingAddress + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
//                ", cards=" + cards +
                ", role='" + role + '\'' +
//                ", manager='" + manager + '\'' +
                '}';
    }

    public void printUserInfo() {
        System.out.println(toString());
    }
}




