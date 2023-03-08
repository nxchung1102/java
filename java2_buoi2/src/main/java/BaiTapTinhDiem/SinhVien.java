/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapTinhDiem;

/**
 *
 * @author chung
 */
public abstract class SinhVien {
    public String HoTen;
    abstract public double getDiemTB();

    public SinhVien() {
    }

    public SinhVien(String HoTen) {
        this.HoTen = HoTen;
    }
    

    @Override
    public String toString() {
        return "SinhVien{" + "HoTen=" + HoTen + '}';
    }
    
    
}
