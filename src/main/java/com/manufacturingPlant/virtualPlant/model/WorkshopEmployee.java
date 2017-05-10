package com.manufacturingPlant.virtualPlant.model;

import javax.persistence.*;

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

    public WorkshopEmployee() {
    }

    public WorkshopEmployee(int employeeId, String workshopEmployeeId, int salary, String workshopName) {
        this.employeeId = employeeId;
        this.workshopEmployeeId = workshopEmployeeId;
        this.salary = salary;
        WorkshopName = workshopName;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WorkshopEmployee that = (WorkshopEmployee) o;

        if (id != that.id) return false;
        if (employeeId != that.employeeId) return false;
        if (salary != that.salary) return false;
        if (!workshopEmployeeId.equals(that.workshopEmployeeId)) return false;
        return WorkshopName.equals(that.WorkshopName);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + employeeId;
        result = 31 * result + workshopEmployeeId.hashCode();
        result = 31 * result + salary;
        result = 31 * result + WorkshopName.hashCode();
        return result;
    }

}
