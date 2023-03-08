
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author chung
 */
public abstract class PhuongTien {

    private String maPT;
    private String tenPT;
    private String tenHangSanXuat;
    private String tenQuocGia;
    private int namSX;

    public PhuongTien() {
    }

    public PhuongTien(String maPT, String tenPT, String tenHangSanXuat, String tenQuocGia, int namSX) {
        this.maPT = maPT;
        this.tenPT = tenPT;
        this.tenHangSanXuat = tenHangSanXuat;
        this.tenQuocGia = tenQuocGia;
        this.namSX = namSX;
    }

    public String getMaPT() {
        return maPT;
    }

    public void setMaPT(String maPT) {
        this.maPT = maPT;
    }

    public String getTenPT() {
        return tenPT;
    }

    public void setTenPT(String tenPT) {
        this.tenPT = tenPT;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public String getTenQuocGia() {
        return tenQuocGia;
    }

    public void setTenQuocGia(String tenQuocGia) {
        this.tenQuocGia = tenQuocGia;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public void inThongTin() {
        System.out.println("ma PT: " + maPT);
        System.out.println("ten PT: " + tenPT);
        System.out.println("ten hang san xuat: " + tenHangSanXuat);
        System.out.println("ten quoc gia: " + tenQuocGia);
        System.out.println("nam san xuat: " + namSX);
        System.out.println("van toc: "+getVanToc()+" km/h");
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("====NHAP THONG TIN PHUONG TIEN====");
        System.out.print("nhap ma PT: ");
        this.maPT = sc.nextLine();
        System.out.print("nhap ten PT: ");
        this.tenPT = sc.nextLine();
        System.out.print("nhap hang SX: ");
        this.tenHangSanXuat = sc.nextLine();
        System.out.print("nhap quoc gia: ");
        this.tenQuocGia = sc.nextLine();
        System.out.print("nhap nam SX: ");
        this.namSX = Integer.parseInt(sc.nextLine());
    }
    abstract double getVanToc();
}
