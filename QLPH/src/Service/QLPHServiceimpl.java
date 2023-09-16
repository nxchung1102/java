/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.PhongHoc;
import Repository.Repository;
import java.util.ArrayList;

/**
 *
 * @author chung
 */
public class QLPHServiceimpl implements QLPHService {

    Repository repo = new Repository();

    @Override
    public ArrayList<PhongHoc> getAll() {
        ArrayList<PhongHoc> lstPH;
        return lstPH = repo.getAll();
    }

    @Override
    public String addNew(PhongHoc ph) {
        if (repo.addNew(ph)) {
            return "thanh cong";
        } else {
            return "that bai";
        }
    }

    @Override
    public boolean checkPhong(String tp) {
        if (repo.checkPhong(tp) != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String del(String ma) {
        if (repo.xoa(ma)) {
            return "thanh cong";
        } else {
            return "that bai";
        }
    }

    @Override
    public String up(String ma, PhongHoc ph) {
        if (repo.update(ma, ph)) {
            return "thanh cong";
        } else {
            return "that bai";
        }
    }

}
