/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p1_lamquenjv.cauTrucReNhanh;

import java.util.Scanner;

/**
 *
 * @author chung
 */
public class switchCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------menu-----------");
        System.out.println("-1 trung luoc           -");
        System.out.println("-2 rau luoc             -");
        System.out.println("-3 thit luoc            -");
        System.out.println("-4 gao luoc             -");
        System.out.println("-------------------------");
        System.out.println("may chon mon nao ?");
        System.out.println("tao chon mon nay: ");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                System.out.println("day la mon trung luoc");
                break;
            case 2:
                System.out.println("day la mon trung luoc");
                break;
            case 3:
                System.out.println("day la mon trung luoc");
                break;
            case 4:
                System.out.println("day la mon trung luoc");
                break;
            default:
                System.out.println("an long xao dua :3");
        }

    }
}
