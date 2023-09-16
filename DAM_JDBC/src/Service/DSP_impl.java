/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Domain_model.DongSP;
import Repositories.Repo_DSP;
import View_Model.VMDongSP;
import java.util.ArrayList;

/**
 *
 * @author chung
 */
public class DSP_impl implements DAO_DSP{
      private Repo_DSP repo = new Repo_DSP();
    @Override
    public ArrayList<VMDongSP> getAllDSP() {
        ArrayList<VMDongSP> lstV_dsp = new ArrayList<>();
        ArrayList<DongSP> lstdsp = repo.getListDSP();
        for (DongSP dsp : lstdsp) {
            VMDongSP vdsp = new VMDongSP(dsp.getId(), dsp.getMa(), dsp.getTen());
            lstV_dsp.add(vdsp);
        }
        return lstV_dsp;
    }

    @Override
    public String addNewDSP(VMDongSP V_dsp) {
        DongSP dsp = new DongSP(V_dsp.getMa(), V_dsp.getTen());
        if (repo.insertDSP(dsp)) {
            return "success";
        } else {
            return "faild";
        }
    }

    @Override
    public String UpdateDSP(String id, VMDongSP V_dsp) {
        DongSP dsp = new DongSP(V_dsp.getMa(), V_dsp.getTen());
        if (repo.UpdateDSP(id, dsp)) {
            return "success";
        } else {
            return "faild";
        }
    }

    @Override
    public String DeleteDSP(String id) {
        if (repo.DeleteDSP(id)) {
            return "success";
        } else {
            return "faild";
        }
    }
  
}
