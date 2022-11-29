/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

import java.util.Scanner;

/**
 *
 * @author chung
 */
public class bai1 {

    public static boolean soNT(int a) {
        if (a <= 1) {

            return false;
        } else {
            for (int i = 2; i < Math.sqrt(a); i++) {
                if (a % i == 0) {
                    return false;
                }
            }
            return true;
        }

    }

    public  void prime() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("nhap so");
        n = Integer.parseInt(sc.nextLine());
        if (soNT(n)) {
            System.out.println(n + " la so nguyen to");
        } else {
            System.out.println(n + " khong phai la so nguyen to");
        }

    }
}
