package com.manufacturingPlant.virtualPlant.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "materials")
public class Material {

    private int id;

    private String name;

    private String description;

    private String standard;

    private String primarySize;

    private String productionYear;

    private String manufacturerName;

    private String vendorName;
}
