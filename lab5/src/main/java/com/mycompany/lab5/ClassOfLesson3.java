/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

/**
 *
 * @author chung
 */
public class ClassOfLesson3 {
    private String productName;
    private double price;

    public ClassOfLesson3() {
    }

    public ClassOfLesson3(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    public void info(){
        System.out.println("{productName: "+ productName +"}");
        System.out.println("{price: "+ price + "}");
    }
    @Override
    public String toString() {
        return "ClassOfLesson3{" + "productName=" + productName + ", price=" + price + '}';
    }
    
}
