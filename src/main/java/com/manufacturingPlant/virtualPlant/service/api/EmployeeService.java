package com.manufacturingPlant.virtualPlant.service.api;

import com.manufacturingPlant.virtualPlant.model.Employee;

import java.util.List;

/**
 * Created by VYA on 13.05.2017.
 */
public interface EmployeeService {

    public void addEmployee(Employee employee);

    public void updateEmployee(Employee employee);

    public List<Employee> showAllEmployees();

    public List<Employee> showEmployeesByPosition(String position);

    public void deleteEmployee(Employee employee);
}
