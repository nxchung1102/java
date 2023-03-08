/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java2_buoi2;

/**
 *
 * @author chung
 */
public class SinhVienIT extends SinhVien {

    private double diemJV, diemCSS;

    public SinhVienIT() {
    }

    public SinhVienIT(double diemJV, double diemCSS) {
        this.diemJV = diemJV;
        this.diemCSS = diemCSS;
    }

    public double getDiemJV() {
        return diemJV;
    }

    public void setDiemJV(double diemJV) {
        this.diemJV = diemJV;
    }

    public double getDiemCSS() {
        return diemCSS;
    }

    public void setDiemCSS(double diemCSS) {
        this.diemCSS = diemCSS;
    }

    @Override
    public String toString() {
        return "SinhVienIT{" + "diemJV=" + diemJV + ", diemCSS=" + diemCSS + '}';
    }

    @Override
    public double getDiemTB() {
        return (diemJV * 2 + diemCSS) / 3;
    }

}
