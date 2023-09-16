/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Model.BDS;
import java.util.ArrayList;

/**
 *
 * @author chung
 */
public interface Service {

    public ArrayList<BDS> getAll();

    public String add(BDS b);

    public String up(String ma, BDS b);

    public String del(String ma);
}
