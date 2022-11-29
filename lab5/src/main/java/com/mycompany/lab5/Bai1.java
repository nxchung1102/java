/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

import com.sun.source.tree.WhileLoopTree;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author chung
 */
public class Bai1 {

    Scanner _sc = new Scanner(System.in);
    ArrayList<Double> _lstDouble;

    public Bai1() {
        _lstDouble = new ArrayList<>();
    }

    public void input() {
        String Y_N;
        do {
            System.out.println("enter arbitrary numbers of real numbers:");
            double x = Double.parseDouble(_sc.nextLine());
            _lstDouble.add(x);
            System.out.println("do you want to continue (Y/N)");
            Y_N = _sc.nextLine();
            if (Y_N.equalsIgnoreCase("N")) {
                break;
            }
        } while (Y_N.equalsIgnoreCase("Y"));
    }

    public void output() {
        double total = 0;
        for (Double n : _lstDouble) {
            total += n;
            System.out.println("the number you just entered: " + n);

        }
        System.out.println("total= " + total);
    }

}
