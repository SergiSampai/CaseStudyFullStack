package com.example.casestudyfullstack.model;

import javax.persistence.*;

@Entity
@Table(name = "country_stats")
public class CountryStat {

    @Id
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @Id
    @Column(name = "year")
    private int year;

    @Column(name = "population")
    private int population;

    @Column(name = "gdp")
    private long gdp;
}