package com.manufacturingPlant.virtualPlant.service.impl;

import com.manufacturingPlant.virtualPlant.dao.api.DepartmentEmployeeDAO;
import com.manufacturingPlant.virtualPlant.model.DepartmentEmployee;
import com.manufacturingPlant.virtualPlant.service.api.DepartmentEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DepartmentEmployeeServiceImpl implements DepartmentEmployeeService {

    @Autowired
    private DepartmentEmployeeDAO departmentEmployeeDAO;

    @Transactional
    public void addDepartmentEmployee(String employeeId, int salary, String departmentName) {
        departmentEmployeeDAO.addDepartmentEmployee(new DepartmentEmployee(employeeId, salary, departmentName));
    }

    @Transactional
    public void updateDepartmentEmployee(String employeeId, int salary, String departmentName) {
        departmentEmployeeDAO.updateDepartmentEmployee(new DepartmentEmployee(employeeId, salary, departmentName));
    }

    @Transactional
    public List<DepartmentEmployee> showAllDepartmentEmployees() {
        return departmentEmployeeDAO.showAllDepartmentEmployees();
    }

    @Transactional
    public List<DepartmentEmployee> showDepartmentEmployeesByDepartment(String departmentName) {
        return departmentEmployeeDAO.showDepartmentEmployeesByDepartment(departmentName);
    }

    @Transactional
    public void deleteDepartmentEmployee(String employeeId) {

    }

}
