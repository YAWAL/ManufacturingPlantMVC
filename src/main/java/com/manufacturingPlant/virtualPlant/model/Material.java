package com.manufacturingPlant.virtualPlant.model;

import javax.persistence.*;

@Entity
@Table(name = "materials")
public class Material {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name_")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "standard")
    private String standard;

    @Column(name = "primary_size")
    private String primarySize;

    @Column(name = "production_year")
    private String productionYear;

    @Column(name = "manufacturer_name")
    private String manufacturerName;

    @Column(name = "vendor_name")
    private String vendorName;

    public Material() {
    }

    public Material(String name, String description, String standard, String primarySize, String productionYear,
                    String manufacturerName, String vendorName) {
        this.name = name;
        this.description = description;
        this.standard = standard;
        this.primarySize = primarySize;
        this.productionYear = productionYear;
        this.manufacturerName = manufacturerName;
        this.vendorName = vendorName;
    }

    public int getId() {
        return id;
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

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getPrimarySize() {
        return primarySize;
    }

    public void setPrimarySize(String primarySize) {
        this.primarySize = primarySize;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Material material = (Material) o;

        if (id != material.id) return false;
        if (!name.equals(material.name)) return false;
        if (!description.equals(material.description)) return false;
        if (!standard.equals(material.standard)) return false;
        if (!primarySize.equals(material.primarySize)) return false;
        if (!productionYear.equals(material.productionYear)) return false;
        if (!manufacturerName.equals(material.manufacturerName)) return false;
        return vendorName.equals(material.vendorName);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        result = 31 * result + description.hashCode();
        result = 31 * result + standard.hashCode();
        result = 31 * result + primarySize.hashCode();
        result = 31 * result + productionYear.hashCode();
        result = 31 * result + manufacturerName.hashCode();
        result = 31 * result + vendorName.hashCode();
        return result;
    }
}
