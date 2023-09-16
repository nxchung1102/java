/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;
import Domain_model.MauSac;
import Ultilities.DBConnection;
import java.sql.*;
import java.util.*;
/**
 *
 * @author chung
 */
public class Repo_MS {
            private DBConnection dbconnect;

    public ArrayList<MauSac> getListMauSac() {
        ArrayList<MauSac> lstMS = new ArrayList<>();
        String sql = "select * from MauSac";
        try {
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MauSac ms = new MauSac();
                ms.setId(rs.getString("Id"));
                ms.setMa(rs.getString("Ma"));
                ms.setTen(rs.getString("Ten"));
                lstMS.add(ms);
            }
            return lstMS;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean insertMauSac(MauSac ms) {
        String sql = "INSERT INTO MauSac(Ma,Ten)\n"
                + "VALUES (?,?)";
        try {
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, ms.getMa());
            ps.setObject(2, ms.getTen());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean UpdateMauSac(String id, MauSac ms) {
        String sql = "UPDATE MauSac\n"
                + "SET Ma = ?, Ten = ?\n"
                + "WHERE Id=?";
        try {
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, ms.getMa());
            ps.setObject(2, ms.getTen());
            ps.setObject(3, id);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean DeleteMauSac(String id) {
        String sql = "DELETE FROM MauSac WHERE Id = ?";
        try {
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, id);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
