/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Sevice;

import Model.Account;
import Model.San_Pham;
import java.util.*;

public interface QuanLyCuaHang {

    public ArrayList<San_Pham> getListSP();

    public String themAccount(Account acc);

    public String themSP(San_Pham s);

    public String suaSP(San_Pham sp);

    public String xoaSP(String tenSP);

    public San_Pham timsp(String maSP);

    public boolean dangNhap(String tk, String mk);

    public boolean suaEmail(String passWord, String Oldemail);

    public boolean accTonTai(String tk);

    public boolean gmailTonTai(String gmail);
    
    public ArrayList<San_Pham> sapXep();

}
