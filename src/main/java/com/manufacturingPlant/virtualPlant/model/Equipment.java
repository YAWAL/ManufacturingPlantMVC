package com.manufacturingPlant.virtualPlant.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "equipments")
public class Equipment {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "inventory_num")
    private String inventoryNum;

    @Column(name = "name_")
    private String name;

    @Column(name = "start_name")
    private LocalDate startDate;

    @Column(name = "weight")
    private String weight;

    @Column(name = "sizes")
    private String sizes;

    @Column(name = "production_year")
    private LocalDate productionYear;

    @Column(name = "manufacturer_name")
    private String manufacturerName;

    @Column(name = "vendor_name")
    private String vendorName;

    @Column(name = "price")
    private int price;

    public Equipment() {
    }

    public Equipment(String inventoryNum, String name, LocalDate startDate, String weight, String sizes,
                     LocalDate productionYear, String manufacturerName, String vendorName, int price) {
        this.inventoryNum = inventoryNum;
        this.name = name;
        this.startDate = startDate;
        this.weight = weight;
        this.sizes = sizes;
        this.productionYear = productionYear;
        this.manufacturerName = manufacturerName;
        this.vendorName = vendorName;
        this.price = price;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getSizes() {
        return sizes;
    }

    public void setSizes(String sizes) {
        this.sizes = sizes;
    }

    public LocalDate getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(LocalDate productionYear) {
        this.productionYear = productionYear;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Equipment equipment = (Equipment) o;

        if (id != equipment.id) return false;
        if (price != equipment.price) return false;
        if (!inventoryNum.equals(equipment.inventoryNum)) return false;
        if (!name.equals(equipment.name)) return false;
        if (!startDate.equals(equipment.startDate)) return false;
        if (!weight.equals(equipment.weight)) return false;
        if (!sizes.equals(equipment.sizes)) return false;
        if (!productionYear.equals(equipment.productionYear)) return false;
        if (!manufacturerName.equals(equipment.manufacturerName)) return false;
        return vendorName.equals(equipment.vendorName);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + inventoryNum.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + startDate.hashCode();
        result = 31 * result + weight.hashCode();
        result = 31 * result + sizes.hashCode();
        result = 31 * result + productionYear.hashCode();
        result = 31 * result + manufacturerName.hashCode();
        result = 31 * result + vendorName.hashCode();
        result = 31 * result + price;
        return result;
    }
}
