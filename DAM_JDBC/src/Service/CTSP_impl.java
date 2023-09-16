/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Domain_model.ChiTietSP;
import Repositories.Repo_CTSP;
import View_Model.VMChiTietSP;
import java.util.ArrayList;

/**
 *
 * @author chung
 */
public class CTSP_impl implements DAO_CTSP{
        private Repo_CTSP repo = new Repo_CTSP();
        
    @Override
    public ArrayList<VMChiTietSP> getAllCTSP() {
        ArrayList<VMChiTietSP> lstV_ctsp = new ArrayList<>();
        ArrayList<ChiTietSP> lstctsp = repo.getListChiTietSP();
        for (ChiTietSP ctsp : lstctsp) {
            VMChiTietSP vctsp = new VMChiTietSP(ctsp.getId(), ctsp.getIdSP(), ctsp.getIdNSX(), ctsp.getIdMauSac(), ctsp.getIdDongSP(), ctsp.getNamBH(), ctsp.getMoTa(), ctsp.getSoLuongTon(), ctsp.getGiaNhap(), ctsp.getGiaBan());
            lstV_ctsp.add(vctsp);
        }
        return lstV_ctsp;
    }

    @Override
    public String addNewCTSP(VMChiTietSP V_ctsp) {
        ChiTietSP ctsp = new ChiTietSP(V_ctsp.getIdSP(), V_ctsp.getIdNSX(), V_ctsp.getIdMauSac(), V_ctsp.getIdDongSP(), V_ctsp.getNamBH(), V_ctsp.getMoTa(), V_ctsp.getSoLuongTon(), V_ctsp.getGiaNhap(), V_ctsp.getGiaBan());
        if (repo.insertCTSP(ctsp)) {
            return "success";
        } else {
            return "faild";
        }
    }

    @Override
    public String UpdateCTSP(String id, VMChiTietSP V_ctsp) {
        ChiTietSP ctsp = new ChiTietSP(V_ctsp.getIdSP(), V_ctsp.getIdNSX(), V_ctsp.getIdMauSac(), V_ctsp.getIdDongSP(), V_ctsp.getNamBH(), V_ctsp.getMoTa(), V_ctsp.getSoLuongTon(), V_ctsp.getGiaNhap(), V_ctsp.getGiaBan());
        if (repo.updateCTSP(id, ctsp)) {
            return "success";
        } else {
            return "faild";
        }
    }

    @Override
    public String DeleteCTSP(String id) {
        if (repo.deleteCTSP(id)) {
            return "success";
        } else {
            return "faild";
        }
    }
}
