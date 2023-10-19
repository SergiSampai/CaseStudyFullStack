package com.example.casestudyfullstack.model;


import javax.persistence.*;

@Entity
@Table(name = "country_languages")
public class CountryLanguage {

    @Id
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @Id
    @ManyToOne
    @JoinColumn(name = "language_id")
    private Language language;

    @Column(name = "official")
    private boolean official;
}