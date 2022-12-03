/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai10_Triu_Tuong;

/**
 *
 * @author chung
 */
public class Main {

    public static void main(String[] args) {
        Hinh hinh1 = new Hinh_Tam_Giac(3, 4, 5, "hinh tam giac");
        System.out.println("chu vi " + hinh1.getName() + " la " + hinh1.tinhChuVi());
        System.out.println("dien tich " + hinh1.getName() + " la " + hinh1.tinhDienTich());
        Hinh hinh2 = new Hinh_vuong(9, "hinh vuong");
        System.out.println("chu vi " + hinh2.getName() + " la " + hinh2.tinhChuVi());
        System.out.println("dien tich " + hinh2.getName() + " la " + hinh2.tinhDienTich());
    }

}
