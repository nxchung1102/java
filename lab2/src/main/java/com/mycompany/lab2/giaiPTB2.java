/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author chung
 */
public class giaiPTB2 {

    public static void main(String[] args) {
        double x, x1, x2, delta;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a:");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("nhap b:");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("nhap c:");
        double c = Double.parseDouble(sc.nextLine());
        if (a == 0) {
            System.out.println("giai PTB1");
            giaiPTB1.chucnang1();

        } else {
            delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("PT vo nghiem");
            } else if (delta == 0) {
                x = -b / 2 * a;
                System.out.println("PT co nghiem kep x= " + x);
            } else {
                x1 = ((-b) + (Math.sqrt(delta))) /( 2 * a);
                x2 = ((-b) - (Math.sqrt(delta))) /( 2 * a);
                System.out.println("PT co 2 nghiem phan biet: ");
                System.out.println("x1= " + x1);
                System.out.println("x2= " + x2);
            }
        }
    }
}
