package com.example.pedidosAPPTuya.models;

import com.example.pedidosAPPTuya.Helpers.Enums.StatusOrder;
import jakarta.persistence.*;
import jakarta.websocket.ClientEndpoint;

import java.time.LocalDate;
import java.util.EnumMap;
@Entity
@Table(name = "orders_table")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "order_id")
    private Integer orderId;
    @Column(name = "status_order",nullable = false)
    private StatusOrder statusOrder;
    @Column(name = "order_date",nullable = false)
    private LocalDate orderDate;
    @Column(name = "total_order",nullable = false)
    private Double totalOrder;

    public Order() {
    }

    public Order(Integer orderId, StatusOrder statusOrder, LocalDate orderDate, Double totalOrder) {
        this.orderId = orderId;
        this.statusOrder = statusOrder;
        this.orderDate = orderDate;
        this.totalOrder = totalOrder;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public StatusOrder getStatusOrder() {
        return statusOrder;
    }

    public void setStatusOrder(StatusOrder statusOrder) {
        this.statusOrder = statusOrder;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public Double getTotalOrder() {
        return totalOrder;
    }

    public void setTotalOrder(Double totalOrder) {
        this.totalOrder = totalOrder;
    }
}
