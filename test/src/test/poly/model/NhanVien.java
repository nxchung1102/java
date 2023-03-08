/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.poly.model;

/**
 *
 * @author chung
 */
public class NhanVien {
    private String maNV;
    private String hoTen;

    public NhanVien() {
    }

    public NhanVien(String maNV, String hoTen) {
        this.maNV = maNV;
        this.hoTen = hoTen;
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

    @Override
    public String toString() {
        return "NhanVien{" + "maNV=" + maNV + ", hoTen=" + hoTen + '}';
    }
    
}
