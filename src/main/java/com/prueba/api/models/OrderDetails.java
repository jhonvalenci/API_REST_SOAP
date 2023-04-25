package com.prueba.api.models;


import javax.persistence.*;


@Entity
@Table(name  ="OrderDetails")
public class OrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long OrderID;


    private Long ProductID;


    private Long UnitPrice;
    private Long Quantity;
    private String Discount;

    public String getDiscount() {
        return Discount;
    }

    public void setDiscount(String discount) {
        Discount = discount;
    }

    public Long getOrderID() {
        return OrderID;
    }

    public void setOrderID(Long orderID) {
        OrderID = orderID;
    }

    public Long getProductID() {
        return ProductID;
    }

    public void setProductID(Long productID) {
        ProductID = productID;
    }

    public Long getQuantity() {
        return Quantity;
    }

    public void setQuantity(Long quantity) {
        Quantity = quantity;
    }

    public Long getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(Long unitPrice) {
        UnitPrice = unitPrice;
    }
}
