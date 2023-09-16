/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Domain_model.MauSac;
import Repositories.Repo_MS;
import View_Model.VMMauSac;
import java.util.ArrayList;

/**
 *
 * @author chung
 */
public class MS_impl implements DAO_MS{
        private Repo_MS repo = new Repo_MS();
   @Override
    public ArrayList<VMMauSac> getAllMauSac() {
        ArrayList<VMMauSac> lstV_ms = new ArrayList<>();
        ArrayList<MauSac> lstms = repo.getListMauSac();
        for (MauSac ms : lstms) {
            VMMauSac vms = new VMMauSac(ms.getId(), ms.getMa(), ms.getTen());
            lstV_ms.add(vms);
        }
        return lstV_ms;
    }

    @Override
    public String addNewMauSac(VMMauSac V_ms) {
        MauSac ms = new MauSac(V_ms.getMa(), V_ms.getTen());
        if (repo.insertMauSac(ms)) {
            return "success";
        } else {
            return "faild";
        }
    }

    @Override
    public String UpdateMauSac(String id, VMMauSac V_ms) {
        MauSac ms = new MauSac(V_ms.getMa(), V_ms.getTen());
        if (repo.UpdateMauSac(id, ms)) {
            return "success";
        } else {
            return "faild";
        }
    }

    @Override
    public String DeleteMauSac(String id) {
        if (repo.DeleteMauSac(id)) {
            return "success";
        } else {
            return "faild";
        }
    }

}
