/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NhanVien;

import java.util.*;

/**
 *
 * @author chung
 */
public class QLNV {

    Scanner _sc = new Scanner(System.in);
    List<NhanVien> _lstNV = new ArrayList<>();
    NhanVien _nv;
    Check _c = new Check();

    public String getInputValue(String str) {
        System.out.print(str);
        return _sc.nextLine();
    }

    public void input() {
        String Y_N;
        do {
            String maNV = _c.checkMaNV();
            if (maNV == null || maNV.trim().equalsIgnoreCase("")) {
                break;
            }
            String hoten = _c.checkHoTen();
            if (hoten == null || hoten.trim().equalsIgnoreCase("")) {
                break;
            }
            double luong = _c.checkLuong();
            String loaiNV = getInputValue("chon loai nhan vien (tiep thi || truong phong): ");
            if (loaiNV.trim().equalsIgnoreCase("tiep thi")) {
                double doanhSo = _c.checkDoanhso();
                double hoaHong = _c.checkHoaHong();
                _lstNV.add(new TiepThi(doanhSo, hoaHong, maNV, hoten, luong));
            } else if (loaiNV.trim().equalsIgnoreCase("truong phong")) {
                double trachNhiem = _c.checkTrachNhiem();

                _lstNV.add(new TruongPhong(trachNhiem, maNV, hoten, luong));
            }
            Y_N = getInputValue("ban co muon tiep tuc nhap them nhan vien Y_N: ");
        } while (Y_N.equalsIgnoreCase("y"));
    }

    public void output() {
        for (NhanVien nv : _lstNV) {
            nv.inThongTin();
        }
    }
}
