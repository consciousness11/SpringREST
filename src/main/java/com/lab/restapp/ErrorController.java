/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.restapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

/**
 *
 * @author Marut
 */
@Component
public class ErrorController implements AccessDeniedHandler{
   
    @Override
    public void handle(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse,
            AccessDeniedException e) throws IOException,ServletException {
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    if(auth !=null){
    System.out.println("User ;" + auth.getName() +"wants this "+ httpServletRequest.getRequestURI());
    }
    
    httpServletResponse.sendRedirect(httpServletRequest.getContextPath()+"/403");
    }
    
}
