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
public class bai2 {

    public  void bangCuuChuong() {
        for (int i = 1; i < 10; i++) {
            System.out.printf("bang nhan %d \n",i);
            for (int j = 1; j <= 10; j++) {
                
                System.out.print(i + " x " + j + " = " + (i * j));
                 System.out.println("");
            }
           
        }

    }

}
