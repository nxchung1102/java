/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NhanVien;

/**
 *
 * @author chung
 */
public class TruongPhong extends NhanVien{
    private double TrachNhiem;

    @Override
    double getThuNhap() {
    return getLuong() + TrachNhiem;
    }
    
    

    public TruongPhong() {
    }

    public TruongPhong(double TrachNhiem) {
        this.TrachNhiem = TrachNhiem;
    }

    public TruongPhong(double TrachNhiem, String maNV, String hoTen, double luong) {
        super(maNV, hoTen, luong);
        this.TrachNhiem = TrachNhiem;
    }

    @Override
    public void inThongTin() {
        super.inThongTin(); 
        System.out.println("trach nhiem: "+TrachNhiem);
    }
    
    
}
