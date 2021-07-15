/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.restapp;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Marut
 */
public interface ProductInterface {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer getId();

    /**
     * @return the name
     */
    String getName();

    /**
     * @return the price
     */
    float getPrice();

    /**
     * @return the spec
     */
    String getSpec();

    /**
     * @param id the id to set
     */
    void setId(Integer id);

    /**
     * @param name the name to set
     */
    void setName(String name);

    /**
     * @param price the price to set
     */
    void setPrice(float price);

    /**
     * @param spec the spec to set
     */
    void setSpec(String spec);
    
}
