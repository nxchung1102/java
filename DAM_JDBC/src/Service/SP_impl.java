/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Domain_model.SanPham;
import Repositories.Repo_SP;
import View_Model.VMSanPham;
import java.util.ArrayList;

/**
 *
 * @author chung
 */
public class SP_impl implements DAO_SP{
   private Repo_SP repo = new Repo_SP();
    @Override
    public ArrayList<VMSanPham> getAllSP() {
        ArrayList<VMSanPham> lstV_sp = new ArrayList<>();
        ArrayList<SanPham> lstsp = repo.getListSP();
        for (SanPham sp : lstsp) {
            VMSanPham vsp = new VMSanPham(sp.getId(), sp.getMa(), sp.getTen());
            lstV_sp.add(vsp);
        }
        return lstV_sp;
    }

    @Override
    public String addNewSP(VMSanPham V_sp) {
        SanPham sp = new SanPham(V_sp.getMa(), V_sp.getTen());
        if (repo.insertSP(sp)) {
            return "success";
        } else {
            return "faild";
        }
    }

    @Override
    public String UpdateSP(String id, VMSanPham V_sp) {
        SanPham sp = new SanPham(V_sp.getMa(), V_sp.getTen());
        if (repo.UpdateSP(id, sp)) {
            return "success";
        } else {
            return "faild";
        }
    }

    @Override
    public String DeleteSP(String id) {
        if (repo.DeleteSP(id)) {
            return "success";
        } else {
            return "faild";
        }
    }
  
}
