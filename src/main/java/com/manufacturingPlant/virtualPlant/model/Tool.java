package com.manufacturingPlant.virtualPlant.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tools")
public class Tool {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "inventory_num")
    private String inventoryNum;

    @Column(name = "name_")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "workshop_name")
    private String workshopName; // FR to workshops

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "production_year")
    private String productionYear; // or LocalDate

    @Column(name = "manufacturer_name")
    private String manufacturerName;

    @Column(name = "vendor_name")
    private String vendorName;

    @Column(name = "price")
    private int price;

    public Tool() {
    }

    public Tool(String inventoryNum, String name, String description, String workshopName, LocalDate startDate,
                String productionYear, String manufacturerName, String vendorName, int price) {
        this.inventoryNum = inventoryNum;
        this.name = name;
        this.description = description;
        this.workshopName = workshopName;
        this.startDate = startDate;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWorkshopName() {
        return workshopName;
    }

    public void setWorkshopName(String workshopName) {
        this.workshopName = workshopName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(String productionYear) {
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

        Tool tool = (Tool) o;

        if (id != tool.id) return false;
        if (price != tool.price) return false;
        if (!inventoryNum.equals(tool.inventoryNum)) return false;
        if (!name.equals(tool.name)) return false;
        if (!description.equals(tool.description)) return false;
        if (!workshopName.equals(tool.workshopName)) return false;
        if (!startDate.equals(tool.startDate)) return false;
        if (!productionYear.equals(tool.productionYear)) return false;
        if (!manufacturerName.equals(tool.manufacturerName)) return false;
        return vendorName.equals(tool.vendorName);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + inventoryNum.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + description.hashCode();
        result = 31 * result + workshopName.hashCode();
        result = 31 * result + startDate.hashCode();
        result = 31 * result + productionYear.hashCode();
        result = 31 * result + manufacturerName.hashCode();
        result = 31 * result + vendorName.hashCode();
        result = 31 * result + price;
        return result;
    }
}
