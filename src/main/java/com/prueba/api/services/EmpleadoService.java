package com.prueba.api.services;

import com.prueba.api.models.EmpleadoDTO;
import com.prueba.api.models.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class EmpleadoService {

    @Autowired
    com.prueba.api.repositories.ProductsRepository ProductsRepository;

    public ArrayList<Products> obtenerUsuarios(){
        return (ArrayList<Products>) ProductsRepository.findAll();
    }

    public Products guardarUsuario(EmpleadoDTO Products){
        return  EmpleadoDTO.save(Products);
    }

}
