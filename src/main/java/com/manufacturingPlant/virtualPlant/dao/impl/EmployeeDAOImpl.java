package com.manufacturingPlant.virtualPlant.dao.impl;

import com.manufacturingPlant.virtualPlant.dao.api.EmployeeDAO;
import com.manufacturingPlant.virtualPlant.model.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @PersistenceContext(name = "ManufacturingPlant")
    private EntityManager entityManager;

    @Transactional
    public void addEmployee(Employee employee) {
        entityManager.persist(employee);
    }

    @Transactional
    public void updateEmployee(Employee employee) {
        entityManager.merge(employee);
    }

    @Transactional
    public List<Employee> showAllEmployees() {
        return entityManager.createQuery("from employees").getResultList();
    }

    @Transactional
    public List<Employee> showEmployeesByPosition(String position) {
        return null;
    }

    @Transactional
    public void deleteEmployee(Employee employee) {
        entityManager.remove(employee);
    }
}
