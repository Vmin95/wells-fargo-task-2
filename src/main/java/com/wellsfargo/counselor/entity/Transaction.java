package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Transaction {

    @Id
    @GeneratedValue
    private long transactionId;

    @Column(nullable = false)
    private String transactionType;

    @Column(nullable = false)
    private String transactionDate;

    @Column(nullable = false)
    private double amount;

    @Column(nullable = false)
    private double quantity;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Account account;

    @ManyToOne
    @JoinColumn(nullable = false)
    private InvestmentProduct product;

    protected Transaction() {}

    public Transaction(String transactionType, String transactionDate, double amount, double quantity, Account account, InvestmentProduct product) {
        this.transactionType = transactionType;
        this.transactionDate = transactionDate;
        this.amount = amount;
        this.quantity = quantity;
        this.account =account;
        this.product = product;
    }

    public long getTransactionId() {
        return transactionId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
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
