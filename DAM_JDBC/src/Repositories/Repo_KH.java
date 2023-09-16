/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Domain_model.KhachHang;
import Ultilities.DBConnection;
import java.sql.*;
import java.util.*;
/**
 *
 * @author chung
 */
public class Repo_KH {
    
        private DBConnection dbconnect;

    
    public ArrayList<KhachHang> getlistCustomer() {
        ArrayList<KhachHang> lstC = new ArrayList<>();
        String sql = "select * from KhachHang";
        try {
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang c = new KhachHang();
                c.setId(rs.getString("Id"));
                c.setMa(rs.getString("Ma"));
                c.setTen(rs.getString("Ten"));
                c.setTenDem(rs.getString("TenDem"));
                c.setHo(rs.getString("Ho"));
                c.setNgaySinh(rs.getString("NgaySinh"));
                c.setSdt(rs.getString("Sdt"));
                c.setDiaChi(rs.getString("DiaChi"));
                c.setThanhPho(rs.getString("ThanhPho"));
                c.setQuocGia(rs.getString("QuocGia"));
                c.setMatKhau(rs.getString("MatKhau"));
                lstC.add(c);
            }
            return lstC;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean addNewCustomer(KhachHang c) {
        String sql = "INSERT INTO KhachHang(Ma,Ten,TenDem,Ho,NgaySinh,Sdt,DiaChi,ThanhPho,QuocGia,MatKhau)\n"
                + "VALUES (?,?,?,?,?,?,?,?,?,?)";
        try {
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, c.getMa());
            ps.setObject(2, c.getTen());
            ps.setObject(3, c.getTenDem());
            ps.setObject(4, c.getHo());
            ps.setObject(5, c.getNgaySinh());
            ps.setObject(6, c.getSdt());
            ps.setObject(7, c.getDiaChi());
            ps.setObject(8, c.getThanhPho());
            ps.setObject(9, c.getQuocGia());
            ps.setObject(10, c.getMatKhau());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean UpdateCustomer(String id, KhachHang c) {
        String sql = "UPDATE KhachHang\n"
                + "SET Ma = ?, Ten = ?,TenDem=?,Ho=?,NgaySinh=?,Sdt=?,DiaChi=?,ThanhPho=?,QuocGia=?,MatKhau=?\n"
                + "WHERE Id=?";
        try {
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, c.getMa());
            ps.setObject(2, c.getTen());
            ps.setObject(3, c.getTenDem());
            ps.setObject(4, c.getHo());
            ps.setObject(5, c.getNgaySinh());
            ps.setObject(6, c.getSdt());
            ps.setObject(7, c.getDiaChi());
            ps.setObject(8, c.getThanhPho());
            ps.setObject(9, c.getQuocGia());
            ps.setObject(10, c.getMatKhau());
            ps.setObject(11, id);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean DeleteCustomer(String id) {
        String sql = "DELETE FROM KhachHang WHERE Id = ?";
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
