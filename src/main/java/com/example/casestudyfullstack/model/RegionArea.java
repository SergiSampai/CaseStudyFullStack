package com.example.casestudyfullstack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "region_areas")
public class RegionArea {

    @Id
    @Column(name = "region_name")
    private String regionName;

    @Column(name = "region_area")
    private double regionArea;
}