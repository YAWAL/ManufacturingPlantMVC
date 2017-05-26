package com.manufacturingPlant.virtualPlant.dao.api;

import com.manufacturingPlant.virtualPlant.model.WorkshopEmployee;

import java.util.List;

public interface WorkshopEmployeeDAO {

    public void addWorkshopEmployee(WorkshopEmployee workshopEmployee);

    public void updateWorkshopEmployee(WorkshopEmployee workshopEmployee);

    public List<WorkshopEmployee> showAllWorkshopEmployees();

    public List<WorkshopEmployee> showWorkshopEmployeesByWorkshop(String workshopName);

    public void deleteWorkshopEmployee(WorkshopEmployee workshopEmployee);

}
