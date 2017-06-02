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

    @Column(name = "department_id")
    private String departmentId;

    @Column(name = "department_name")
    private String departmentName;

    @Column(name = "chairman_employee_id")
    private String chairmanEmployeeId; // FK to workshop_employees 'one-to-one'

    @Column(name = "department_employees")
    private ArrayList<DepartmentEmployee> departmentEmployees;//FK to workshop_employees 'many-to-one'

    @Column(name = "department_employee_quantity")
    private int departmentEmployeeQuantity;// do not include to constructor

    @Column(name = "nonproduction_equipments")
    private ArrayList<NonProductionEquipment> nonProductionEquipment;

    public Department() {
    }

    public Department(String departmentId, String departmentName, String chairmanEmployeeId,
                      ArrayList<DepartmentEmployee> departmentEmployees, int departmentEmployeeQuantity,
                      ArrayList<NonProductionEquipment> nonProductionEquipment) {
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

    public ArrayList<DepartmentEmployee> getDepartmentEmployees() {
        return departmentEmployees;
    }

    public void setDepartmentEmployees(ArrayList<DepartmentEmployee> departmentEmployees) {
        this.departmentEmployees = departmentEmployees;
    }

    public int getDepartmentEmployeeQuantity() {
        return departmentEmployeeQuantity;
    }

    public void setDepartmentEmployeeQuantity(int departmentEmployeeQuantity) {
        this.departmentEmployeeQuantity = departmentEmployeeQuantity;
    }

    public ArrayList<NonProductionEquipment> getNonProductionEquipment() {
        return nonProductionEquipment;
    }

    public void setNonProductionEquipment(ArrayList<NonProductionEquipment> nonProductionEquipment) {
        this.nonProductionEquipment = nonProductionEquipment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Department that = (Department) o;

        if (id != that.id) return false;
        if (departmentEmployeeQuantity != that.departmentEmployeeQuantity) return false;
        if (!departmentId.equals(that.departmentId)) return false;
        if (!departmentName.equals(that.departmentName)) return false;
        if (!chairmanEmployeeId.equals(that.chairmanEmployeeId)) return false;
        if (!departmentEmployees.equals(that.departmentEmployees)) return false;
        return nonProductionEquipment.equals(that.nonProductionEquipment);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + departmentId.hashCode();
        result = 31 * result + departmentName.hashCode();
        result = 31 * result + chairmanEmployeeId.hashCode();
        result = 31 * result + departmentEmployees.hashCode();
        result = 31 * result + departmentEmployeeQuantity;
        result = 31 * result + nonProductionEquipment.hashCode();
        return result;
    }
}
