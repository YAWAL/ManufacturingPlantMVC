package com.manufacturingPlant.virtualPlant.dao.api;

import com.manufacturingPlant.virtualPlant.model.DepartmentEmployee;

import java.util.List;

/**
 * Created by VYA on 11.05.2017.
 */
public interface DepartmentEmployeeDAO {

    public void addDepartmentEmployee(DepartmentEmployee departmentEmployee);

    public void updateDepartmentEmployee(DepartmentEmployee departmentEmployee);

    public List<DepartmentEmployee> showAllDepartmentEmployees();

    public List<DepartmentEmployee> showDepartmentEmployeesByDepartment(String departmentName);

    public void deleteDepartmentEmployee(DepartmentEmployee departmentEmployee);

}
