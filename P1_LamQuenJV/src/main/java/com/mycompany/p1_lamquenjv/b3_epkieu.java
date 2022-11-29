/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p1_lamquenjv;

/**
 *
 * @author chung
 */
public class b3_epkieu {
        public static void main(String[] args) {
        /*
            1. ép kiểu
        -là gán gtri của 1 biến có data type này sang data type khác
            2. các loại ép kiểu
        - nới rộng (widening) ép kiểu có kích thước từ bé-> lớn
        => không mất đi thông tin
        - thu hép (narrowing) ép kiểu có kích thước từ lớn-> bé
        => mất thông tin
        * 8 kiểu dữ liệu boolean, byte, char, short, int, long, float, double
        */
        int a =5;
        double b = 9.6;
        a = (int)b; // ép kiểu tường mình
        b=a; // ép kiểu ngầm định
        
        String tienLuong = "2000" ,thuong = "1000";
                String ketQua = tienLuong + thuong;
                System.out.println("kết quả = "+ketQua);
                int tong = Integer.parseInt(tienLuong)+ Integer.parseInt(thuong);
        System.out.println("tổng = "+tong);
    }
}
