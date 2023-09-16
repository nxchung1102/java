/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Model.PhongHoc;
import java.util.ArrayList;

/**
 *
 * @author chung
 */
public interface QLPHService {

    public ArrayList<PhongHoc> getAll();

    public String addNew(PhongHoc ph);

    public boolean checkPhong(String tp);
    
    public String del(String ma);

    public String up(String ma,PhongHoc ph);
}
