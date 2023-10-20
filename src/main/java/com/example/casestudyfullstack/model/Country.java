package com.example.casestudyfullstack.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "countries")
@Data
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id")
    private int countryId;

    @Column(name = "name")
    private String name;

    @Column(name = "area")
    private double area;

    @Column(name = "national_day")
    private Date nationalDay;

    @Column(name = "country_code2")
    private String countryCode2;

    @Column(name = "country_code3")
    private String countryCode3;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;

}