package com.prueba.api.models;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;



@Entity
@Table(name  ="Suppliers")
public class Suppliers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long SupplierID;

    private String CompanyName;
    private String ContactName;
    private String ContactTitle;
    private String Address;
    private String City;
    private String Region;
    private Long postalCode;
    private String Country;
    private Long Phone;
    private Long Fax;
    private String HomePage;

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getContactName() {
        return ContactName;
    }

    public void setContactName(String contactName) {
        ContactName = contactName;
    }

    public String getContactTitle() {
        return ContactTitle;
    }

    public void setContactTitle(String contactTitle) {
        ContactTitle = contactTitle;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public Long getFax() {
        return Fax;
    }

    public void setFax(Long fax) {
        Fax = fax;
    }

    public String getHomePage() {
        return HomePage;
    }

    public void setHomePage(String homePage) {
        HomePage = homePage;
    }

    public Long getPhone() {
        return Phone;
    }

    public void setPhone(Long phone) {
        Phone = phone;
    }

    public Long getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Long postalCode) {
        this.postalCode = postalCode;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public Long getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(Long supplierID) {
        SupplierID = supplierID;
    }
}
