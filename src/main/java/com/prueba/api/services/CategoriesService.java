package com.prueba.api.services;


import com.prueba.api.models.Categories;
import com.prueba.api.repositories.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CategoriesService {

    @Autowired
    CategoriesRepository CategoriesRepository;


    public ArrayList<Categories> obtenerUsuarios(){
        return (ArrayList<Categories>) CategoriesRepository.findAll();
    }

    public Categories guardarUsuario(Categories Categories){
        return CategoriesRepository.save(Categories);
    }
}
