/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author toi84
 */
public class San_Pham {

    private String maSP;
    private String tenSP;
    private Integer loai;
    private Integer soLuong;
    private Double gia;

    public San_Pham() {
    }

    public San_Pham(String maSP, String tenSP, Integer loai, Integer soLuong, Double gia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.loai = loai;
        this.soLuong = soLuong;
        this.gia = gia;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public Integer getLoai() {
        return loai;
    }

    public void setLoai(Integer loai) {
        this.loai = loai;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public String getLoaiQA() {
        if (this.loai == 0) {
            return "Dài";
        }
        return "Ngắn";
    }

    @Override
    public String toString() {
        return "Mã sản phẩm : " + maSP + ", Tên sản phẩm : " + tenSP + ", Loại : " + this.getLoaiQA() + ", Số lượng : " + soLuong + ", Giá : " + gia + "Đồng";
    }
    
    
}
