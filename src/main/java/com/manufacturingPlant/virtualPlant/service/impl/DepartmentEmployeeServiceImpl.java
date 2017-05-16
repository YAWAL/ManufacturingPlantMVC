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
    public void addDepartmentEmployee(DepartmentEmployee departmentEmployee) {

    }

    @Transactional
    public void updateDepartmentEmployee(DepartmentEmployee departmentEmployee) {

    }

    @Transactional
    public List<DepartmentEmployee> showAllDepartmentEmployees() {
        return null;
    }

    @Transactional
    public List<DepartmentEmployee> showDepartmentEmployeesByDepartment(String departmentName) {
        return null;
    }

    @Transactional
    public void deleteDepartmentEmployee(DepartmentEmployee departmentEmployee) {

    }
}
