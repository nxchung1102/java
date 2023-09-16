/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service_IMPL;

import Model.Account;
import Model.Category;
import Model.SmartPhone;
import Model.view.Stocker;
import asm_jv3.Repository.Repository;
import asm_jv3.view.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author chung
 */
public class QLSPServiceIMPL implements Service.QLSPService {

    private Repository repo = new Repository();
    private Account acc = new Account();

    @Override
    public void exit() {
        System.exit(0);
    }

    @Override
    public String login(String name, String pass) {
        if (repo.login(name, pass) != null) {
            this.acc = repo.login(name, pass);
            return "success";

        }
        return "falid";
    }

    @Override
    public Integer checkRole(String name, String pass) {
        if (repo.login(name, pass) == null) {
            return -1;
        } else if (repo.login(name, pass).getRole() == null) {
            return -1;
        }
        if (repo.login(name, pass).getRole() == 0) {
            return 0;
        } else if (repo.login(name, pass).getRole() == 1) {
            return 1;
        } else if (repo.login(name, pass).getRole() == 2) {
            return 2;
        } else if (repo.login(name, pass).getRole() == 3) {
            return 3;
        }
        return -1;
    }

    @Override
    public ArrayList<SmartPhone> getListStocker() {
        ArrayList<SmartPhone> lstSp = new ArrayList<>();
        return lstSp = repo.getListStocker();
    }

    @Override
    public String importStocker(int id, int sl) {
        if (repo.importStocker(id, sl)) {
            return "success";
        } else {
            return "faild";
        }
    }

    @Override
    public String exportStocker(int id, int sl) {
        if (repo.exportStocker(id, sl)) {
            return "success";
        } else {
            return "faild";
        }
    }

    @Override
    public ArrayList<SmartPhone> getListPM() {
        ArrayList<SmartPhone> lstPM = new ArrayList<>();
        return lstPM = repo.getListPM();
    }

    @Override
    public String addPRD(SmartPhone sp) {
        if (repo.addPRD(sp)) {
            return "success";
        } else {
            return "faild";
        }
    }

    @Override
    public String updatePRD(int id, SmartPhone sp) {
        if (repo.findByID(id) == null) {
            return "not found product";
        } else if (repo.updatePRD(id, sp)) {
            return "update success";
        } else {
            return "update faild";
        }
    }

    @Override
    public String deletePRD(int id) {
        if (repo.delPRD(id)) {
            return "delete success";
        } else {
            return "delete faild";
        }
    }

    @Override
    public ArrayList<Category> getCBODisplay() {
        ArrayList<Category> lstC = new ArrayList<>();
        return lstC = repo.getCBODisplay();
    }

    @Override
    public ArrayList<SmartPhone> getCBOPM() {
        ArrayList<SmartPhone> lstPM = new ArrayList<>();
        return lstPM = repo.getListPM();
    }

    @Override
    public ArrayList<SmartPhone> find(int cateID, String name) {
        ArrayList<SmartPhone> lstSP = new ArrayList<>();
        return lstSP = repo.find(cateID, name);
    }

    @Override
    public boolean findById(int id) {
        if (repo.findByID(id) == null) {
            return false;
        }
        return true;
    }

    @Override
    public ArrayList<SmartPhone> getListUP() {
        ArrayList<SmartPhone> lstPM = new ArrayList<>();
        return lstPM = repo.getListPM();
    }

    @Override
    public String UpdatePrice(int id, double price) {
        if (repo.UpdatePrice(id, price)) {
            return "success";
        } else {
            return "faild";
        }
    }

    @Override
    public ArrayList<Account> getListAcc() {
        ArrayList<Account> lstAcc = new ArrayList<>();
        return  lstAcc = repo.getListAcc();
    }

}
