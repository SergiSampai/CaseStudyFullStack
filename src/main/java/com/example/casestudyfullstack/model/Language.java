package com.example.casestudyfullstack.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "languages")
@Data
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "language_id")
    private int languageId;

    @Column(name = "language")
    private String language;
}