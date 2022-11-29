/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b5_oop_HuongDoiTuong;

/**
 *
 * @author chung
 */
public class QLSV {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien("ph29917", "chung21", 2002, 10);
        //System.out.println("result: "+sv1.toString());
        System.out.println("============");
        sv1.inThongTin();
        SinhVien sv2 = new SinhVien();
        sv2.setMSV("PH6666");
        sv2.setHoTen("hello");
        sv2.setNaamSinh(2000);
        sv2.setDiem(6);
        System.out.println("sv2: "+sv2.toString());
        System.out.println("MSV: "+sv2.getMSV());
        
    }


}
