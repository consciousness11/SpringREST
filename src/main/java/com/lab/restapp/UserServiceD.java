/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.restapp;

import org.springframework.security.core.userdetails.UserDetailsService;

/**
 *
 * @author Marut
 */
public interface UserServiceD extends UserDetailsService{
    User findByUsername(String username);
}
