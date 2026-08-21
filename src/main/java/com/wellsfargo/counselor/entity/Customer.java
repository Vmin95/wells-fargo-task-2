package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Customer {

@Id
@GeneratedValue
private long customerId;

@Column(nullable = false)
private String firstName;

@Column(nullable = false)
private String lastName;

@Column(nullable = false)
private String email;

@ManyToOne
@JoinColumn(nullable = false)
    private Advisor advisor;

protected Customer() {}

    public Customer(String firstName, String lastName, String email, Advisor advisor) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.advisor = advisor;
    }

    public long getCustomerId() {
    return customerId;
}

    public String getFirstName() {
    return firstName;
 }

    public void setFirstName(String firstName) {
            this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Advisor getAdvisor() {
    return advisor;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }
}

