/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.restapp;

import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Marut
 */

@RestController
public class ProductApiController {
    @Autowired
    private ProductService service;
    @Autowired 
    private SearchService sservice;
    @CrossOrigin
    @GetMapping("/api/products")
    public List<Product> list() {
        return service.listAll();
    }

    @GetMapping("/api/search/{item}")
    public List<Product> search(@PathVariable String item) {
       return sservice.findItems(item);
    }
    
    
    
    @GetMapping("/api/products/{id}")
    public ResponseEntity<Product> get(@PathVariable Integer id) {
        try {
            Product product = service.get(id);
            return new ResponseEntity<Product>(product, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/api/products") 
    public void add(@RequestBody Product product){
        service.save(product);
    }
    
    @PutMapping("/api/products/{id}")
    public ResponseEntity<?> update(@RequestBody Product product,@PathVariable Integer id)
    {
        try {
        Product existingProduct = service.get(id);
        service.save(product);
        return new ResponseEntity<Product>(HttpStatus.OK);
     
        }
        catch(NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            
        }
    
    }
    @DeleteMapping("/api/products/{id}")
    public void delete(@PathVariable Integer id ){
    service.delete(id);
    }
    
    @GetMapping("/api/productreport")
     public List<ProductDetails> Report() {
       return service.productList();
    }
    
}
