package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.data.Product;
import com.fasterxml.jackson.core.JsonParseException;

@Service
public class productService {

    //all products are added to this list
    private List<Product> products = new ArrayList<>();

        //taking
        public void addProduct(Product product) throws JsonParseException{
            products.add(product);
        }
        public List<Product> getAllProducts(){
            return products;
        }

        public Product getProductById(String id){
            for(Product p : products){
                if(p.getId().equals(id)){
                return p;
                }
            }
            return null;
        }
        public Product updateProduct(String id, Product updatedProduct){
            Product product = getProductById(id);
            updatedProduct.setId(id);

            if(product != null){
                int productIndex = products.indexOf(product);
                products.set(productIndex, updatedProduct);
                return updatedProduct;
            }
            else{
                return null;
            }
        }

        public Product deleteProduct(String id){
            Product product = getProductById(id);
            if(product != null){
                products.remove(product);
                return product;
            }
            else{
                return null;
            }
        }
    }
