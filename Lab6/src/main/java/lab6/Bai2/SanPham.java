/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6.Bai2;

import java.util.*;

/**
 *
 * @author chung
 */
public class SanPham {

    Scanner sc = new Scanner(System.in);
    private String name;
    private double donGia;
    private String hang;

    public SanPham() {
    }

    public SanPham(String name, double donGia, String hang) {
        this.name = name;
        this.donGia = donGia;
        this.hang = hang;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public void nhap() {
        System.out.print("nhap ten san pham: ");
        name = sc.nextLine();
        System.out.print("nhap gia: ");
        donGia = Double.parseDouble(sc.nextLine());
        System.out.print("nhap hang: ");
        hang = sc.nextLine();
    }

    @Override
    public String toString() {
        return "SanPham{" + "name=" + name + ", donGia=" + donGia + ", hang=" + hang + '}';
    }

}
