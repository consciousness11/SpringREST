/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.restapp;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;

/**
 *
 * @author Marut
 */
// NOT USED IN SERVICE
public interface ReportRepository extends JpaRepository<ProductDetails,Integer> {
     @Query(value="SELECT * FROM productdetails",nativeQuery=true)
    public List<ProductDetails> productReport();
}
