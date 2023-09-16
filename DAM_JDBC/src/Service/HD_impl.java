/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Domain_model.HoaDon;
import Repositories.Repo_HD;
import View_Model.VMHoaDon;
import java.util.ArrayList;

/**
 *
 * @author chung
 */
public class HD_impl implements DAO_HD{
        private Repo_HD repo = new Repo_HD();
 @Override
    public ArrayList<VMHoaDon> getAllHD() {
        ArrayList<VMHoaDon> lstVhd = new ArrayList<>();
        ArrayList<HoaDon> lsthd = repo.getListHD();
        for (HoaDon h : lsthd) {
            VMHoaDon Vhd = new VMHoaDon(h.getId(), h.getIdKH(), h.getIdNV(), h.getMa(), h.getNgayTao(), h.getNgayThanhToan(), h.getNgayShip(), h.getNgayNhan(), h.getTinhTrang(), h.getTenNguoiNhan(), h.getDiaChi(), h.getSdt());
            lstVhd.add(Vhd);
        }
        return lstVhd;
    }

    @Override
    public String addNewHD(VMHoaDon V_hd) {
        HoaDon h = new HoaDon(V_hd.getIdKH(), V_hd.getIdNV(), V_hd.getMa(), V_hd.getNgayTao(), V_hd.getNgayThanhToan(), V_hd.getNgayShip(), V_hd.getNgayNhan(), V_hd.getTinhTrang(), V_hd.getTenNguoiNhan(), V_hd.getDiaChi(), V_hd.getSdt());
        if (repo.insertHD(h)) {
            return "success";
        } else {
            return "faild";
        }
    }

    @Override
    public String UpdateHD(String id, VMHoaDon V_hd) {
        HoaDon h = new HoaDon(V_hd.getIdKH(), V_hd.getIdNV(), V_hd.getMa(), V_hd.getNgayTao(), V_hd.getNgayThanhToan(), V_hd.getNgayShip(), V_hd.getNgayNhan(), V_hd.getTinhTrang(), V_hd.getTenNguoiNhan(), V_hd.getDiaChi(), V_hd.getSdt());
        if (repo.updateHD(id, h)) {
            return "success";
        } else {
            return "faild";
        }
    }

    @Override
    public String DeleteHD(String id) {
        if (repo.deleteHD(id)) {
            return "success";
        } else {
            return "faild";
        }
    }

}
