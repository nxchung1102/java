/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm_jv3.Repository;

import Model.Account;
import Model.Category;
import Model.SmartPhone;
import Model.view.Stocker;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author chung
 */
public class Repository {

    private ConnectSQL_QLSP Dbconnection;

    public Account login(String userName, String password) {

        String sql = "select * from Account\n"
                + "where Username =? and Password = ?";
        try ( Connection con = Dbconnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, userName);
            ps.setObject(2, password);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Account acc = new Account();
                acc.setName(rs.getString("Username"));
                acc.setPass(rs.getString("Password"));
                acc.setRole(rs.getInt("Role"));
                return acc;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList<SmartPhone> getListStocker() {
        ArrayList<SmartPhone> lstSP = new ArrayList<>();
        String sql = "select Id,ProductName,Quantity from SmartPhone ";
        try {
            Connection con = Dbconnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SmartPhone sp = new SmartPhone();
                sp.setID(rs.getInt("Id"));
                sp.setName(rs.getString("ProductName"));
                sp.setQuantity(rs.getInt("Quantity"));
                lstSP.add(sp);
            }
            return lstSP;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean importStocker(int id, int sl) {
        String sql = "update SmartPhone set Quantity = Quantity +? \n"
                + "where ID = ?";
        try {
            Connection con = Dbconnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, sl);
            ps.setObject(2, id);
            int result = ps.executeUpdate();
            return 1 > 0;
        } catch (Exception e) {
        }
        return false;
    }

    public boolean exportStocker(int id, int sl) {
        String sql = "update SmartPhone set Quantity = Quantity -? \n"
                + "where ID = ?";
        try {
            Connection con = Dbconnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, sl);
            ps.setObject(2, id);
            int result = ps.executeUpdate();
            return 1 > 0;
        } catch (Exception e) {
        }
        return false;
    }

    public ArrayList<SmartPhone> getListPM() {
        ArrayList<SmartPhone> lstPM = new ArrayList<>();
        String sql = "select * from SmartPhone ";
        try {
            Connection con = Dbconnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SmartPhone sp = new SmartPhone();
                sp.setID(rs.getInt("Id"));
                sp.setCategoryId(rs.getInt("CategoryId"));
                sp.setName(rs.getString("ProductName"));
                sp.setQuantity(rs.getInt("Quantity"));
                sp.setCurrentPrice(rs.getDouble("CurrentPrice"));
                lstPM.add(sp);
            }
            return lstPM;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean addPRD(SmartPhone sp) {
        String sql = "insert into SmartPhone values(?,?,?,?)";
        try {
            Connection con = Dbconnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, sp.getCategoryId());
            ps.setObject(2, sp.getName());
            ps.setObject(3, sp.getCurrentPrice());
            ps.setObject(4, sp.getQuantity());
            int result = ps.executeUpdate();
            return result > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updatePRD(int id, SmartPhone sp) {
        String sql = "update SmartPhone set CategoryId =?, ProductName = ?\n"
                + "where Id = ?";
        try {
            Connection con = Dbconnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, sp.getCategoryId());
            ps.setObject(2, sp.getName());
            ps.setObject(3, id);
            int result = ps.executeUpdate();
            return result > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public SmartPhone findByID(int id) {
        SmartPhone sp = new SmartPhone();
        String sql = "select * from SmartPhone\n"
                + "where Id = ?";
        try {
            Connection con = Dbconnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                sp.setCategoryId(rs.getInt("CategoryId"));
                sp.setName(rs.getString("ProductName"));
                sp.setCurrentPrice(rs.getDouble("CurrentPrice"));
                sp.setQuantity(rs.getInt("Quantity"));
                return sp;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean delPRD(int id) {
        String sql = "delete SmartPhone where Id = ?";
        try {
            Connection con = Dbconnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, id);
            int result = ps.executeUpdate();
            return result > 0;
        } catch (Exception e) {
        }
        return false;
    }

    public ArrayList<Category> getCBODisplay() {
        ArrayList<Category> lstC = new ArrayList<>();
        String sql = "select * from Category";
        try {
            Connection con = Dbconnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Category c = new Category();
                c.setId(rs.getInt("Id"));
                c.setName(rs.getString("CategoryName"));
                lstC.add(c);
            }
            return lstC;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList<SmartPhone> find(int cateID, String name) {
        ArrayList<SmartPhone> lstSP = new ArrayList<>();
        String sql = "select * from SmartPhone\n"
                + "where (? = ProductName or ? is null or ? like '')\n"
                + "and (? = CategoryId or ? is null or ? like '')";
        try {
            Connection con = Dbconnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, name);
            ps.setObject(2, name);
            ps.setObject(3, name);
            ps.setObject(4, cateID);
            ps.setObject(5, cateID);
            ps.setObject(6, cateID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SmartPhone sp = new SmartPhone();
                sp.setID(rs.getInt("Id"));
                sp.setCategoryId(rs.getInt("CategoryId"));
                sp.setName(rs.getString("ProductName"));
                sp.setQuantity(rs.getInt("Quantity"));
                sp.setCurrentPrice(rs.getDouble("CurrentPrice"));
                lstSP.add(sp);
            }
            return lstSP;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean UpdatePrice(int id, double price) {
        String sql = "update SmartPhone set CurrentPrice = ? where Id = ?";
        try {
            Connection con = Dbconnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, price);
            ps.setObject(2, id);
            int result = ps.executeUpdate();
            return 1 > 0;
        } catch (Exception e) {
        }
        return false;
    }
    public ArrayList<Account> getListAcc() {
        ArrayList<Account> lstAcc = new ArrayList<>();
        String sql = "select * from Account";
        try {
            Connection con = Dbconnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Account acc = new Account();
                acc.setName(rs.getString("Username"));
                acc.setPass(rs.getString("Password"));
                acc.setRole(rs.getInt("Role"));
                lstAcc.add(acc);
            }
            return lstAcc;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
