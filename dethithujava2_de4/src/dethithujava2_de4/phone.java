/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dethithujava2_de4;

import java.io.Serializable;

/**
 *
 * @author chung
 */
public class phone implements Serializable{

    private String name;
    private int brand;
    private float price;

    public String getStatus(double price) {
        if (price >= 500) {
            return "great";
        } else {
            return "normal";
        }
    }

    public phone(String name, int brand, float price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public phone() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBrand() {
        return brand;
    }

    public void setBrand(int brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "phone{" + "name=" + name + ", brand=" + brand + ", price=" + price + '}';
    }

}
