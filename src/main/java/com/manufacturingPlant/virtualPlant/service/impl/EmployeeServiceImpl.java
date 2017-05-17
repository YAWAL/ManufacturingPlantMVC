package com.manufacturingPlant.virtualPlant.service.impl;

import com.manufacturingPlant.virtualPlant.dao.api.EmployeeDAO;
import com.manufacturingPlant.virtualPlant.model.Employee;
import com.manufacturingPlant.virtualPlant.service.api.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Transactional
    public void addEmployee(String employeeId, String position, String name, String lastName, String middleName,
                            String passSeriesAndNum, String identificationNum, LocalDate birthDate, String phoneNum,
                            LocalDate joinDate, String residencePlace, String street, String buildingNum, String flatNum) {
        employeeDAO.addEmployee(new Employee(employeeId, position, name, lastName, middleName, passSeriesAndNum,
                identificationNum, birthDate, phoneNum, joinDate, residencePlace, street, buildingNum, flatNum));
    }

    @Transactional
    public void updateEmployee(String employeeId, String position, String name, String lastName, String middleName,
                               String passSeriesAndNum, String identificationNum, LocalDate birthDate, String phoneNum,
                               LocalDate joinDate, String residencePlace, String street, String buildingNum, String flatNum) {
        employeeDAO.updateEmployee(new Employee(employeeId, position, name, lastName, middleName, passSeriesAndNum,
                identificationNum, birthDate, phoneNum, joinDate, residencePlace, street, buildingNum, flatNum));
    }

    @Transactional
    public List<Employee> showAllEmployees() {
        return employeeDAO.showAllEmployees();
    }

    @Transactional
    public List<Employee> showEmployeesByPosition(String position) {
        return employeeDAO.showEmployeesByPosition(position);
    }

    @Transactional
    public void deleteEmployee(String employeeId) {

    }
}
