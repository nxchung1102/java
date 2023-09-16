/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Domain_model.GioHangChiTiet;
import Repositories.Repo_GHCT;
import View_Model.VMGioHangChiTiet;
import java.util.ArrayList;

/**
 *
 * @author chung
 */
public class GHCT_impl implements DAO_GHCT{
        private Repo_GHCT repo = new Repo_GHCT();
    
    @Override
    public ArrayList<VMGioHangChiTiet> getAllGHCT() {
        ArrayList<VMGioHangChiTiet> lstVghct = new ArrayList<>();
        ArrayList<GioHangChiTiet> lstghct = repo.getListGHCT();
        for (GioHangChiTiet g : lstghct) {
            VMGioHangChiTiet Vghct = new VMGioHangChiTiet(g.getIdGioHang(), g.getIdChiTietSP(), g.getSoLuong(), g.getDonGia(), g.getDonGiaKhiGiam());
            lstVghct.add(Vghct);
        }
        return lstVghct;
    }

    @Override
    public String addNewGHCT(VMGioHangChiTiet V_ghct) {
        GioHangChiTiet g = new GioHangChiTiet(V_ghct.getIdGioHang(), V_ghct.getIdChiTietSP(), V_ghct.getSoLuong(), V_ghct.getDonGia(), V_ghct.getDonGiaKhiGiam());
        if (repo.insertGHCT(g)) {
            return "success";
        } else {
            return "faild";
        }
    }

    @Override
    public String UpdateGHCT(String id, VMGioHangChiTiet V_ghct) {
        GioHangChiTiet g = new GioHangChiTiet(V_ghct.getSoLuong(), V_ghct.getDonGia(), V_ghct.getDonGiaKhiGiam());
        if (repo.updateGHCT(id, g)) {
            return "success";
        } else {
            return "faild";
        }
    }

    @Override
    public String DeleteGHCT(String id1,String id2) {
        if (repo.deleteGHCT(id1,id2)) {
            return "success";
        } else {
            return "faild";
        }
    }

}
