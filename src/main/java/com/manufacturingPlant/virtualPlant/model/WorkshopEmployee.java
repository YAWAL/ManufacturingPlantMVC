package com.manufacturingPlant.virtualPlant.model;

import javax.persistence.*;

@Entity
@Table(name = "workshop_employees")
public class WorkshopEmployee {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "employee_id", columnDefinition = "char(13)")//FK TO employees
    @OneToOne(fetch = FetchType.LAZY)
    private String employeeId;

    @Column(name = "salary")
    private int salary;

    @Column(name = "workshop_name",  columnDefinition = "char(13)") // FK TO workshops
    private String WorkshopName;

    public WorkshopEmployee() {
    }

    public WorkshopEmployee(String employeeId, int salary, String workshopName) {
        this.employeeId = employeeId;
        this.salary = salary;
        WorkshopName = workshopName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WorkshopEmployee that = (WorkshopEmployee) o;

        if (id != that.id) return false;
        if (salary != that.salary) return false;
        if (!employeeId.equals(that.employeeId)) return false;
        return WorkshopName.equals(that.WorkshopName);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + employeeId.hashCode();
        result = 31 * result + salary;
        result = 31 * result + WorkshopName.hashCode();
        return result;
    }
}
