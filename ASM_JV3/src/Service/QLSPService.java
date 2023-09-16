/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Model.Account;
import Model.Category;
import Model.SmartPhone;
import Model.view.Stocker;
import java.util.ArrayList;

/**
 *
 * @author chung
 */
public interface QLSPService {

    public void exit();

    public String login(String name, String pass);

    public Integer checkRole(String name, String pass);

    public ArrayList<SmartPhone> getListStocker();

    public String importStocker(int id, int sl);

    public String exportStocker(int id, int sl);

    public ArrayList<SmartPhone> getListPM();

    public String addPRD(SmartPhone sp);

    public String updatePRD(int id, SmartPhone sp);

    public String deletePRD(int id);

    public ArrayList<Category> getCBODisplay();

    public ArrayList<SmartPhone> getCBOPM();

    public ArrayList<SmartPhone> find(int cateID, String name);

    public boolean findById(int id);

    public ArrayList<SmartPhone> getListUP();

    public String UpdatePrice(int id, double price);
    
    public ArrayList<Account> getListAcc();
}
