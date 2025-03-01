package com.example.pedidosAPPTuya.models;

import com.example.pedidosAPPTuya.Helpers.Enums.PaymentEnum;
import com.example.pedidosAPPTuya.Helpers.Enums.PaymentEnumStatus;
import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
@Entity
@Table(name = "payment_table")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private Integer paymentId;
    @Column(name = "payment_method",nullable = false)
    private PaymentEnum paymentMethod;
    @Column(name = "payment_status",nullable = false)
    private PaymentEnumStatus paymenStatus;
    @Column(name = "payment_date",nullable = false)
    private LocalDate paymenDate;

    public Payment() {
    }

    public Payment(Integer paymentId, PaymentEnum paymentMethod, PaymentEnumStatus paymenStatus, LocalDate paymenDate) {
        this.paymentId = paymentId;
        this.paymentMethod = paymentMethod;
        this.paymenStatus = paymenStatus;
        this.paymenDate = paymenDate;
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public PaymentEnum getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentEnum paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public PaymentEnumStatus getPaymenStatus() {
        return paymenStatus;
    }

    public void setPaymenStatus(PaymentEnumStatus paymenStatus) {
        this.paymenStatus = paymenStatus;
    }

    public LocalDate getPaymenDate() {
        return paymenDate;
    }

    public void setPaymenDate(LocalDate paymenDate) {
        this.paymenDate = paymenDate;
    }
}
