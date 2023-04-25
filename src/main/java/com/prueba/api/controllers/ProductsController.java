package com.prueba.api.controllers;


import com.prueba.api.models.Products;
import com.prueba.api.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/Products")
public class ProductsController {

    @Autowired
    ProductsService ProductsService;


    @GetMapping()
    public ArrayList<Products> obtenerUsuarios(){
        return ProductsService.obtenerUsuarios();

    }

    @PostMapping()
    public Products guardarUsuario(@RequestBody Products Products){
        return  this.ProductsService.guardarUsuario(Products);

    }
}
