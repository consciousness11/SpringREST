/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.restapp;

import org.springframework.stereotype.Component;

/**
 *
 * @author Marut
 */
@Component
public class StrategyBinary implements Strategy{
    @Override
    public void doSearch(){
        System.out.println("Searching completed ...");
    }
    
    @Override
    public StrategyName getStrategyName(){
    return StrategyName.StrategyBinary;
    }
}