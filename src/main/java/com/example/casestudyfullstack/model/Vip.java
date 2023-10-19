package com.example.casestudyfullstack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vips")
public class Vip {

    @Id
    @Column(name = "vip_id")
    private int vipId;

    @Column(name = "name")
    private String name;
}