package com.manufacturingPlant.virtualPlant.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;

@Entity
@Table(name = "workshops")
public class Workshop {

    private int id;

    private String workshopId;

    private String workshopName;

    private String chairmanEmployeeId; // FK to workshop_employees 'one-to-one'

    private ArrayList<WorkshopEmployee> workshopEmployees;//FK to workshop_employees 'many-to-one'

    private int workshopEmployeeQuantity;// do not include to constructor

//    private ArrayList<ProductionEquipment> productionEquipment;

//    private ArrayList<NonProductionEquipment> nonProductionEquipment;

//    private ArrayList<Tool> tools;
//
//    private ArrayList<Material> materials;



}
