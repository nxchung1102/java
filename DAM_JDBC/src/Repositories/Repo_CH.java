/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;
import Domain_model.CuaHang;
import Ultilities.DBConnection;
import java.sql.*;
import java.util.*;
/**
 *
 * @author chung
 */
public class Repo_CH {
            private DBConnection dbconnect;

    public ArrayList<CuaHang> getListCH() {
        ArrayList<CuaHang> lstch = new ArrayList<>();
        String sql = "select * from CuaHang";
        try {
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CuaHang c = new CuaHang();
                c.setId(rs.getString("Id"));
                c.setMa(rs.getString("Ma"));
                c.setTen(rs.getString("Ten"));
                c.setDiaChi(rs.getString("DiaChi"));
                c.setThanhPho(rs.getString("ThanhPho"));
                c.setQuocGia(rs.getString("QuocGia"));
                lstch.add(c);
            }
            return lstch;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean insertCH(CuaHang ch) {
        String sql = "insert into CuaHang(Ma,Ten,DiaChi,ThanhPho,QuocGia) values(?,?,?,?,?)";
        try {
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, ch.getMa());
            ps.setObject(2, ch.getTen());
            ps.setObject(3, ch.getDiaChi());
            ps.setObject(4, ch.getThanhPho());
            ps.setObject(5, ch.getQuocGia());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateCH(String id, CuaHang ch) {
        String sql = "update CuaHang set Ma=?,Ten=?,DiaChi=?,ThanhPho=?,QuocGia=? where id = ?";
        try {
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, ch.getMa());
            ps.setObject(2, ch.getTen());
            ps.setObject(3, ch.getDiaChi());
            ps.setObject(4, ch.getThanhPho());
            ps.setObject(5, ch.getQuocGia());
            ps.setObject(6, id);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteCH(String id) {
        String sql = "DELETE FROM CuaHang WHERE Id = ?";
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
