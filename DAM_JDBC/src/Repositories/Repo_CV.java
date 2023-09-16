/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;


import Domain_model.ChucVu;
import Ultilities.DBConnection;
import java.sql.*;
import java.util.*;

/**
 *
 * @author chung
 */
public class Repo_CV {

    private DBConnection dbconnect;

    public ArrayList<ChucVu> getlistPosition() {
        ArrayList<ChucVu> lstp = new ArrayList<>();
        String sql = "select * from ChucVu";
        try {
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChucVu p = new ChucVu();
                p.setId(rs.getString("Id"));
                p.setMa(rs.getString("Ma"));
                p.setTen(rs.getString("Ten"));
                lstp.add(p);
            }
            return lstp;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean addNewPosition(ChucVu p) {
        String sql = "INSERT INTO ChucVu(Ma,Ten)\n"
                + "VALUES (?,?)";
        try {
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, p.getMa());
            ps.setObject(2, p.getTen());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean UpdatePosition(String id, ChucVu p) {
        String sql = "UPDATE ChucVu\n"
                + "SET Ma = ?, Ten = ?\n"
                + "WHERE Id=?";
        try {
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, p.getMa());
            ps.setObject(2, p.getTen());
            ps.setObject(3, id);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean DeletePosition(String id) {
        String sql = "DELETE FROM ChucVu WHERE Id = ?";
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
