/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btlamthem1.pkg14;

/**
 *
 * @author chung
 */
public class NhanVien {

    private String name;
    private String MaNV;
    private int Tuoi;

    public NhanVien() {
    }

    public NhanVien(String name, String MaNV, int Tuoi) {
        this.name = name;
        this.MaNV = MaNV;
        this.Tuoi = Tuoi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "name=" + name + ", MaNV=" + MaNV + ", Tuoi=" + Tuoi + '}';
    }

}
