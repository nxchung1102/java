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
public class Main_menu {

    Scanner sc = new Scanner(System.in);
    Bai1 menu1 = new Bai1();
    Menu menu2 = new Menu();
    Menu2 menu3 = new Menu2();

    public void mainMenu() {
        int choice;
        String Y_N;
        do {
            System.out.println("-------------------------------------------------");
            System.out.println("---------------Table of contents-----------------");
            System.out.println("----------------1. Lesson1-----------------------");
            System.out.println("----------------2. Lesson2-----------------------");
            System.out.println("----------------3. Lesson3-----------------------");
            System.out.println("-------------------------------------------------");
            System.out.print("please enter options: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    menu1.input();
                    menu1.output();
                    break;
                case 2:
                    menu2.menuLesson2();
                    break;
                case 3:
                    menu3.menuLesson3();
                    break;
            }
            System.out.println("do you want to continue program (Y/N)");
            Y_N = sc.nextLine();
            if (Y_N.equalsIgnoreCase("N")) {
                return;
            }
        } while (Y_N.equalsIgnoreCase("Y"));

    }
}
