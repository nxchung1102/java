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
public class Menu {

    Scanner sc = new Scanner(System.in);
    Bai2 bai2 = new Bai2();

    public void menuLesson2() {
        int choice;
        String Y_N;

        do {
            System.out.println("-----------------------------------------------");
            System.out.println("---------------select function-----------------");
            System.out.println("-----1. enter a list of name-------------------");
            System.out.println("-----2. export a list of name------------------");
            System.out.println("-----3. output random list---------------------");
            System.out.println("-----4. sort list descending-------------------");
            System.out.println("-----5. find and delete name from keyboard-----");
            System.out.println("-----6. exit-----------------------------------");
            System.out.println("-----------------------------------------------");
            System.out.print("please enter options: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    bai2.inputName();
                    break;
                case 2:

                    bai2.output();
                    break;
                case 3:

                    bai2.random();
                    bai2.output();
                    break;
                case 4:

                    bai2.arrange();
                    bai2.output();
                    break;
                case 5:

                    bai2.del();
                    bai2.output();
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
