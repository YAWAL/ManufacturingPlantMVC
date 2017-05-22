package com.manufacturingPlant.virtualPlant.model;

import java.util.ArrayList;

/**
 * Created by VYA on 22.05.2017.
 */
public class Department {

    private int id;

    private String departmentId;

    private String departmentName;

    private String chairmanEmployeeId; // FK to workshop_employees 'one-to-one'

    private ArrayList<DepartmentEmployee> departmentEmployees;//FK to workshop_employees 'many-to-one'

    private int departmentEmployeeQuantity;// do not include to constructor

//    private ArrayList<NonProductionEquipment> nonProductionEquipment;

}
