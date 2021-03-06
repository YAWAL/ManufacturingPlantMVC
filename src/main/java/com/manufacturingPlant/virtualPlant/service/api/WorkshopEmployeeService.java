package com.manufacturingPlant.virtualPlant.service.api;

import com.manufacturingPlant.virtualPlant.model.WorkshopEmployee;

import java.util.List;

public interface WorkshopEmployeeService {

    public void addWorkshopEmployee(String employeeId, int salary, String workshopName);

    public void updateWorkshopEmployee(String employeeId, int salary, String workshopName);

    public List<WorkshopEmployee> showAllWorkshopEmployees();

    public List<WorkshopEmployee> showWorkshopEmployeesByWorkshop(String workshopName);

    public void deleteWorkshopEmployee(String employeeId);
}
