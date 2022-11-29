/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b5_oop_HuongDoiTuong;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chung
 */
public class SinhVien {
//private tất cả các thuộc tính của Sinh Viên
    private String MSV;
    private String hoTen;
    private int naamSinh;
    private double diem;
    //ctrl+ speace + enter
//constructor k tham số
    public SinhVien() {
    }
//constructor k tham số
    public SinhVien(String MSV, String hoTen, int naamSinh, double diem) {
        this.MSV = MSV;
        this.hoTen = hoTen;
        this.naamSinh = naamSinh;
        this.diem = diem;
    }
    // getter & setter
    //click chuột phải + insert code + getter and setter

    public String getMSV() {
        return MSV;
    }

    public void setMSV(String MSV) {
        this.MSV = MSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNaamSinh() {
        return naamSinh;
    }

    public void setNaamSinh(int naamSinh) {
        this.naamSinh = naamSinh;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

     //click chuột phải + insert code +  toString()
    @Override
    public String toString() {
        return "SinhVien{" + "MSV=" + MSV + ", hoTen=" + hoTen + ", naamSinh=" + naamSinh + ", diem=" + diem + '}';
    }
    public void inThongTin(){
        System.out.println("Thong Tin Sinh Vien");
        System.out.println("MSV:" + MSV);
        System.out.println("HVT: "+hoTen);
    }

    
}
