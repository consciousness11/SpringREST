/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.restapp;

import java.util.List;

/**
 *
 * @author Marut
 */
public interface Strategy {
    public List<Product> doSearch(String name);
    StrategyName getStrategyName();
}
