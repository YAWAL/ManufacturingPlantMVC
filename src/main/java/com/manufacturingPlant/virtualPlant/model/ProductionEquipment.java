package com.manufacturingPlant.virtualPlant.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "production_equipments")
public class ProductionEquipment {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "inventory_num")
    private String inventoryNum;

    @Column(name = "workshop_name")
    private String workshopName;

    @Column(name = "power")
    private String power;


    public ProductionEquipment() {
    }

    public ProductionEquipment(String inventoryNum, String name, String workshopName, LocalDate startDate, String power,
                               String weight, String sizes, LocalDate productionYear, String manufacturerName,
                               String vendorName, int price) {
        this.inventoryNum = inventoryNum;
        this.workshopName = workshopName;
        this.power = power;
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

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductionEquipment that = (ProductionEquipment) o;

        if (id != that.id) return false;
        if (!inventoryNum.equals(that.inventoryNum)) return false;
        if (!workshopName.equals(that.workshopName)) return false;
        return power.equals(that.power);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + inventoryNum.hashCode();
        result = 31 * result + workshopName.hashCode();
        result = 31 * result + power.hashCode();
        return result;
    }
}
