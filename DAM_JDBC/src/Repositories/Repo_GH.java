/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;
import Domain_model.GioHang;
import Ultilities.DBConnection;
import java.sql.*;
import java.util.*;
/**
 *
 * @author chung
 */
public class Repo_GH {
            private DBConnection dbconnect;

    public ArrayList<GioHang> getListGH() {
        ArrayList<GioHang> lstgh = new ArrayList<>();
        String sql = "select * from GioHang";
        try {
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                GioHang gh = new GioHang();
                gh.setId(rs.getString("Id"));
                gh.setIdKH(rs.getString("IdKH"));
                gh.setIdNV(rs.getString("IdNV"));
                gh.setMa(rs.getString("Ma"));
                gh.setNgayTao(rs.getString("NgayTao"));
                gh.setNgayThanhToan(rs.getString("NgayThanhToan"));
                gh.setTenNguoiNhan(rs.getString("TenNguoiNhan"));
                gh.setDiachi(rs.getString("DiaChi"));
                gh.setSdt(rs.getString("Sdt"));
                gh.setTinhTrang(rs.getInt("TinhTrang"));
                lstgh.add(gh);
            }
            return lstgh;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean insertGH(GioHang gh) {
        String sql = "insert into GioHang(IdKH,IdNV,Ma,NgayTao,NgayThanhToan,TenNguoiNhan,DiaChi,Sdt,TinhTrang) values(?,?,?,?,?,?,?,?,?)";
        try {
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, gh.getIdKH());
            ps.setObject(2, gh.getIdNV());
            ps.setObject(3, gh.getMa());
            ps.setObject(4, gh.getNgayTao());
            ps.setObject(5, gh.getNgayThanhToan());
            ps.setObject(6, gh.getTenNguoiNhan());
            ps.setObject(7, gh.getDiachi());
            ps.setObject(8, gh.getSdt());
            ps.setObject(9, gh.getTinhTrang());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateGH(String id, GioHang gh) {
        String sql = "update GioHang set IdKH=?,IdNV=?,Ma=?,NgayTao=?,NgayThanhToan=?,TenNguoiNhan=?,DiaChi=?,Sdt=?,TinhTrang=? where id = ?";
        try {
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, gh.getIdKH());
            ps.setObject(2, gh.getIdNV());
            ps.setObject(3, gh.getMa());
            ps.setObject(4, gh.getNgayTao());
            ps.setObject(5, gh.getNgayThanhToan());
            ps.setObject(6, gh.getTenNguoiNhan());
            ps.setObject(7, gh.getDiachi());
            ps.setObject(8, gh.getSdt());
            ps.setObject(9, gh.getTinhTrang());
            ps.setObject(10, id);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteGH(String id) {
        String sql = "DELETE FROM GioHang WHERE Id = ?";
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
