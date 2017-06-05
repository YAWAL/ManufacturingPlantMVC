package com.manufacturingPlant.virtualPlant.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String departmentId;

    @Column
    private String departmentName;

    @Column
    private String chairmanEmployeeId; // FK to workshop_employees 'one-to-one'

    @Column
    @OneToOne(mappedBy = "department")
    private List<DepartmentEmployee> departmentEmployees;//FK to workshop_employees 'many-to-one'

    @Column
    private int departmentEmployeeQuantity;// do not include to constructor

    @Column
    private List<NonProductionEquipment> nonProductionEquipment;

    public Department() {
    }

    public Department(String departmentId, String departmentName, String chairmanEmployeeId,
                      List<DepartmentEmployee> departmentEmployees, int departmentEmployeeQuantity,
                      List<NonProductionEquipment> nonProductionEquipment) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.chairmanEmployeeId = chairmanEmployeeId;
        this.departmentEmployees = departmentEmployees;
        this.departmentEmployeeQuantity = departmentEmployeeQuantity;
        this.nonProductionEquipment = nonProductionEquipment;
    }

    public int getId() {
        return id;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getChairmanEmployeeId() {
        return chairmanEmployeeId;
    }

    public void setChairmanEmployeeId(String chairmanEmployeeId) {
        this.chairmanEmployeeId = chairmanEmployeeId;
    }

    public List<DepartmentEmployee> getDepartmentEmployees() {
        return departmentEmployees;
    }

    public void setDepartmentEmployees(List<DepartmentEmployee> departmentEmployees) {
        this.departmentEmployees = departmentEmployees;
    }

    public int getDepartmentEmployeeQuantity() {
        return departmentEmployeeQuantity;
    }

    public void setDepartmentEmployeeQuantity(int departmentEmployeeQuantity) {
        this.departmentEmployeeQuantity = departmentEmployeeQuantity;
    }

    public List<NonProductionEquipment> getNonProductionEquipment() {
        return nonProductionEquipment;
    }

    public void setNonProductionEquipment(List<NonProductionEquipment> nonProductionEquipment) {
        this.nonProductionEquipment = nonProductionEquipment;
    }


}
