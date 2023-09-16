/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Domain_model.KhachHang;
import Repositories.Repo_KH;
import View_Model.VMKhachHang;
import java.util.ArrayList;

/**
 *
 * @author chung
 */
public class KH_impl implements DAO_KH{
        private Repo_KH repo = new Repo_KH();
    @Override
    public ArrayList<VMKhachHang> getAllCustomer() {
        ArrayList<VMKhachHang> lstViewC = new ArrayList<>();
        ArrayList<KhachHang> lstc = repo.getlistCustomer();
        for (KhachHang c : lstc) {
            VMKhachHang vc = new VMKhachHang(c.getId(), c.getMa(), c.getTen(), c.getTenDem(), c.getHo(), c.getNgaySinh(), c.getSdt(), c.getDiaChi(), c.getThanhPho(), c.getQuocGia(), c.getMatKhau());
            lstViewC.add(vc);
        }
        return lstViewC;
    }

    @Override
    public String addNewCustomer(VMKhachHang V_c) {
        KhachHang c = new KhachHang(V_c.getMa(), V_c.getTen(), V_c.getTenDem(), V_c.getHo(), V_c.getNgaySinh(), V_c.getSdt(), V_c.getDiaChi(), V_c.getThanhPho(), V_c.getQuocGia(), V_c.getMatKhau());
        if (repo.addNewCustomer(c)) {
            return "success";
        } else {
            return "faild";
        }
    }

    @Override
    public String UpdateCustomer(String id, VMKhachHang V_c) {
        KhachHang c = new KhachHang(V_c.getMa(), V_c.getTen(), V_c.getTenDem(), V_c.getHo(), V_c.getNgaySinh(), V_c.getSdt(), V_c.getDiaChi(), V_c.getThanhPho(), V_c.getQuocGia(), V_c.getMatKhau());
        if (repo.UpdateCustomer(id, c)) {
            return "success";
        } else {
            return "faild";
        }
    }

    @Override
    public String DeleteCustomer(String id) {
        if (repo.DeleteCustomer(id)) {
            return "success";
        } else {
            return "faild";
        }
    }

}
