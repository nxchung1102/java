/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Domain_model.HoaDonChiTiet;
import Repositories.Repo_HDCT;
import View_Model.VMHoaDonChiTiet;
import java.util.ArrayList;

/**
 *
 * @author chung
 */
public class HDCT_impl implements DAO_HDCT{
        private Repo_HDCT repo = new Repo_HDCT();
 
    @Override
    public ArrayList<VMHoaDonChiTiet> getAllHDCT() {
        ArrayList<VMHoaDonChiTiet> lstVhdct = new ArrayList<>();
        ArrayList<HoaDonChiTiet> lsthdct = repo.getListHDCT();
        for (HoaDonChiTiet h : lsthdct) {
            VMHoaDonChiTiet Vhdct = new VMHoaDonChiTiet(h.getIdHoaDon(), h.getIdChiTietSP(), h.getSoLuong(), h.getDonGia());
            lstVhdct.add(Vhdct);
        }
        return lstVhdct;
    }

    @Override
    public String addNewHDCT(VMHoaDonChiTiet V_hdct) {
        HoaDonChiTiet h = new HoaDonChiTiet(V_hdct.getIdHoaDon(), V_hdct.getIdChiTietSP(), V_hdct.getSoLuong(), V_hdct.getDonGia());
        if (repo.insertHDCT(h)) {
            return "success";
        } else {
            return "faild";
        }
    }

    @Override
    public String UpdateHDCT(String id, VMHoaDonChiTiet V_hdct) {
        HoaDonChiTiet h = new HoaDonChiTiet(V_hdct.getSoLuong(), V_hdct.getDonGia());
        if (repo.updateHDCT(id, h)) {
            return "success";
        } else {
            return "faild";
        }
    }

    @Override
    public String DeleteHDCT(String id1,String id2) {
        if (repo.deleteHDCT(id1,id2)) {
            return "success";
        } else {
            return "faild";
        }
    }


}
