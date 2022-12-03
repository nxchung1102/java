/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NhanVien;

/**
 *
 * @author chung
 */
public class TiepThi extends NhanVien {

    private double doanhSo;
    private double hoaHong;

    public TiepThi() {
    }

    public TiepThi(double doanhSo, double hoaHong) {
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    public TiepThi(double doanhSo, double hoaHong, String maNV, String hoTen, double luong) {
        super(maNV, hoTen, luong);
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    @Override
    double getThuNhap() {
        return getLuong() + doanhSo * hoaHong;
    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHoaHong() {
        return hoaHong;
    }

    public void setHoaHong(double hoaHong) {
        this.hoaHong = hoaHong;
    }

    @Override
    public void inThongTin() {
        super.inThongTin(); 
        System.out.println("doanh so: "+doanhSo);
        System.out.println("hoa hong: "+hoaHong);
    }
    

}
