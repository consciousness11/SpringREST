/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.restapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Marut
 */
@Entity
public class Product {

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the spec
     */
    public String getSpec() {
        return spec;
    }

    /**
     * @param spec the spec to set
     */
    public void setSpec(String spec) {
        this.spec = spec;
    }
    private Integer id;
    private String name;
    private float price;
    private String spec;
    
    public Product(){}
    
    public Product(Integer id ,String name,float price,String spec){
    this.id=id;
    this.name=name;
    this.price=price;
    this.spec=spec;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId(){
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }
}
