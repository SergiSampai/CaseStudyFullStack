package com.example.casestudyfullstack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "guests")
public class Guest {

    @Id
    @Column(name = "guest_id")
    private int guestId;

    @Column(name = "name")
    private String name;
}