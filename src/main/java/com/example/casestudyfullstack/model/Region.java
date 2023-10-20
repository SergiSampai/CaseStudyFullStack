package com.example.casestudyfullstack.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "regions")
@Data
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "region_id")
    private int regionId;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "continent_id")
    private Continent continent;
}