/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

import java.util.*;

/**
 *
 * @author chung
 */
public class Bai3 {

    Scanner _sc = new Scanner(System.in);
    List<ClassOfLesson3> _lstProduct;
    ClassOfLesson3 _product;

    public Bai3() {
        _lstProduct = new ArrayList<>();
    }

    public void input() {
        String Y_N;
        do {
            _product = new ClassOfLesson3();
            System.out.println("Enter the name of the product");
            _product.setProductName(_sc.nextLine());
            System.out.println("Enter the price of the product");
            _product.setPrice(Double.parseDouble(_sc.nextLine()));
            _lstProduct.add(_product);
            System.out.println("do you want to continue (Y/N)");
            Y_N = _sc.nextLine();
//            if (Y_N.equalsIgnoreCase("N")) {
//                break;
//            }
        } while (Y_N.equalsIgnoreCase("Y"));
    }

    public void output() {
        for (ClassOfLesson3 productI : _lstProduct) {
            System.out.println("product information: " + productI);

        }
    }

    public void arrange() {

        Collections.sort(_lstProduct, new Comparator<ClassOfLesson3>() {
            @Override
            public int compare(ClassOfLesson3 o1, ClassOfLesson3 o2) {
                return -o1.getPrice() > o2.getPrice() ? 1 : -1;
            }
        });

    }

    public void del() {

        System.out.println("enter the name you want to delete: ");
        String nameDel = _sc.nextLine();
        int count = 0;
        for (int i = 0; i < _lstProduct.size(); i++) {
            if (_lstProduct.get(i).getProductName().equalsIgnoreCase(nameDel)) {
                _lstProduct.remove(i);
                count++;

                break;
            }
        }
        if (count == 0) {
            System.out.println("name cannot be deleted");
        }
    }

    public void avg() {
        double total = 0;
        double avg = 0;
        for (int i = 0; i < _lstProduct.size(); i++) {
            total += _lstProduct.get(i).getPrice();
        }
        avg = total / _lstProduct.size();
        System.out.println("avg= " + avg);
    }


}
