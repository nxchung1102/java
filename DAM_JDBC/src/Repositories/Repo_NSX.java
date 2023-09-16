/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;
import Domain_model.NSX;
import Ultilities.DBConnection;
import java.sql.*;
import java.util.*;
/**
 *
 * @author chung
 */
public class Repo_NSX {
          private DBConnection dbconnect;

    public ArrayList<NSX> getListNSX() {
        ArrayList<NSX> lstNSX = new ArrayList<>();
        String sql = "select * from NSX";
        try {
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NSX nsx = new NSX();
                nsx.setId(rs.getString("Id"));
                nsx.setMa(rs.getString("Ma"));
                nsx.setTen(rs.getString("Ten"));
                lstNSX.add(nsx);
            }
            return lstNSX;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean insertNSX(NSX nsx) {
        String sql = "INSERT INTO NSX(Ma,Ten)\n"
                + "VALUES (?,?)";
        try {
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, nsx.getMa());
            ps.setObject(2, nsx.getTen());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean UpdateNSX(String id, NSX nsx) {
        String sql = "UPDATE NSX\n"
                + "SET Ma = ?, Ten = ?\n"
                + "WHERE Id=?";
        try {
            Connection con = dbconnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, nsx.getMa());
            ps.setObject(2, nsx.getTen());
            ps.setObject(3, id);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean DeleteNSX(String id) {
        String sql = "DELETE FROM NSX WHERE Id = ?";
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
