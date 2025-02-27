package com.example.pedidosAPPTuya.models;

import java.time.LocalDate;

public class Address {
    private LocalDate paymentDate;
    private Integer addressId;

    private String addresStreet;

    private String addressCity;

    private String addressPostalCode;

    private String addressCountry;

    public Address() {
    }

    public Address(LocalDate paymentDate, Integer addressId, String addresStreet, String addressCity, String addressPostalCode, String addressCountry) {
        this.paymentDate = paymentDate;
        this.addressId = addressId;
        this.addresStreet = addresStreet;
        this.addressCity = addressCity;
        this.addressPostalCode = addressPostalCode;
        this.addressCountry = addressCountry;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getAddresStreet() {
        return addresStreet;
    }

    public void setAddresStreet(String addresStreet) {
        this.addresStreet = addresStreet;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressPostalCode() {
        return addressPostalCode;
    }

    public void setAddressPostalCode(String addressPostalCode) {
        this.addressPostalCode = addressPostalCode;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }
}
