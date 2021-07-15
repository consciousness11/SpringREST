/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.restapp;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Marut
 */
public interface ProductRepository extends JpaRepository<Product,Integer>{
     @Query("SELECT p FROM Product p WHERE LOWER(p.name) LIKE %:name%")
    public List<Product> find(@Param("name") String name);
}
