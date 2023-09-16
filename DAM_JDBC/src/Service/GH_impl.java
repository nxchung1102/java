/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Domain_model.GioHang;
import Repositories.Repo_GH;
import View_Model.VMGioHang;
import java.util.ArrayList;

/**
 *
 * @author chung
 */
public class GH_impl implements DAO_GH{
        private Repo_GH repo = new Repo_GH();

    @Override
    public ArrayList<VMGioHang> getAllGH() {
        ArrayList<VMGioHang> lstVgh = new ArrayList<>();
        ArrayList<GioHang> lstgh = repo.getListGH();
        for (GioHang g : lstgh) {
            VMGioHang Vgh = new VMGioHang(g.getId(), g.getIdKH(), g.getIdNV(), g.getMa(), g.getNgayTao(), g.getNgayThanhToan(), g.getTenNguoiNhan(), g.getDiachi(), g.getSdt(), g.getTinhTrang());
            lstVgh.add(Vgh);
        }
        return lstVgh;
    }

    @Override
    public String addNewGH(VMGioHang V_gh) {
        GioHang g = new GioHang(V_gh.getIdKH(), V_gh.getIdNV(), V_gh.getMa(), V_gh.getNgayTao(), V_gh.getNgayThanhToan(), V_gh.getTenNguoiNhan(), V_gh.getDiachi(), V_gh.getSdt(), V_gh.getTinhTrang());
        if (repo.insertGH(g)) {
            return "success";
        } else {
            return "faild";
        }
    }

    @Override
    public String UpdateGH(String id, VMGioHang V_gh) {
        GioHang g = new GioHang(V_gh.getIdKH(), V_gh.getIdNV(), V_gh.getMa(), V_gh.getNgayTao(), V_gh.getNgayThanhToan(), V_gh.getTenNguoiNhan(), V_gh.getDiachi(), V_gh.getSdt(), V_gh.getTinhTrang());
        if (repo.updateGH(id, g)) {
            return "success";
        } else {
            return "faild";
        }
    }

    @Override
    public String DeleteGH(String id) {
        if (repo.deleteGH(id)) {
            return "success";
        } else {
            return "faild";
        }
    }

}
