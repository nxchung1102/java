/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dethithujava2_de9;

import java.io.Serializable;

/**
 *
 * @author chung
 */
public class SinhVien implements Serializable{
    private String HoTen,Nganh;
    private int ky;
    public String getTrangThai(int ky){
    if(ky <3)return "ma mới";
    else return  "lão làng";
    }

    public SinhVien() {
    }

    public SinhVien(String HoTen, String Nganh, int ky) {
        this.HoTen = HoTen;
        this.Nganh = Nganh;
        this.ky = ky;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getNganh() {
        return Nganh;
    }

    public void setNganh(String Nganh) {
        this.Nganh = Nganh;
    }

    public int getKy() {
        return ky;
    }

    public void setKy(int ky) {
        this.ky = ky;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "HoTen=" + HoTen + ", Nganh=" + Nganh + ", ky=" + ky + '}';
    }
    
}
