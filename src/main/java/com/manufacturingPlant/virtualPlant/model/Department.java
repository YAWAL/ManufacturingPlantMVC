package com.manufacturingPlant.virtualPlant.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;

@Entity
@Table(name = "departments")
public class Department {

    private int id;

    private String departmentId;

    private String departmentName;

    private String chairmanEmployeeId; // FK to workshop_employees 'one-to-one'

    private ArrayList<DepartmentEmployee> departmentEmployees;//FK to workshop_employees 'many-to-one'

    private int departmentEmployeeQuantity;// do not include to constructor

//    private ArrayList<NonProductionEquipment> nonProductionEquipment;

}
