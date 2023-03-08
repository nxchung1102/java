
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author chung
 */
public class Oto extends PhuongTien {

    private String loaiNhienLieu;

    public Oto() {
    }

    public Oto(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public Oto(String loaiNhienLieu, String maPT, String tenPT, String tenHangSanXuat, String tenQuocGia, int namSX) {
        super(maPT, tenPT, tenHangSanXuat, tenQuocGia, namSX);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("loai nhien lieu: " + loaiNhienLieu);
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("nhap loai nhien lieu: ");
        this.loaiNhienLieu = sc.nextLine();
    }

    @Override
    double getVanToc() {
        return 100;
    }
    

}
