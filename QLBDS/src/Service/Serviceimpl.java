/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.BDS;
import Repository.Repository;
import java.util.ArrayList;

/**
 *
 * @author chung
 */
public class Serviceimpl implements Service {

    Repository rp = new Repository();

    @Override
    public ArrayList<BDS> getAll() {
        ArrayList<BDS> lstb = new ArrayList<>();
        return lstb = rp.getAll();
    }

    @Override
    public String add(BDS b) {
        if (rp.addNew(b)) {
            return "thanh cong";
        }
        return "that bai";
    }

    @Override
    public String up(String ma, BDS b) {
        if (rp.Up(ma, b)) {
            return "thanh cong";
        }
        return "that bai";
    }

    @Override
    public String del(String ma) {
        if (rp.del(ma)) {
            return "thanh cong";
        }
        return "that bai";
    }

}
