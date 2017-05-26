package com.manufacturingPlant.virtualPlant.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tools")
public class Tool {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String inventoryNum;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private String workshopName; // FR to workshops

    @Column
    private LocalDate startDate;

    @Column
    private String productionYear; // or LocalDate

    @Column
    private String manufacturerName;

    @Column
    private String vendorName;

    @Column
    private int price;


}
