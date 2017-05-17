package com.manufacturingPlant.virtualPlant.service.impl;

import com.manufacturingPlant.virtualPlant.dao.api.WorkshopEmployeeDAO;
import com.manufacturingPlant.virtualPlant.model.WorkshopEmployee;
import com.manufacturingPlant.virtualPlant.service.api.WorkshopEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class WorkshopEmployeeServiceImpl implements WorkshopEmployeeService {

    @Autowired
    private WorkshopEmployeeDAO workshopEmployeeDAO;

    @Transactional
    public void addWorkshopEmployee(String employeeId, int salary, String workshopName) {

    }

    @Transactional
    public void updateWorkshopEmployee(String employeeId, int salary, String workshopName) {

    }

    @Transactional
    public List<WorkshopEmployee> showAllWorkshopEmployees() {
        return null;
    }

    @Transactional
    public List<WorkshopEmployee> showWorkshopEmployeesByWorkshop(String workshopName) {
        return null;
    }

    @Transactional
    public void deleteWorkshopEmployee(String employeeId) {

    }
}
