package com.example.casestudyfullstack.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "continents")
@Data
public class Continent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "continent_id")
    private int continentId;

    @Column(name = "name")
    private String name;
}