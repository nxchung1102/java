/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thithujava2_de8;

import java.io.Serializable;

/**
 *
 * @author chung
 */
public class SinhVien implements Serializable{
    private String hoTen,Nganh;
    private  int ky;
    public String getTrangThai(int ky){
    if(ky < 3)return "ma mới";
    else return "lão làng";
    }

    public SinhVien() {
    }

    public SinhVien(String hoTen, String Nganh, int ky) {
        this.hoTen = hoTen;
        this.Nganh = Nganh;
        this.ky = ky;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
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
        return "SinhVien{" + "hoTen=" + hoTen + ", Nganh=" + Nganh + ", ky=" + ky + '}';
    }
    
}
