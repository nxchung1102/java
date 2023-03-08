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
public class TruongPhong extends NhanVien {

    private double TrachNhiem;

    @Override
    public double getThueTN() {
        return super.getThueTN();
    }

    @Override
    public double getThuNhap() {
        return super.getThuNhap() + TrachNhiem;
    }

    public TruongPhong() {
    }

    public TruongPhong(double TrachNhiem) {
        this.TrachNhiem = TrachNhiem;
    }

    public TruongPhong(double TrachNhiem, String maNV, String hoTen, double luong) {
        super(maNV, hoTen, luong);
        this.TrachNhiem = TrachNhiem;
    }

    public double getTrachNhiem() {
        return TrachNhiem;
    }

    public void setTrachNhiem(double TrachNhiem) {
        this.TrachNhiem = TrachNhiem;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.printf("trach nhiem: %-10.0f \n", TrachNhiem);
    }

}
