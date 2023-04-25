package com.prueba.api.controllers;


import com.prueba.api.models.Categories;
import com.prueba.api.models.Suppliers;
import com.prueba.api.services.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/Categories")
public class CategoriesController {

    @Autowired
    CategoriesService CategoriesService;

    @GetMapping
    public ArrayList<Categories> obtenerUsuarios(){
        return CategoriesService.obtenerUsuarios();

    }

    @PostMapping()
    public Categories guardarUsuario(@RequestBody Categories Categories){
        return this.CategoriesService.guardarUsuario(Categories);
    }

}
