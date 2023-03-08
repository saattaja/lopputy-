package com.example.demo.data;

import java.math.BigDecimal;

//Here I am creating a product for online store selling pet's equipment
public class Product {
    
    private String id;
    private String description;
    private BigDecimal price;

    //empty constructor
    public Product() {
    }
    //constructor with parameters
    public Product( String id, String description, BigDecimal price){
        this.id = id;
        this.description = description;
        this.price = price;
        
    }
    //getters and setters
    public void setId(String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


}
