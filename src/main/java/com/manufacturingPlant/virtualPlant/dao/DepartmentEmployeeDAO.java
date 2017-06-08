package com.manufacturingPlant.virtualPlant.dao;

import com.manufacturingPlant.virtualPlant.model.DepartmentEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentEmployeeDAO extends JpaRepository<DepartmentEmployee, Integer> {

    public void addDepartmentEmployee(DepartmentEmployee departmentEmployee);

    public void updateDepartmentEmployee(DepartmentEmployee departmentEmployee);

    public List<DepartmentEmployee> showAllDepartmentEmployees();

    public List<DepartmentEmployee> showDepartmentEmployeesByDepartment(String departmentName);

    public void deleteDepartmentEmployee(DepartmentEmployee departmentEmployee);

}
