/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapTinhDiem;

/**
 *
 * @author chung
 */
public class SinhVienMob extends SinhVien {

    public double DiemJv, DiemMob;

    public double getDiemJv() {
        return DiemJv;
    }
    

    public void setDiemJv(double DiemJv) {
        this.DiemJv = DiemJv;
    }

    public SinhVienMob(double DiemJv, double DiemMob, String HoTen) {
        super(HoTen);
        this.DiemJv = DiemJv;
        this.DiemMob = DiemMob;
    }
    

    public double getDiemMob() {
        return DiemMob;
    }

    public void setDiemMob(double DiemMob) {
        this.DiemMob = DiemMob;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    @Override
    public double getDiemTB() {
        return (DiemJv + DiemMob) / 2;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void inTT() {
        System.out.println("Ho Ten: " + HoTen);
        System.out.println("Diem Jv: " + DiemJv);
        System.out.println("Diem Mob: " + DiemMob);
        System.out.println("Diem Trung Binh: " + getDiemTB());
    }

}
