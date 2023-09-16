/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;
import Domain_model.HoaDon;
import Ultilities.DBConnection;
import java.sql.*;
import java.util.*;
/**
 *
 * @author chung
 */
public class Repo_HD {
            private DBConnection dbconnect;

    public ArrayList<HoaDon> getListHD() {
        String sql = "select * from HoaDon";
        ArrayList<HoaDon> lsthd = new ArrayList<>();
        try {
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setId(rs.getString("Id"));
                hd.setIdKH(rs.getString("IdKH"));
                hd.setIdNV(rs.getString("IdNV"));
                hd.setMa(rs.getString("Ma"));
                hd.setNgayTao(rs.getString("NgayTao"));
                hd.setNgayThanhToan(rs.getString("NgayThanhToan"));
                hd.setNgayShip(rs.getString("NgayShip"));
                hd.setNgayNhan(rs.getString("NgayNhan"));
                hd.setTinhTrang(rs.getInt("TinhTrang"));
                hd.setTenNguoiNhan(rs.getString("TenNguoiNhan"));
                hd.setDiaChi(rs.getString("DiaChi"));
                hd.setSdt(rs.getString("Sdt"));
                lsthd.add(hd);
            }
            return lsthd;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean insertHD(HoaDon hd) {
        String sql = "insert into HoaDon(IdKH,IdNV,Ma,NgayTao,NgayThanhToan,NgayShip,NgayNhan,TinhTrang,TenNguoiNhan,DiaChi,Sdt) values(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, hd.getIdKH());
            ps.setObject(2, hd.getIdNV());
            ps.setObject(3, hd.getMa());
            ps.setObject(4, hd.getNgayTao());
            ps.setObject(5, hd.getNgayThanhToan());
            ps.setObject(6, hd.getNgayShip());
            ps.setObject(7, hd.getNgayNhan());
            ps.setObject(8, hd.getTinhTrang());
            ps.setObject(9, hd.getTenNguoiNhan());
            ps.setObject(10, hd.getDiaChi());
            ps.setObject(11, hd.getSdt());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateHD(String id, HoaDon hd) {
        String sql = "update HoaDon set IdKH=?,IdNV=?,Ma=?,NgayTao=?,NgayThanhToan=?,NgayShip=?,NgayNhan=?,TinhTrang=?,TenNguoiNhan=?,DiaChi=?,Sdt=? where Id=?";
        try {
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, hd.getIdKH());
            ps.setObject(2, hd.getIdNV());
            ps.setObject(3, hd.getMa());
            ps.setObject(4, hd.getNgayTao());
            ps.setObject(5, hd.getNgayThanhToan());
            ps.setObject(6, hd.getNgayShip());
            ps.setObject(7, hd.getNgayNhan());
            ps.setObject(8, hd.getTinhTrang());
            ps.setObject(9, hd.getTenNguoiNhan());
            ps.setObject(10, hd.getDiaChi());
            ps.setObject(11, hd.getSdt());
            ps.setObject(12, id);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteHD(String id) {
        String sql = "DELETE FROM HoaDon WHERE Id = ?";
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
