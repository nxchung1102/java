/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Domain_model.NhanVien;
import Repositories.Repo_NV;
import View_Model.VMNhanVien;
import java.util.ArrayList;

/**
 *
 * @author chung
 */
public class NV_impl implements DAO_NV {

    private Repo_NV repo = new Repo_NV();

    @Override
    public ArrayList<VMNhanVien> getAllNV() {
        ArrayList<VMNhanVien> lstVnv = new ArrayList<>();
        ArrayList<NhanVien> lstnv = repo.getListNV();
        for (NhanVien n : lstnv) {
            VMNhanVien Vnv = new VMNhanVien(n.getMa(), n.getTen(), n.getGioiTinh(), n.getIdCH());
            lstVnv.add(Vnv);
        }
        return lstVnv;
    }

    @Override
    public String addNewNV(VMNhanVien V_nv) {
        NhanVien nv = new NhanVien(V_nv.getMa(), V_nv.getTen(), V_nv.getGioiTinh(), V_nv.getIdCH());
        if (repo.insertNV(nv)) {
            return "success";
        } else {
            return "faild";
        }
    }

    @Override
    public String UpdateNV(String id, VMNhanVien V_nv) {
        NhanVien nv = new NhanVien(V_nv.getMa(), V_nv.getTen(), V_nv.getGioiTinh(), V_nv.getIdCH());
        if (repo.updateNV(id, nv)) {
            return "success";
        } else {
            return "faild";
        }
    }

    @Override
    public String DeleteNV(String id) {
        if (repo.deleteNV(id)) {
            return "success";
        } else {
            return "faild";
        }
    }

}
