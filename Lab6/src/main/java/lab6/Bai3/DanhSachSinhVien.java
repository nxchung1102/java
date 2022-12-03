/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6.Bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author chung
 */
public class DanhSachSinhVien {

    Scanner sc = new Scanner(System.in);
    List<SinhVien> lstSV = new ArrayList<>();

    public void input() {
        int n;
        System.out.print("nhap so luong sinh vien: ");
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            SinhVien sv = new SinhVien();
            sv.nhap();
            lstSV.add(sv);
        }
    }

    public void output() {
        System.out.println("danh sach sinh vien:");
        System.out.printf("%-20s | %-30s | %-12s | %-12s \n", "hoten", "email", "sdt", "cmnd");
        for (SinhVien sv : lstSV) {
            sv.xuat();
        }
    }

    public static String toUpperFirstChar(String name) {
        String[] ars = name.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ars.length; i++) {
            String item = ars[i];
            if (!item.equals("")) {
                String ch = item.substring(0, 1).toUpperCase();
                item = ch + item.substring(1).toLowerCase();
                sb.append(item).append(" ");
            }
        }
        return sb.toString().trim();
    }

    public void getToUpperFirstChar() {
        for (SinhVien sv : lstSV) {
            System.out.println(toUpperFirstChar(sv.getHoten()));
        }
    }

    public void menu() {
        do {
            System.out.println("+--------------MENU--------------+");
            System.out.println("|1.Nhập                          |");
            System.out.println("|2.Xuất                          |");
            System.out.println("|3.UpperFirstChar                |");
            System.out.println("|4.Thoát                          |");
            System.out.println("+--------------****--------------+");
            int key = Integer.parseInt(sc.nextLine());
            switch (key) {
                case 1:
                    input();
                    break;
                case 2:
                    output();
                    break;
                case 3:
                    getToUpperFirstChar();
                    break;
                case 4:
                    System.exit(0);
            }
        } while (true);
    }
}
