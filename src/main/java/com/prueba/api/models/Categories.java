package com.prueba.api.models;


import javax.persistence.*;

@Entity
@Table(name  ="Categories")
public class Categories {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CategoryID;


    private String CategoryName;


    private String Description;
    private String Picture;

    public Long getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(Long categoryID) {
        CategoryID = categoryID;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getPicture() {
        return Picture;
    }

    public void setPicture(String picture) {
        Picture = picture;
    }
}
