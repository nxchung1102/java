/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeThiThu1;

/**
 *
 * @author chung
 */
public class Vaccine {
    private String MaVC;
    private String TenVC;
    private float ThoiGianTacDung;
    private String NgayHetHan;

    public Vaccine() {
    }

    public Vaccine(String MaVC, String TenVC, float ThoiGianTacDung, String NgayHetHan) {
        this.MaVC = MaVC;
        this.TenVC = TenVC;
        this.ThoiGianTacDung = ThoiGianTacDung;
        this.NgayHetHan = NgayHetHan;
    }

    public String getMaVC() {
        return MaVC;
    }

    public void setMaVC(String MaVC) {
        this.MaVC = MaVC;
    }

    public String getTenVC() {
        return TenVC;
    }

    public void setTenVC(String TenVC) {
        this.TenVC = TenVC;
    }

    public float getThoiGianTacDung() {
        return ThoiGianTacDung;
    }

    public void setThoiGianTacDung(float ThoiGianTacDung) {
        this.ThoiGianTacDung = ThoiGianTacDung;
    }

    public String getNgayHetHan() {
        return NgayHetHan;
    }

    public void setNgayHetHan(String NgayHetHan) {
        this.NgayHetHan = NgayHetHan;
    }
    public void inThongTin(){
        System.out.println("----------THONG TIN----------");
        System.out.println("ma VC: "+ MaVC);
        System.out.println("ten VC: "+ TenVC);
        System.out.println("ThoiGianTacDung VC: "+ ThoiGianTacDung);
        System.out.println("NgayHetHan VC: "+ NgayHetHan);
    }
}
