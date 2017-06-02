package com.manufacturingPlant.virtualPlant.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "equipments")
public class Equipment {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "inventory_num")
    private String inventoryNum;

    @Column(name = "name_")
    private String name;

    @Column(name = "start_name")
    private LocalDate startDate;

    @Column(name = "weight")
    private String weight;

    @Column(name = "sizes")
    private String sizes;

    @Column(name = "production_year")
    private LocalDate productionYear;

    @Column(name = "manufacturer_name")
    private String manufacturerName;

    @Column(name = "vendor_name")
    private String vendorName;

    @Column(name = "price")
    private int price;
}
