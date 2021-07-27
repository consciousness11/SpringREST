/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.restapp;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Immutable;


/**
 *
 * @author Marut
 */

// THIS IS NOT USED FOR VIEW 
@Entity
@Table(name = "productdetails" )
@Immutable
public class ProductDetails implements Serializable{

    /**
     * @return the id
     */

    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

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
     * @return the brandName
     */
    public String getBrandname() {
        return brandname;
    }

    /**
     * @param brandName the brandName to set
     */
    public void setBrandname(String brandName) {
        this.brandname = brandname;
    }

   @Id
   @Column(name = "id")
   private Integer id ;
   @Column(name = "Name")
   private String name;
   @Column(name = "price")
   private float price;
   @Column(name = "brandname")
   private String brandname;
   
    
    
}
