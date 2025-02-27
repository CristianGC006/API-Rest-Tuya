package com.example.pedidosAPPTuya.models;

import com.example.pedidosAPPTuya.Helpers.Enums.DeliveryEnum;

import java.time.LocalDate;

public class Delivery {
    private Integer deliveryId;
    private DeliveryEnum StatusDelivery;

    private LocalDate deliveryDate;

    private Double totalDelivery;

    public Delivery() {
    }

    public Delivery(Integer deliveryId, DeliveryEnum statusDelivery, LocalDate deliveryDate, Double totalDelivery) {
        this.deliveryId = deliveryId;
        StatusDelivery = statusDelivery;
        this.deliveryDate = deliveryDate;
        this.totalDelivery = totalDelivery;
    }

    public Integer getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Integer deliveryId) {
        this.deliveryId = deliveryId;
    }

    public DeliveryEnum getStatusDelivery() {
        return StatusDelivery;
    }

    public void setStatusDelivery(DeliveryEnum statusDelivery) {
        StatusDelivery = statusDelivery;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Double getTotalDelivery() {
        return totalDelivery;
    }

    public void setTotalDelivery(Double totalDelivery) {
        this.totalDelivery = totalDelivery;
    }
}
