package com.manufacturingPlant.virtualPlant.model;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "workshops")
public class Workshop {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "workshop_id")
    private String workshopId;

    @Column
    private String workshopName;

    @Column
    private String chairmanEmployeeId; // FK to workshop_employees 'one-to-one'

    @Column
    private ArrayList<WorkshopEmployee> workshopEmployees;//FK to workshop_employees 'many-to-one'

    @Column
    private int workshopEmployeeQuantity;// do not include to constructor

    @Column
    private ArrayList<ProductionEquipment> productionEquipment;

    @Column
    private ArrayList<NonProductionEquipment> nonProductionEquipment;

    @Column
    private ArrayList<Tool> tools;

    @Column
    private ArrayList<Material> materials;



}
