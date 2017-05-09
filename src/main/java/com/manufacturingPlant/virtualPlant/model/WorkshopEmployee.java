package com.manufacturingPlant.virtualPlant.model;

import javax.persistence.*;

/**
 * Created by VYA on 08.05.2017.
 */
@Entity
@Table(name = "workshop_employees")
public class WorkshopEmployee {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "employee_id")//FK TO employees
    private int employeeId;

    @Column(name = "workshop_employee_id")
    private String workshopEmployeeId;

    @Column(name = "salary")
    private int salary;

    @Column(name = "workshop_name") // FK TO workshops
    private String WorkshopName;

    public int getId() {
        return id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getWorkshopEmployeeId() {
        return workshopEmployeeId;
    }

    public void setWorkshopEmployeeId(String workshopEmployeeId) {
        this.workshopEmployeeId = workshopEmployeeId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getWorkshopName() {
        return WorkshopName;
    }

    public void setWorkshopName(String workshopName) {
        this.WorkshopName = workshopName;
    }


}
