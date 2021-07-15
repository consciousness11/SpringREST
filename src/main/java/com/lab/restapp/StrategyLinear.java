/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.restapp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Marut
 */
@Component
public class StrategyLinear implements Strategy{
    @Autowired
    private ProductRepository repo;
    @Override
    public List<Product> doSearch(String name){
        return repo.find(name);
    }
    
    @Override
    public StrategyName getStrategyName(){
    return StrategyName.StrategyLinear;
    }
}
