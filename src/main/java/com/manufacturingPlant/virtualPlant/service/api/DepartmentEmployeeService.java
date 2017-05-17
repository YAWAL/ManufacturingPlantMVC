package com.manufacturingPlant.virtualPlant.service.api;

import com.manufacturingPlant.virtualPlant.model.DepartmentEmployee;

import java.util.List;

/**
 * Created by VYA on 13.05.2017.
 */
public interface DepartmentEmployeeService {

    public void addDepartmentEmployee(String employeeId, int salary, String departmentName);

    public void updateDepartmentEmployee(String employeeId, int salary, String departmentName);

    public List<DepartmentEmployee> showAllDepartmentEmployees();

    public List<DepartmentEmployee> showDepartmentEmployeesByDepartment(String departmentName);

    public void deleteDepartmentEmployee(String employeeId);
}
