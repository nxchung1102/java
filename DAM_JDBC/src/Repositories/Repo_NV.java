/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Domain_model.NhanVien;
import Ultilities.DBConnection;
import java.sql.*;
import java.util.*;

/**
 *
 * @author chung
 */
public class Repo_NV {

    private DBConnection dbconnect;

    public ArrayList<NhanVien> getListNV() {
        String sql = "select Ma,Ten,GioiTinh,IdCH from NhanVien";
        ArrayList<NhanVien> lstnv = new ArrayList<>();
        try {
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMa(rs.getString("Ma"));
                nv.setTen(rs.getString("Ten"));
                nv.setGioiTinh(rs.getString("GioiTinh"));
                nv.setIdCH(rs.getString("IdCH"));
                lstnv.add(nv);
            }
            return lstnv;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean insertNV(NhanVien nv) {
        String sql = "insert into NhanVien(Ma,Ten,GioiTinh,IdCH) values(?,?,?,?)";
        try {
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, nv.getMa());
            ps.setObject(2, nv.getTen());
            ps.setObject(3, nv.getGioiTinh());
            ps.setObject(4, nv.getIdCH());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateNV(String id, NhanVien nv) {
        String sql = "update NhanVien setTen=?,GioiTinh=?,IdCH=? where ma = ?";
        try {
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, nv.getTen());
            ps.setObject(2, nv.getGioiTinh());
            ps.setObject(3, nv.getIdCH());
            ps.setObject(4, id);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteNV(String id) {
        String sql = "DELETE FROM NhanVien WHERE ma = ?";
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
