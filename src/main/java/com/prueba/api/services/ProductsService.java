package com.prueba.api.services;


import com.prueba.api.models.Products;
import com.prueba.api.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductsService {

    @Autowired
    ProductsRepository ProductsRepository;

    public ArrayList<Products> obtenerUsuarios(){
        return (ArrayList<Products>) ProductsRepository.findAll();
    }

    public Products guardarUsuario(Products Products){
        return  ProductsRepository.save(Products);
    }

}
