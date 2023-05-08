package com.course.syntax;

public class Cards {
    private int id;
    private String number;
    private String expireDate;
    private String cvv;
    private String cardType;
    private int userID = 1;

    public Cards(int id, String number,String expireDate, String cvv, String cardType) {
        this.id = id;
        this.number = number;
        this.expireDate = expireDate;
        this.cvv = cvv;
        this.cardType = cardType;
        userID++;
    }

    public String getNumber() {
        return number;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public String getCvv() {
        return cvv;
    }

    public String getCardType() {
        return cardType;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    @Override
    public String toString() {
        return "Cards{" +
                ", number='" + number + '\'' +
                ", expireDate='" + expireDate + '\'' +
                ", cvv='" + cvv + '\'' +
                ", cardType='" + cardType + '\'' +
                ", userID=" + userID +
                '}';
    }
}

