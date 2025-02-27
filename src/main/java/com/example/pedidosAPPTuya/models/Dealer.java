package com.example.pedidosAPPTuya.models;

import jakarta.persistence.criteria.CriteriaBuilder;

public class Dealer {
    private Integer dealerId;
    private String dealerName;
    private String dealerPhoneNumber;
    private String dealerEmail;
    private String dealerVehicle;


    public Dealer() {
    }

    public Dealer(Integer dealerId, String dealerName, String dealerPhoneNumber, String dealerEmail, String dealerVehicle) {
        this.dealerId = dealerId;
        this.dealerName = dealerName;
        this.dealerPhoneNumber = dealerPhoneNumber;
        this.dealerEmail = dealerEmail;
        this.dealerVehicle = dealerVehicle;
    }

    public Integer getDealerId() {
        return dealerId;
    }

    public void setDealerId(Integer dealerId) {
        this.dealerId = dealerId;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public String getDealerPhoneNumber() {
        return dealerPhoneNumber;
    }

    public void setDealerPhoneNumber(String dealerPhoneNumber) {
        this.dealerPhoneNumber = dealerPhoneNumber;
    }

    public String getDealerEmail() {
        return dealerEmail;
    }

    public void setDealerEmail(String dealerEmail) {
        this.dealerEmail = dealerEmail;
    }

    public String getDealerVehicle() {
        return dealerVehicle;
    }

    public void setDealerVehicle(String dealerVehicle) {
        this.dealerVehicle = dealerVehicle;
    }
}
