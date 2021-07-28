/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.restapp;

import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Marut
 */
//@RestController
@Controller
public class ProductController {
@Autowired
   private ProductService service;
    @RequestMapping("/")
    public String viewHomePage(Model model){
    List<Product> listProducts = service.listAll();
    model.addAttribute("listProducts",listProducts);
    return "index";
    }
    
    @RequestMapping("/new")
    public String newProductPage(Model model){
    Product product = new Product();
    model.addAttribute("product",product);
    return "new_product";
    }
    
    @RequestMapping(value = "/save", method=RequestMethod.POST)
    public String saveProduct(@ModelAttribute("product") Product product){
    service.save(product);
    return "redirect:/";
    }
    
    @RequestMapping("/edit/{id}")
    public ModelAndView  editProductPage(@PathVariable(name="id") int id){
         ModelAndView  editmav= new ModelAndView("edit_product");
         Product product = service.get(id);
         editmav.addObject(product);
         return editmav;
                 
    }
     @RequestMapping("/delete/{id}")
     public String deleteProduct(@PathVariable(name="id") int id){
     service.delete(id);
     return "redirect:/";
     }
    
    @GetMapping("/admin")
    public String admin() {
        return "/admin";
    }
    
    @GetMapping("/customer")
    public String customer() {
        return "/customer";
    }
    @GetMapping("/login")
    public String login() {
        return "/login";
    }
    
    @GetMapping("/403")
    public String error403() {
        return "/error/403";
    }
    
}
