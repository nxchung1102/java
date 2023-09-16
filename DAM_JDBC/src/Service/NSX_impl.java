/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Domain_model.NSX;
import Repositories.Repo_NSX;
import View_Model.VMNSX;
import java.util.ArrayList;

/**
 *
 * @author chung
 */
public class NSX_impl implements DAO_NSX{
    
        private Repo_NSX repo = new Repo_NSX();
    @Override
    public ArrayList<VMNSX> getAllNSX() {
        ArrayList<VMNSX> lstV_nsx = new ArrayList<>();
        ArrayList<NSX> lstnsx = repo.getListNSX();
        for (NSX nsx : lstnsx) {
            VMNSX vnsx = new VMNSX(nsx.getId(), nsx.getMa(), nsx.getTen());
            lstV_nsx.add(vnsx);
        }
        return lstV_nsx;
    }

    @Override
    public String addNewNSX(VMNSX V_nsx) {
        NSX nsx = new NSX(V_nsx.getMa(), V_nsx.getTen());
        if (repo.insertNSX(nsx)) {
            return "success";
        } else {
            return "faild";
        }
    }

    @Override
    public String UpdateNSX(String id, VMNSX V_nsx) {
        NSX nsx = new NSX(V_nsx.getMa(), V_nsx.getTen());
        if (repo.UpdateNSX(id, nsx)) {
            return "success";
        } else {
            return "faild";
        }
    }

    @Override
    public String DeleteNSX(String id) {
        if (repo.DeleteNSX(id)) {
            return "success";
        } else {
            return "faild";
        }
    }

 
}
