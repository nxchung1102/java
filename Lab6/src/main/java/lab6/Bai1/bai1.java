/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6.Bai1;

import java.util.Scanner;

/**
 *
 * @author chung
 */
public class bai1 {

    Scanner sc = new Scanner(System.in);
    String input;

    public void nhapXuat() {

        System.out.println("nhap ho va ten:");
        input = sc.nextLine();
        input = input.trim();
        String[] fn = input.split("\\s");
        if (fn.length < 3) {
            System.out.println("can phai nhap day du ho ten.");
            return;
        }
        System.out.println("Ho viet hoa: " + fn[0].toUpperCase());
        System.out.println("Ten dem viet thuong: " + fn[1].toLowerCase());
        System.out.println("Ten viet hoa: " + fn[2].toUpperCase());

    }
}
