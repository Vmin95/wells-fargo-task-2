package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Account {
    @Id
    @GeneratedValue
    private long accountId;

    @Column(nullable = false)
    private String accountType;

    @Column(nullable = false)
    private String openedDate;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Customer customer;

    protected Account() {}

    public Account(String accountType, String openedDate, Customer customer) {
        this.accountType = accountType;
        this.openedDate = openedDate;
        this.customer = customer;
    }

    public long getAccountId() {
        return accountId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getOpenedDate() {
        return openedDate;
    }

    public void setOpenedDate(String openedDate) {
        this.openedDate = openedDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
