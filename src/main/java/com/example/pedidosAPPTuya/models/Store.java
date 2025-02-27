package com.example.pedidosAPPTuya.models;

public class Store {
    private Integer storeId;
    private String storeName;
    private String storeAddres;
    private String storePhoneNumber;
    private String storeCategory;

    public Store() {
    }

    public Store(Integer storeId, String storeName, String storeAddres, String storePhoneNumber, String storeCategory) {
        this.storeId = storeId;
        this.storeName = storeName;
        this.storeAddres = storeAddres;
        this.storePhoneNumber = storePhoneNumber;
        this.storeCategory = storeCategory;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreAddres() {
        return storeAddres;
    }

    public void setStoreAddres(String storeAddres) {
        this.storeAddres = storeAddres;
    }

    public String getStorePhoneNumber() {
        return storePhoneNumber;
    }

    public void setStorePhoneNumber(String storePhoneNumber) {
        this.storePhoneNumber = storePhoneNumber;
    }

    public String getStoreCategory() {
        return storeCategory;
    }

    public void setStoreCategory(String storeCategory) {
        this.storeCategory = storeCategory;
    }
}
