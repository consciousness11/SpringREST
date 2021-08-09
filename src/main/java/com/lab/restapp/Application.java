/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.restapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 *
 * @author Marut
 */
@SpringBootApplication
@ComponentScan({"com.lab.restapp"})
@EntityScan("com.lab.restapp")
@EnableJpaRepositories("com.lab.restapp")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

