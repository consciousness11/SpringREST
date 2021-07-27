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
public class Orders implements OrdersInterface {
    private  int oid ;
    private float unitPrice;
    private int quantity;
    private String orderdate;
    private float discount;
    private String productname;

    @Override
    public int getOid() {
        return oid;
    }

    @Override
    public void setOid(int oid) {
        this.oid = oid;
    }

    @Override
    public float getUnitPrice() {
        return unitPrice;
    }

    @Override
    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String getOrderdate() {
        return orderdate;
    }

    @Override
    public void setOrderdate(String orderdate) {
        this.orderdate = orderdate;
    }

    @Override
    public float getDiscount() {
        return discount;
    }

    @Override
    public void setDiscount(float discount) {
        this.discount = discount;
    }

    @Override
    public String getProductname() {
        return productname;
    }

    @Override
    public void setProductname(String productname) {
        this.productname = productname;
    }
}
