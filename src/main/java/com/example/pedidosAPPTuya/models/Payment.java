package com.example.pedidosAPPTuya.models;

import com.example.pedidosAPPTuya.Helpers.Enums.PaymentEnum;
import com.example.pedidosAPPTuya.Helpers.Enums.PaymentEnumStatus;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

public class Payment {
    private Integer paymentId;
    private PaymentEnum paymentMethod;
    private PaymentEnumStatus paymenStatus;
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
