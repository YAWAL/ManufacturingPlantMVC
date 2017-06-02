package com.manufacturingPlant.virtualPlant.model;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "workshops")
public class Workshop {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "workshop_id")
    private String workshopId;

    @Column(name = "workshop_name")
    private String workshopName;

    @Column(name = "chairman_employee_id")
    private String chairmanEmployeeId; // FK to workshop_employees 'one-to-one'

    @Column(name = "workshop_employees")
    private ArrayList<WorkshopEmployee> workshopEmployees;//FK to workshop_employees 'many-to-one'

    @Column(name = "workshop_employee_quantity")
    private int workshopEmployeeQuantity;// do not include to constructor

    @Column(name = "production_equipments")
    private ArrayList<ProductionEquipment> productionEquipment;

    @Column(name = "nonproduction_equipments")
    private ArrayList<NonProductionEquipment> nonProductionEquipment;

    @Column(name = "tools")
    private ArrayList<Tool> tools;

    @Column(name = "materials")
    private ArrayList<Material> materials;


    public Workshop() {
    }

    public Workshop(String workshopId, String workshopName, String chairmanEmployeeId,
                    ArrayList<WorkshopEmployee> workshopEmployees, int workshopEmployeeQuantity,
                    ArrayList<ProductionEquipment> productionEquipment,
                    ArrayList<NonProductionEquipment> nonProductionEquipment, ArrayList<Tool> tools,
                    ArrayList<Material> materials) {
        this.workshopId = workshopId;
        this.workshopName = workshopName;
        this.chairmanEmployeeId = chairmanEmployeeId;
        this.workshopEmployees = workshopEmployees;
        this.workshopEmployeeQuantity = workshopEmployeeQuantity;
        this.productionEquipment = productionEquipment;
        this.nonProductionEquipment = nonProductionEquipment;
        this.tools = tools;
        this.materials = materials;
    }

    public int getId() {
        return id;
    }

    public String getWorkshopId() {
        return workshopId;
    }

    public void setWorkshopId(String workshopId) {
        this.workshopId = workshopId;
    }

    public String getWorkshopName() {
        return workshopName;
    }

    public void setWorkshopName(String workshopName) {
        this.workshopName = workshopName;
    }

    public String getChairmanEmployeeId() {
        return chairmanEmployeeId;
    }

    public void setChairmanEmployeeId(String chairmanEmployeeId) {
        this.chairmanEmployeeId = chairmanEmployeeId;
    }

    public ArrayList<WorkshopEmployee> getWorkshopEmployees() {
        return workshopEmployees;
    }

    public void setWorkshopEmployees(ArrayList<WorkshopEmployee> workshopEmployees) {
        this.workshopEmployees = workshopEmployees;
    }

    public int getWorkshopEmployeeQuantity() {
        return workshopEmployeeQuantity;
    }

    public void setWorkshopEmployeeQuantity(int workshopEmployeeQuantity) {
        this.workshopEmployeeQuantity = workshopEmployeeQuantity;
    }

    public ArrayList<ProductionEquipment> getProductionEquipment() {
        return productionEquipment;
    }

    public void setProductionEquipment(ArrayList<ProductionEquipment> productionEquipment) {
        this.productionEquipment = productionEquipment;
    }

    public ArrayList<NonProductionEquipment> getNonProductionEquipment() {
        return nonProductionEquipment;
    }

    public void setNonProductionEquipment(ArrayList<NonProductionEquipment> nonProductionEquipment) {
        this.nonProductionEquipment = nonProductionEquipment;
    }

    public ArrayList<Tool> getTools() {
        return tools;
    }

    public void setTools(ArrayList<Tool> tools) {
        this.tools = tools;
    }

    public ArrayList<Material> getMaterials() {
        return materials;
    }

    public void setMaterials(ArrayList<Material> materials) {
        this.materials = materials;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Workshop workshop = (Workshop) o;

        if (id != workshop.id) return false;
        if (workshopEmployeeQuantity != workshop.workshopEmployeeQuantity) return false;
        if (!workshopId.equals(workshop.workshopId)) return false;
        if (!workshopName.equals(workshop.workshopName)) return false;
        if (!chairmanEmployeeId.equals(workshop.chairmanEmployeeId)) return false;
        if (!workshopEmployees.equals(workshop.workshopEmployees)) return false;
        if (!productionEquipment.equals(workshop.productionEquipment)) return false;
        if (!nonProductionEquipment.equals(workshop.nonProductionEquipment)) return false;
        if (!tools.equals(workshop.tools)) return false;
        return materials.equals(workshop.materials);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + workshopId.hashCode();
        result = 31 * result + workshopName.hashCode();
        result = 31 * result + chairmanEmployeeId.hashCode();
        result = 31 * result + workshopEmployees.hashCode();
        result = 31 * result + workshopEmployeeQuantity;
        result = 31 * result + productionEquipment.hashCode();
        result = 31 * result + nonProductionEquipment.hashCode();
        result = 31 * result + tools.hashCode();
        result = 31 * result + materials.hashCode();
        return result;
    }
}
