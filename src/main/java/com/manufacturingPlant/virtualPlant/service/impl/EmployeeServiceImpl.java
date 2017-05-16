package com.manufacturingPlant.virtualPlant.service.impl;

import com.manufacturingPlant.virtualPlant.model.Employee;
import com.manufacturingPlant.virtualPlant.service.api.EmployeeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Transactional
    public void addEmployee(Employee employee) {

    }

    @Transactional
    public void updateEmployee(Employee employee) {

    }

    @Transactional
    public List<Employee> showAllEmployees() {
        return null;
    }

    @Transactional
    public List<Employee> showEmployeesByPosition(String position) {
        return null;
    }

    @Transactional
    public void deleteEmployee(Employee employee) {

    }
}
