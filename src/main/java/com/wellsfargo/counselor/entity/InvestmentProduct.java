package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class InvestmentProduct {

    @Id
    @GeneratedValue
    private long productId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private String tickerSymbol;

    protected InvestmentProduct() {}

    public InvestmentProduct(String name, String type, String tickerSymbol) {
        this.name = name;
        this.type = type;
        this.tickerSymbol = tickerSymbol;
    }

    public long getProductId() {
        return productId;
    }

     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }
}
