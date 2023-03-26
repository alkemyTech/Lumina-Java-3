package com.alkemy.wallet.models;


import javax.persistence.*;

import antlr.collections.List;

@Entity
//Anotacion para el nombre de la talba "Roles"
@Table(name = "fixed_term_deposits")

public class FixedTermDepositModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;

    @Column(nullable = false)
    private double amount;
    @Column(nullable = false)
    private double interest;

    private long creationDate;
    private long updateDate;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_account", nullable = false)
    private Account account;


    /* Getters and setters */
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public long getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(long creationDate) {
        this.creationDate = creationDate;
    }

    public long getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(long updateDate) {
        this.updateDate = updateDate;
    }
}
