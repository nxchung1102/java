/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NhanVien;

import java.util.Scanner;

/**
 *
 * @author chung
 */
public class NhanVien {

    Scanner sc = new Scanner(System.in);
    private String maNV;
    private String hoTen;
    private double luong;

    public double getThuNhap() {
        return luong;
    }

    public double getThueTN() {

        if (getThuNhap() < 10000000 && getThuNhap() > 0) {
            return 0;
        } else if (getThuNhap() >= 10000000 && getThuNhap() < 15000000) {
            return getThuNhap() * 0.1;
        } else if (getThuNhap() >= 15000000 && getThuNhap() < 20000000) {
            return getThuNhap() * 0.12;
        } else {
            return getThuNhap() * 0.15;
        }
    }

    public void inThongTin() {
        System.out.println("Ma NV: " + maNV);
        System.out.println("Ho ten:" + hoTen);
        System.out.printf("luong: %-10.0f \n" , luong);
        System.out.printf("thu nhap: %-10.0f \n" , getThuNhap());
        System.out.printf("thue thu nhap: %-10.0f \n" , getThueTN());
    }

    public NhanVien() {
    }

    public NhanVien(String maNV, String hoTen, double luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

}
