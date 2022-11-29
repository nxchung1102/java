/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b6_bt_oop_arrlist;

/**
 *
 * @author chung
 */
public class Bingchilling {
    private int id;
    private double price;
    private String address;
    private String taste;

    public Bingchilling() {
    }

    public Bingchilling(int id, double price, String address, String taste) {
        this.id = id;
        this.price = price;
        this.address = address;
        this.taste = taste;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Bingchilling{" + "id=" + id + ", price=" + price + ", address=" + address + ", taste=" + taste + '}';
    }
    
}
