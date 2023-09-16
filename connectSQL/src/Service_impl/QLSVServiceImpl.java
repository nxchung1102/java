/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service_impl;

import Repository.SinhVienRepository;
import Service.QLSVService;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.sinhvien;

/**
 *
 * @author chung
 */
public class QLSVServiceImpl implements QLSVService {

    private SinhVienRepository svr = new SinhVienRepository();

    @Override
    public ArrayList<sinhvien> getList() {
        return svr.getList();
    }

    @Override
    public String them(sinhvien sinhVien) {
        if (svr.addNew(sinhVien)) {
            return "them thanh cong";
        } else {
            return "them that bai";
        }
    }

    @Override
    public String update(int id, sinhvien sv) {
        //ktra sinh vien co ton tai hay khong
        //lay sinh vien theo id neu 0 co sinh vien nao thong bao k tim thay sinh vien de sua nguoc lai tien hanh update
        if (svr.findById(id) == null) {
            return "khong tim thay sinh vien";
        } else if (svr.update(id, sv)) {
            return "update success";
        } else {
            return "update failed";
        }
    }

    @Override
    public String delete(int id) {
        if (svr.findById(id) == null) {
            return "khong tim thay sinh vien";
        } else if (svr.delete(id)) {
            return "delete success";
        } else {
            return "delete failed";
        }
    }

}
