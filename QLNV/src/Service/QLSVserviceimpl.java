/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.NhanVien;
import Repository.Repository;
import java.util.ArrayList;

/**
 *
 * @author chung
 */
public class QLSVserviceimpl implements QLSVService {

    Repository repo = new Repository();

    @Override
    public ArrayList<NhanVien> getAll() {
        ArrayList<NhanVien> lstnv = new ArrayList<>();
        return lstnv = repo.getAll();
    }

    @Override
    public String del(String ma) {
        if (repo.del(ma)) {
            return "thanh cong";
        } else {
            return "that bai";
        }
    }

    @Override
    public String update(String ma, NhanVien nv) {
        if (repo.Update(ma, nv)) {
            return "thanh cong";
        } else {
            return "that bai";
        }
    }
}
