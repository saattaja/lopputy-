package com.example.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.Product;
import com.example.demo.service.productService;
import com.fasterxml.jackson.core.JsonParseException;

@RestController
public class productController {
    

    @Autowired
    private productService productservice;

    
   Product product;

    //getting all products
    @GetMapping("/product")
    public List<Product> getAllProducts(){
        return productservice.getAllProducts();
        
    }

    //getting one product by id
    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable String id){
        return productservice.getProductById(id);
    }

    //adding a product
    @PostMapping("/product/add")
    public String addProduct(@RequestBody Product product) throws JsonParseException{
        productservice.addProduct(product);
        return "Product added successfully";
    }
    
    //updating an existing product
    @PutMapping("/product/{id}")
    public String updateProduct(@PathVariable String id, @RequestBody Product product){
        productservice.updateProduct(id, product);
        return "Product updated successfully";
    }

    //removing a product
    @DeleteMapping("/product/{id}")
    public String deleteProduct(@PathVariable String id){
        productservice.deleteProduct(id);
        return "Product deleted successfully";
    }
}
