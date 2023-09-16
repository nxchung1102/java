/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author chung
 */
public class PhongHoc {

    private String id, ten;
    private int tang, soSV, TrangThai;

    public PhongHoc() {
    }

    public PhongHoc(String id, String ten, int tang, int soSV, int TrangThai) {
        this.id = id;
        this.ten = ten;
        this.tang = tang;
        this.soSV = soSV;
        this.TrangThai = TrangThai;
    }

    public PhongHoc(String ten, int tang, int soSV, int TrangThai) {
        this.ten = ten;
        this.tang = tang;
        this.soSV = soSV;
        this.TrangThai = TrangThai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTang() {
        return tang;
    }

    public void setTang(int tang) {
        this.tang = tang;
    }

    public int getSoSV() {
        return soSV;
    }

    public void setSoSV(int soSV) {
        this.soSV = soSV;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

     public String getTT(int tt) {
        if (tt == 1) {
            return "Bận";
        } else {
            return "Rảnh";
        }
    }
}
