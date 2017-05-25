package com.manufacturingPlant.virtualPlant.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "tools")
public class Tool {

    private int id;

    private String inventoryNum;

    private String name;

    private String description;

    private String workshopName; // FR to workshops

    private LocalDate startDate;

    private String productionYear; // or LocalDate

    private String manufacturerName;

    private String vendorName;

    private int price;


}
