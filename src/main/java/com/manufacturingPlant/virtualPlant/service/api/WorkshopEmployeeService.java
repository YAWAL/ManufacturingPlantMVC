package com.manufacturingPlant.virtualPlant.service.api;

import com.manufacturingPlant.virtualPlant.model.WorkshopEmployee;

import java.util.List;

/**
 * Created by VYA on 13.05.2017.
 */
public interface WorkshopEmployeeService {

    public void addWorkshopEmployee(WorkshopEmployee workshopEmployee);

    public void updateWorkshopEmployee(WorkshopEmployee workshopEmployee);

    public List<WorkshopEmployee> showAllWorkshopEmployees();

    public List<WorkshopEmployee> showWorkshopEmployeesByWorkshop(String workshopName);

    public void deleteWorkshopEmployee(WorkshopEmployee workshopEmployee);
}
