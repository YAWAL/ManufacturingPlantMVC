package com.manufacturingPlant.virtualPlant.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "nonproduction_equipments")
public class NonProductionEquipment {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "inventory_num")
    private String inventoryNum;

    @Column(name = "workshop_name")
    private String workshopName;

    @Column(name = "department_name")
    private String departmentName;

    public NonProductionEquipment() {
    }

    public NonProductionEquipment(String inventoryNum, String name, String workshopName, String departmentName,
                                  LocalDate startDate, String weight, String sizes, LocalDate productionYear,
                                  String manufacturerName, String vendorName, int price) {
        this.inventoryNum = inventoryNum;
        this.workshopName = workshopName;
        this.departmentName = departmentName;
    }

    public int getId() {
        return id;
    }

    public String getInventoryNum() {
        return inventoryNum;
    }

    public void setInventoryNum(String inventoryNum) {
        this.inventoryNum = inventoryNum;
    }

    public String getWorkshopName() {
        return workshopName;
    }

    public void setWorkshopName(String workshopName) {
        this.workshopName = workshopName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NonProductionEquipment that = (NonProductionEquipment) o;

        if (id != that.id) return false;
        if (!inventoryNum.equals(that.inventoryNum)) return false;
        if (!workshopName.equals(that.workshopName)) return false;
        return departmentName.equals(that.departmentName);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + inventoryNum.hashCode();
        result = 31 * result + workshopName.hashCode();
        result = 31 * result + departmentName.hashCode();
        return result;
    }
}
