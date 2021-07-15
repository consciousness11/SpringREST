/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.restapp;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Marut
 */
@Service
@Transactional
public class ProductService {
    @Autowired
    private ProductRepository repo;
    
    @Autowired
    private ReportRepository reportrepo;
        
    public List<Product> listAll(){
    return repo.findAll();
    }
    public void save(Product product){
    repo.save(product);
    }
    public Product get(Integer id){
    return repo.findById(id).get();
    }
    public void delete(Integer id ){
    repo.deleteById(id);
    }
//    public List<Product>  search(String name){
//    return repo.find(name);
//    }
    public List<ProductDetails> productList(){
    return reportrepo.productReport();
    }
}
