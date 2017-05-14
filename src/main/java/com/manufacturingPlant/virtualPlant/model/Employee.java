package com.manufacturingPlant.virtualPlant.model;

import javax.persistence.*;
import java.time.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "employee_id", columnDefinition = "char(13)")//FK TO department_employees and workshop_employees
    @OneToOne(fetch = FetchType.LAZY)
    private String employeeId;

    @Column(name = "position_")
    private String position;

    @Column(name = "name_")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "pass_series_num")
    private String passSeriesAndNum;

    @Column(name = "identification_num")
    private String identificationNum;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "phone_num")
    private String phoneNum;

    @Column(name = "join_date")
    private LocalDate joinDate;

    @Column(name = "residence_place")
    private String residencePlace;

    @Column(name = "street")
    private String street;

    @Column(name = "building_num")
    private String buildingNum;

    @Column(name = "flat_num")
    private String flatNum;

    public Employee() {
    }

    public Employee(String employeeId, String position, String name, String lastName, String middleName,
                    String passSeriesAndNum, String identificationNum, LocalDate birthDate, String phoneNum,
                    LocalDate joinDate, String residencePlace, String street, String buildingNum, String flatNum) {
        this.employeeId = employeeId;
        this.position = position;
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.passSeriesAndNum = passSeriesAndNum;
        this.identificationNum = identificationNum;
        this.birthDate = birthDate;
        this.phoneNum = phoneNum;
        this.joinDate = joinDate;
        this.residencePlace = residencePlace;
        this.street = street;
        this.buildingNum = buildingNum;
        this.flatNum = flatNum;
    }

    public int getId() {
        return id;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPassSeriesAndNum() {
        return passSeriesAndNum;
    }

    public void setPassSeriesAndNum(String passSeriesAndNum) {
        this.passSeriesAndNum = passSeriesAndNum;
    }

    public String getIdentificationNum() {
        return identificationNum;
    }

    public void setIdentificationNum(String identificationNum) {
        this.identificationNum = identificationNum;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    public String getResidencePlace() {
        return residencePlace;
    }

    public void setResidencePlace(String residencePlace) {
        this.residencePlace = residencePlace;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuildingNum() {
        return buildingNum;
    }

    public void setBuildingNum(String buildingNum) {
        this.buildingNum = buildingNum;
    }

    public String getFlatNum() {
        return flatNum;
    }

    public void setFlatNum(String flatNum) {
        this.flatNum = flatNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (employeeId != employee.employeeId) return false;
        if (!position.equals(employee.position)) return false;
        if (!name.equals(employee.name)) return false;
        if (!lastName.equals(employee.lastName)) return false;
        if (!middleName.equals(employee.middleName)) return false;
        if (!passSeriesAndNum.equals(employee.passSeriesAndNum)) return false;
        if (!identificationNum.equals(employee.identificationNum)) return false;
        if (!birthDate.equals(employee.birthDate)) return false;
        if (!phoneNum.equals(employee.phoneNum)) return false;
        if (!joinDate.equals(employee.joinDate)) return false;
        if (!residencePlace.equals(employee.residencePlace)) return false;
        if (!street.equals(employee.street)) return false;
        if (!buildingNum.equals(employee.buildingNum)) return false;
        return flatNum != null ? flatNum.equals(employee.flatNum) : employee.flatNum == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + employeeId.hashCode();
        result = 31 * result + position.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + middleName.hashCode();
        result = 31 * result + passSeriesAndNum.hashCode();
        result = 31 * result + identificationNum.hashCode();
        result = 31 * result + birthDate.hashCode();
        result = 31 * result + phoneNum.hashCode();
        result = 31 * result + joinDate.hashCode();
        result = 31 * result + residencePlace.hashCode();
        result = 31 * result + street.hashCode();
        result = 31 * result + (buildingNum != null ? buildingNum.hashCode() : 0);
        result = 31 * result + (flatNum != null ? flatNum.hashCode() : 0);
        return result;
    }
}
