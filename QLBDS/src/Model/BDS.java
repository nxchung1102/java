/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author chung
 */
public class BDS {
    private String maBDS,tenBDS,diaChi,dienThoai;
    private int trangThai;

    public BDS() {
    }

    public BDS(String maBDS, String tenBDS, String diaChi, String dienThoai, int trangThai) {
        this.maBDS = maBDS;
        this.tenBDS = tenBDS;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
        this.trangThai = trangThai;
    }

    public BDS(String tenBDS, String diaChi, String dienThoai, int trangThai) {
        this.tenBDS = tenBDS;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
        this.trangThai = trangThai;
    }
    

    public String getMaBDS() {
        return maBDS;
    }

    public void setMaBDS(String maBDS) {
        this.maBDS = maBDS;
    }

    public String getTenBDS() {
        return tenBDS;
    }

    public void setTenBDS(String tenBDS) {
        this.tenBDS = tenBDS;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    public String getTT(int tt){
    if(tt==0){
    return "chưa bán";
    }
    return "đã bán";
    }
}
