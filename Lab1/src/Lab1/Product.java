/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;

import java.util.Scanner;

/**
 *
 * @author chung
 */
public class Product implements DAO {

    private String name;
    private double price;

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getImportTax() {
        return (price - price * 0.1);
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("emter your name: ");
        this.name = sc.nextLine();
        System.out.print("enter your price: ");
        this.price = Double.parseDouble(sc.nextLine());
    }

    public void info() {
        System.out.println("name: " + name);
        System.out.println("price: " + price);
        System.out.println("import tax: " + getImportTax());

    }

    @Override
    public void insert() {
        System.out.println("insert success");
    }

    @Override
    public void update() {
        System.out.println("update success");
    }

    @Override
    public void delete() {
        System.out.println("delete success");
    }

    @Override
    public void select() {
        System.out.println("select success");
    }
}
