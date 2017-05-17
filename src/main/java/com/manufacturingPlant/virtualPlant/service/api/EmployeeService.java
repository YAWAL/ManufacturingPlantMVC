package com.manufacturingPlant.virtualPlant.service.api;

import com.manufacturingPlant.virtualPlant.model.Employee;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by VYA on 13.05.2017.
 */
public interface EmployeeService {

    public void addEmployee(String employeeId, String position, String name, String lastName, String middleName,
                            String passSeriesAndNum, String identificationNum, LocalDate birthDate, String phoneNum,
                            LocalDate joinDate, String residencePlace, String street, String buildingNum, String flatNum);

    public void updateEmployee(String employeeId, String position, String name, String lastName, String middleName,
                               String passSeriesAndNum, String identificationNum, LocalDate birthDate, String phoneNum,
                               LocalDate joinDate, String residencePlace, String street, String buildingNum, String flatNum);

    public List<Employee> showAllEmployees();

    public List<Employee> showEmployeesByPosition(String position);

    public void deleteEmployee(String employeeId);
}
