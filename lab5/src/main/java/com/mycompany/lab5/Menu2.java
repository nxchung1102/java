/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

import java.util.Scanner;

/**
 *
 * @author chung
 */
public class Menu2 {

    Scanner sc = new Scanner(System.in);
    Bai3 bai3 = new Bai3();

    public void menuLesson3() {
        String Y_N;
        int choice;
        do {
            System.out.println("-----------------------------------------------");
            System.out.println("------------Product Management-----------------");
            System.out.println("-----1. enter product from keyboard------------");
            System.out.println("-----2. sort list descending-------------------");
            System.out.println("-----3. find and delete name from keyboard-----");
            System.out.println("-----4. anverage price of product--------------");
            System.out.println("-----5. exit-----------------------------------");
            System.out.println("-----------------------------------------------");
            System.out.print("please enter options: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    bai3.input();
                    bai3.output();
                    break;
                case 2:
                    
                    bai3.arrange();
                    bai3.output();
                    break;
                case 3:
                    
                    bai3.del();
                    bai3.output();
                    break;
                case 4:
                   
                    bai3.avg();
                    bai3.output();
                    break;
            }
            System.out.println("do you want to continue program (Y/N)");
            Y_N = sc.nextLine();
//            if (Y_N.equalsIgnoreCase("N")) {
//                return;
//            }
        } while (Y_N.equalsIgnoreCase("Y"));

    }

}
