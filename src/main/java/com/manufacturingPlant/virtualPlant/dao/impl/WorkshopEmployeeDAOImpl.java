package com.manufacturingPlant.virtualPlant.dao.impl;

import com.manufacturingPlant.virtualPlant.dao.api.WorkshopEmployeeDAO;
import com.manufacturingPlant.virtualPlant.model.WorkshopEmployee;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class WorkshopEmployeeDAOImpl implements WorkshopEmployeeDAO {

    @PersistenceContext(name = "ManufacturingPlant")
    private EntityManager entityManager;

    @Transactional
    public void addWorkshopEmployee(WorkshopEmployee workshopEmployee) {
        entityManager.persist(workshopEmployee);
    }

    @Transactional
    public void updateWorkshopEmployee(WorkshopEmployee workshopEmployee) {
        entityManager.merge(workshopEmployee);
    }

    @Transactional
    public List<WorkshopEmployee> showAllWorkshopEmployees() {
        return entityManager.createQuery("from workshop_employees").getResultList();
    }

    @Transactional
    public List<WorkshopEmployee> showWorkshopEmployeesByWorkshop(String workshopName) {
        return null;
    }

    @Transactional
    public void deleteWorkshopEmployee(WorkshopEmployee workshopEmployee) {
        entityManager.remove(workshopEmployee);
    }
}
