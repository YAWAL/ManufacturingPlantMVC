package com.manufacturingPlant.virtualPlant.model;

import javax.persistence.*;

@Entity
@Table(name = "materials")
public class Material {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private String standard;

    @Column
    private String primarySize;

    @Column
    private String productionYear;

    @Column
    private String manufacturerName;

    @Column
    private String vendorName;
}
