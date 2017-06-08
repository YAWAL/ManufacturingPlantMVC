package com.manufacturingPlant.virtualPlant.dao;

import com.manufacturingPlant.virtualPlant.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeDAO extends JpaRepository<Employee, Integer>{

    public void addEmployee(Employee employee);

    public void updateEmployee(Employee employee);

    public List<Employee> showAllEmployees();

    public List<Employee> showEmployeesByPosition(String position);

    public void deleteEmployee(Employee employee);

}
