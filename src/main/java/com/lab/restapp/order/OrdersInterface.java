/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.restapp.order;

/**
 *
 * @author Marut
 */
public interface OrdersInterface {

    float getDiscount();

    int getOid();

    String getOrderdate();

    String getProductname();

    int getQuantity();

    float getUnitPrice();

    void setDiscount(float discount);

    void setOid(int oid);

    void setOrderdate(String orderdate);

    void setProductname(String productname);

    void setQuantity(int quantity);

    void setUnitPrice(float unitPrice);
    
}
