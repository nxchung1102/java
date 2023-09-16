/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Domain_model.*;
import Domain_model.DongSP;
import Domain_model.ChucVu;
import Domain_model.SanPham;
import Repositories.Repo_CV;
import View_Model.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author chung
 */
public class CV_impl implements DAO_CV {

    private Repo_CV repo = new Repo_CV();

    @Override
    public ArrayList<VMChucVu> getAllPosition() {
        ArrayList<VMChucVu> lstV_p = new ArrayList<>();
        ArrayList<ChucVu> lstc = repo.getlistPosition();
        for (ChucVu p : lstc) {
            VMChucVu vp = new VMChucVu(p.getId(), p.getMa(), p.getTen());
            lstV_p.add(vp);
        }
        return lstV_p;
    }

    @Override
    public String addNewPosition(VMChucVu V_p) {
        ChucVu p = new ChucVu(V_p.getMa(), V_p.getTen());
        if (repo.addNewPosition(p)) {
            return "success";
        } else {
            return "faild";
        }
    }

    @Override
    public String UpdatePosition(String id, VMChucVu V_p) {
        ChucVu p = new ChucVu(V_p.getMa(), V_p.getTen());
        if (repo.UpdatePosition(id, p)) {
            return "success";
        } else {
            return "faild";
        }
    }

    @Override
    public String DeletePosition(String id) {
        if (repo.DeletePosition(id)) {
            return "success";
        } else {
            return "faild";
        }
    }

  
}
