/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6.Bai2;

import java.util.Scanner;
import java.util.*;

/**
 *
 * @author chung
 */
public class Bai2 {

    public static void main(String[] args) {
        List<SanPham> lstSP = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            SanPham sp = new SanPham();
            sp.nhap();
            lstSP.add(sp);

        }
        for (SanPham sp : lstSP) {
            if (sp.getHang().equalsIgnoreCase("nokia")) {
                System.out.println(sp);
            }
        }

    }
}
