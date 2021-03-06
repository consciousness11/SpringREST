/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.restapp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Marut
 */
@Service
public class SearchService {

    @Autowired
    private StrategyFactory strategyFactory;

    public List<Product> findItems(String name) {
        
        Strategy strategy
                = strategyFactory.findStrategy(StrategyName.StrategyBinary);
        return strategy.doSearch(name);
    }
}
