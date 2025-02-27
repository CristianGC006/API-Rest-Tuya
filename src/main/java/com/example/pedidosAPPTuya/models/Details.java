package com.example.pedidosAPPTuya.models;

import jakarta.persistence.criteria.CriteriaBuilder;

public class Details {
    private Integer detailsId;
    private Integer amountItem;
    private Double subTotalItem;

    public Details() {
    }

    public Details(Integer detailsId, Integer amountItem, Double subTotalItem) {
        this.detailsId = detailsId;
        this.amountItem = amountItem;
        this.subTotalItem = subTotalItem;
    }

    public Integer getDetailsId() {
        return detailsId;
    }

    public void setDetailsId(Integer detailsId) {
        this.detailsId = detailsId;
    }

    public Integer getAmountItem() {
        return amountItem;
    }

    public void setAmountItem(Integer amountItem) {
        this.amountItem = amountItem;
    }

    public Double getSubTotalItem() {
        return subTotalItem;
    }

    public void setSubTotalItem(Double subTotalItem) {
        this.subTotalItem = subTotalItem;
    }
}
