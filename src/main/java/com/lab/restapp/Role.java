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
public class Role {

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
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
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id ;
    private String name;
    
    public Role(){}
    
    public Role(String name){this.name= name;}
    
    @Override
    public String toString(){
    return "Role{"+"id="+id+", name='"+ name +'\''+'}';
    }
}
