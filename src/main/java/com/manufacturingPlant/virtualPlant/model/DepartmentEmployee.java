package com.manufacturingPlant.virtualPlant.model;

import javax.persistence.*;

@Entity
@Table(name = "department_employees")
public class DepartmentEmployee {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "employee_id")//FK TO employees
    private String employeeId;

    @Column(name = "salary")
    private int salary;

    @Column(name = "department_name")// FK TO departments
    private String departmentName;

    public DepartmentEmployee() {
    }

    public DepartmentEmployee(String employeeId, int salary, String departmentName) {
        this.employeeId = employeeId;
        this.salary = salary;
        this.departmentName = departmentName;
    }

    public int getId() {
        return id;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DepartmentEmployee that = (DepartmentEmployee) o;

        if (id != that.id) return false;
        if (salary != that.salary) return false;
        if (!employeeId.equals(that.employeeId)) return false;
        return departmentName.equals(that.departmentName);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + employeeId.hashCode();
        result = 31 * result + salary;
        result = 31 * result + departmentName.hashCode();
        return result;
    }
}
