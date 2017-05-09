package com.manufacturingPlant.virtualPlant.model;

import javax.persistence.*;

/**
 * Created by VYA on 08.05.2017.
 */
@Entity
@Table(name = "department_employees")
public class DepartmentEmployee {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "employee_id")//FK TO employees
    private int employeeId;

    @Column(name = "department_employee_id")
    private String departmentEmployeeId;

    @Column(name = "salary")
    private int salary;

    @Column(name = "department_name")// FK TO departments
    private String departmentName;

    public int getId() {
        return id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getDepartmentEmployeeId() {
        return departmentEmployeeId;
    }

    public void setDepartmentEmployeeId(String departmentEmployeeId) {
        this.departmentEmployeeId = departmentEmployeeId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

}
