/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.model;

import java.io.Serializable;

/**
 *
 * @author chung
 */
public class SinhVien implements Serializable{

    private String hoTen;
    private int gioiTinh, namSinh;
    private String diaChi;

    public SinhVien() {
    }

    public SinhVien(String hoTen, int gioiTinh, int namSinh, String diaChi) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "hoTen=" + hoTen + ", gioiTinh=" + gioiTinh + ", namSinh=" + namSinh + ", diaChi=" + diaChi + '}';
    }

    public String getGioiTinh(int gt) {
        if (gt == 1) {
            return "nam";
        } else {
            return "nữ";
        }
    }

}
