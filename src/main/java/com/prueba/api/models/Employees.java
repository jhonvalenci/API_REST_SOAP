package com.prueba.api.models;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name  ="Employees")
public class Employees {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long EmployeeID;


    private String LastName;
    private String FisrtName;
    private String Title;
    private String TitleOfCourtesy;
    private Date BirthDte;
    private Date HireDate;
    private String  Address;
    private String  City;
    private String  Region;
    private Long PostalCode;
    private String Country;
    private String HomePhone;
    private Long Extension;
    private String Photo;
    private String Notes;
    private String  ReportsTo;

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Date getBirthDte() {
        return BirthDte;
    }

    public void setBirthDte(Date birthDte) {
        BirthDte = birthDte;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public Long getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(Long employeeID) {
        EmployeeID = employeeID;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFisrtName() {
        return FisrtName;
    }

    public void setFisrtName(String fisrtName) {
        FisrtName = fisrtName;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getTitleOfCourtesy() {
        return TitleOfCourtesy;
    }

    public void setTitleOfCourtesy(String titleOfCourtesy) {
        TitleOfCourtesy = titleOfCourtesy;
    }

    public Date getHireDate() {
        return HireDate;
    }

    public void setHireDate(Date hireDate) {
        HireDate = hireDate;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public Long getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(Long postalCode) {
        PostalCode = postalCode;
    }

    public String getHomePhone() {
        return HomePhone;
    }

    public void setHomePhone(String homePhone) {
        HomePhone = homePhone;
    }

    public Long getExtension() {
        return Extension;
    }

    public void setExtension(Long extension) {
        Extension = extension;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String photo) {
        Photo = photo;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }

    public String getReportsTo() {
        return ReportsTo;
    }

    public void setReportsTo(String reportsTo) {
        ReportsTo = reportsTo;
    }


}
