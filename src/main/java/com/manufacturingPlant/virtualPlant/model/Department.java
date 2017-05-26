package com.manufacturingPlant.virtualPlant.model;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "departments")
public class Department {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String departmentId;

    @Column
    private String departmentName;

    @Column
    private String chairmanEmployeeId; // FK to workshop_employees 'one-to-one'

    @Column
    private ArrayList<DepartmentEmployee> departmentEmployees;//FK to workshop_employees 'many-to-one'

    @Column
    private int departmentEmployeeQuantity;// do not include to constructor

//    private ArrayList<NonProductionEquipment> nonProductionEquipment;

}
