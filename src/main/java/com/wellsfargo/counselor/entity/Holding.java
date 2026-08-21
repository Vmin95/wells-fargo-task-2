package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Holding {

    @Id
    @GeneratedValue
    private long holdingId;

    @Column(nullable = false)
    private double quantity;

    @Column(nullable = false)
    private double costBasis;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Account account;

    @ManyToOne
    @JoinColumn(nullable = false)
    private InvestmentProduct product;

    protected Holding() {}

    public Holding(double quantity, double costBasis, Account account, InvestmentProduct product) {
      this.quantity = quantity;
      this.costBasis = costBasis;
      this.account = account;
      this.product =product;
    }

    public long getHoldingId() {
        return holdingId;
    }
    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getCostBasis() {
        return costBasis;
    }

    public void setCostBasis(double costBasis) {
        this.costBasis = costBasis;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public InvestmentProduct getProduct() {
        return product;
    }

    public void setProduct(InvestmentProduct product) {
        this.product = product;
    }
}
