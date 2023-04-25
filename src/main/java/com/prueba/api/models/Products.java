package com.prueba.api.models;

import javax.persistence.*;


@Entity
@Table(name  ="Products")
public class Products {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long ProductID;

    private String ProductName;
    private Long SupplierID;
    private Long CategoryID;
    private Long QuantityPerUnit;
    private Long UnitPrice;
    private Long UnitsInStock;
    private Long UnitsOnOrder;
    private Long ReorderLevel;
    private String Discontinued;

    public Long getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(Long categoryID) {
        CategoryID = categoryID;
    }

    public String getDiscontinued() {
        return Discontinued;
    }

    public void setDiscontinued(String discontinued) {
        Discontinued = discontinued;
    }

    public Long getProductID() {
        return ProductID;
    }

    public void setProductID(Long productID) {
        ProductID = productID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public Long getQuantityPerUnit() {
        return QuantityPerUnit;
    }

    public void setQuantityPerUnit(Long quantityPerUnit) {
        QuantityPerUnit = quantityPerUnit;
    }

    public Long getReorderLevel() {
        return ReorderLevel;
    }

    public void setReorderLevel(Long reorderLevel) {
        ReorderLevel = reorderLevel;
    }

    public Long getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(Long supplierID) {
        SupplierID = supplierID;
    }

    public Long getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(Long unitPrice) {
        UnitPrice = unitPrice;
    }

    public Long getUnitsInStock() {
        return UnitsInStock;
    }

    public void setUnitsInStock(Long unitsInStock) {
        UnitsInStock = unitsInStock;
    }

    public Long getUnitsOnOrder() {
        return UnitsOnOrder;
    }

    public void setUnitsOnOrder(Long unitsOnOrder) {
        UnitsOnOrder = unitsOnOrder;
    }
}
