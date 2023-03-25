package com.alkemy.wallet.models;

import javax.persistence.*;

@Entity
//Anotacion para el nombre de la talba "Roles"
@Table(name = "Roles")

public class RolModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Roles name;
    private String description;
    private long creationDate;
    private long updateDate;



    public Roles getName() {
        return name;
    }

    public void setName(Roles name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
