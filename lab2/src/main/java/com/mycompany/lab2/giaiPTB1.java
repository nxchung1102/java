/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

import java.util.Scanner;

public class giaiPTB1 {
    
    public static void giaiPTB1(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("pt vo so nghiem");
            } else {
                System.out.println("pt vo nghiem");
            }
        } else {
            double x = -b / a;
            System.out.printf("x= %.2f" + x);
        }
    }

    public static void chucnang1() {
        Scanner sc = new Scanner(System.in);
        double a, b;
        System.out.print("nhap a: ");
        a = Double.parseDouble(sc.nextLine());
        System.out.print("nhap b: ");
        b = Double.parseDouble(sc.nextLine());
        giaiPTB1(a, b);
    }
}
