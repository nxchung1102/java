/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NhanVien;

/**
 *
 * @author chung
 */
public abstract class NhanVien {

    private String maNV;
    private String hoTen;
    private double luong;

    abstract double getThuNhap();

    public double getThueTN() {
        double thueTN = 0;
        if (luong < 10000000 && luong > 0) {
            return thueTN = luong;
        } else if (luong >= 10000000 && luong < 15000000) {
            return thueTN = luong * 0.1;
        } else if (luong >= 15000000 && luong < 20000000) {
            return thueTN = luong * 0.12;
        } else {
            return thueTN = luong * 0.15;
        }
    }
    public void inThongTin() {
        System.out.println("Ma NV: " + maNV);
        System.out.println("Ho ten:" + hoTen);
        System.out.println("thu nhap: "+getThuNhap());
        System.out.println("thue thu nhap: "+getThueTN());
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
