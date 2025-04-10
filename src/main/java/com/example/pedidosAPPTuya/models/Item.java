package com.example.pedidosAPPTuya.models;

import jakarta.persistence.*;

@Entity
@Table(name="item_table")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Integer itemId;
    @Column(name = "item_name",length = 100,nullable = false)
    private String itemName;
    @Column(name = "item_price",nullable = false)
    private Double itemPrice;
    @Column(name = "item_description",length =400,nullable = false)
    private String itemDescription;

    @ManyToOne
    @JoinColumn(name = "fk_store", referencedColumnName = "store_id")
    //@JsonBackReference(value = "store")
    private Store store;

    @ManyToOne
    @JoinColumn(name = "fk_details", referencedColumnName = "details_id")
    //@JsonBackReference(value = "details")
    private Details details;

    public Item() {
    }

    public Item(Integer itemId, String itemName, Double itemPrice, String itemDescription) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemDescription = itemDescription;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
}
