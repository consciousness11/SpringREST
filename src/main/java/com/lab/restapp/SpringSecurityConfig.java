///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.lab.restapp;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.access.AccessDeniedHandler;
//
///**
// *
// * @author Marut
// */
//@Configuration
//public class SpringSecurityConfig  extends WebSecurityConfigurerAdapter{
//  @Autowired 
//  private AccessDeniedHandler accessDeniedHandler ;
//  
//  @Override
//  protected void configure(HttpSecurity http) throws Exception {
//  
//      http.csrf().disable()
//      .authorizeRequests().antMatchers("/", "/new")
//      .permitAll().antMatchers("/admin/**").hasAnyRole("ADMIN")
//      .antMatchers("/customer/**").hasAnyRole("CUSTOMER")
//      .anyRequest().authenticated().and().formLogin()
//      .loginPage("/login").permitAll().and()
//      .logout().permitAll()
//      .and().exceptionHandling().accessDeniedHandler(accessDeniedHandler);
//  
//  }
//  
//  @Autowired
//  public void configureGlobal (AuthenticationManagerBuilder auth ) throws Exception {
//  
//      auth.inMemoryAuthentication().withUser("customer").password("{noop}password").roles("CUSTOMER")
//              .and().withUser("admin").password("{noop}password").roles("ADMIN");
//  
//  
//  
//  }
//  
//  
//    
//    
//    
//}
