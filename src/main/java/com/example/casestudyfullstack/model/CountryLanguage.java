package com.example.casestudyfullstack.model;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "country_languages")
@Data
public class CountryLanguage implements Serializable {

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