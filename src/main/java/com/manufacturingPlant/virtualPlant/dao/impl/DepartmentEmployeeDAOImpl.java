package com.manufacturingPlant.virtualPlant.dao.impl;

import com.manufacturingPlant.virtualPlant.dao.api.DepartmentEmployeeDAO;
import com.manufacturingPlant.virtualPlant.model.DepartmentEmployee;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class DepartmentEmployeeDAOImpl implements DepartmentEmployeeDAO {

    @PersistenceContext(name = "ManufacturingPlant")
    private EntityManager entityManager;

    @Transactional
    public void addDepartmentEmployee(DepartmentEmployee departmentEmployee) {
        entityManager.persist(departmentEmployee);
    }

    @Transactional
    public void updateDepartmentEmployee(DepartmentEmployee departmentEmployee) {
        entityManager.merge(departmentEmployee);
    }

    @Transactional
    public List<DepartmentEmployee> showAllDepartmentEmployees() {
        return entityManager.createQuery("from department_employees").getResultList();
    }

    @Transactional
    public List<DepartmentEmployee> showDepartmentEmployeesByDepartment(String departmentName) {
        return null;
    }

    @Transactional
    public void deleteDepartmentEmployee(DepartmentEmployee departmentEmployee) {
        entityManager.remove(departmentEmployee);
    }
}
