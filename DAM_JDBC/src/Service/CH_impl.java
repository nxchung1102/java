/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Domain_model.CuaHang;
import Repositories.Repo_CH;
import View_Model.VMCuaHang;
import java.util.ArrayList;

/**
 *
 * @author chung
 */
public class CH_impl implements DAO_CH{
        private Repo_CH repo = new Repo_CH();

    @Override
    public ArrayList<VMCuaHang> getAllCH() {
        ArrayList<VMCuaHang> lstVch = new ArrayList<>();
        ArrayList<CuaHang> lstch = repo.getListCH();
        for (CuaHang c : lstch) {
            VMCuaHang vch = new VMCuaHang(c.getId(), c.getMa(), c.getTen(), c.getDiaChi(), c.getThanhPho(), c.getQuocGia());
            lstVch.add(vch);
        }
        return lstVch;
    }

    @Override
    public String addNewCH(VMCuaHang V_ch) {
        CuaHang ch = new CuaHang(V_ch.getMa(), V_ch.getTen(), V_ch.getDiaChi(), V_ch.getThanhPho(), V_ch.getQuocGia());
        if (repo.insertCH(ch)) {
            return "success";
        } else {
            return "faild";
        }
    }

    @Override
    public String UpdateCH(String id, VMCuaHang V_ch) {
        CuaHang ch = new CuaHang(V_ch.getMa(), V_ch.getTen(), V_ch.getDiaChi(), V_ch.getThanhPho(), V_ch.getQuocGia());
        if (repo.updateCH(id, ch)) {
            return "success";
        } else {
            return "faild";
        }
    }

    @Override
    public String DeleteCH(String id) {
        if (repo.deleteCH(id)) {
            return "success";
        } else {
            return "faild";
        }
    }

}
