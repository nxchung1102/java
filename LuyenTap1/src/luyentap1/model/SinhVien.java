/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyentap1.model;

import java.io.Serializable;

/**
 *
 * @author chung
 */
public class SinhVien implements Serializable{
    private String hoTen,goiTinh;
    private int namSinh;
    private  String diaChi;

    public SinhVien() {
    }

    public SinhVien(String hoTen, String goiTinh, int namSinh, String diaChi) {
        this.hoTen = hoTen;
        this.goiTinh = goiTinh;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGoiTinh() {
        return goiTinh;
    }

    public void setGoiTinh(String goiTinh) {
        this.goiTinh = goiTinh;
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
        return "SinhVien{" + "hoTen=" + hoTen + ", goiTinh=" + goiTinh + ", namSinh=" + namSinh + ", diaChi=" + diaChi + '}';
    }
    
}
