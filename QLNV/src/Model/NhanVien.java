/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author chung
 */
public class NhanVien {
    private String ma,ho,tendem,ten,gioiTinh;

    public NhanVien() {
    }

    public NhanVien(String ma, String ho, String tendem, String ten, String gioiTinh) {
        this.ma = ma;
        this.ho = ho;
        this.tendem = tendem;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
    }

    public NhanVien(String ho, String tendem, String ten, String gioiTinh) {
        this.ho = ho;
        this.tendem = tendem;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
    }
    

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTendem() {
        return tendem;
    }

    public void setTendem(String tendem) {
        this.tendem = tendem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "ma=" + ma + ", ho=" + ho + ", tendem=" + tendem + ", ten=" + ten + ", gioiTinh=" + gioiTinh + '}';
    }
    
    
}
