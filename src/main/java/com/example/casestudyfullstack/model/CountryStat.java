package com.example.casestudyfullstack.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "country_stats")
@Data
public class CountryStat implements Serializable {

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