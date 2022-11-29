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
public class menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice=9;
        {
            do {
                System.out.println("+----------------------------------------+");
                System.out.println("+-----1.giai phuong trinh bac nhat ------+");
                System.out.println("+-----2.giai phuong trinh bac hai -------+");
                System.out.println("+-----3.tinh tien dien ------------------+");
                System.out.println("+-----4.ket thuc ------------------------+");
                System.out.println("+----------------------------------------+");
                System.out.println("nhap chuc nang ban muon:");
                choice = Integer.parseInt(sc.nextLine());
                if (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
                    System.out.println("ban da nhap sai moi nhap lai.");
                }

            } while (choice != 1 && choice != 2 && choice != 3 && choice != 4);

            switch (choice) {
                case 1:
                    giaiPTB1.chucnang1();
                    break;
                case 2:
                    giaiPTB2.main(args);
                    break;
                case 3:
                    tinhTienDien.main(args);
                    break;
            }
        }
    }

}
