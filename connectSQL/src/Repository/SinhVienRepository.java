/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;
import java.sql.*;
import java.util.ArrayList;
import model.sinhvien;
/**
 *
 * @author chung
 */
public class SinhVienRepository {
    private ConnectSQL DbConnection;
public ArrayList<sinhvien> getList() {
ArrayList<sinhvien> lstSV = new ArrayList<>();
String sql = "select * from SinhVien";
try(Connection con = DbConnection.getConnection();
PreparedStatement ps = con.prepareStatement(sql)){
ResultSet rs = ps.executeQuery();
while(rs.next()){
sinhvien sv = new sinhvien();
sv.setId(rs.getInt("id"));
sv.setHoTen(rs.getString("HoTen"));
sv.setDiaChi(rs.getString("DiaChi"));
sv.setTuoi(rs.getInt("NamSinh"));
sv.setTrangThai(rs.getInt("TrangThai"));
lstSV.add(sv);
}
}
catch(Exception ex){
ex.printStackTrace();
}
return lstSV;
}

public Boolean addNew(sinhvien sv){
String sql ="insert into SinhVien(id,HoTen,DiaChi,NamSinh,TrangThai) values(?,?,?,?,?)";
try(Connection con = ConnectSQL.getConnection();
        PreparedStatement ps = con.prepareStatement(sql)){
ps.setObject(1, sv.getId());
ps.setObject(2, sv.getHoTen());
ps.setObject(3, sv.getDiaChi());
ps.setObject(4, sv.getTuoi());
ps.setObject(5, sv.getTrangThai());
int result = ps.executeUpdate();
return result>0;
}catch(Exception ex){
ex.printStackTrace();
}
return false;
}
public Boolean update(int id,sinhvien sv){
String sql = "update SinhVien set HoTen=?,DiaChi=?,NamSinh=?,TrangThai = ? where id=?";
    try(Connection con = ConnectSQL.getConnection();
        PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setObject(1, sv.getHoTen());
ps.setObject(2, sv.getDiaChi());
ps.setObject(3, sv.getTuoi());
ps.setObject(4, sv.getTrangThai());
ps.setObject(5, id);
int result = ps.executeUpdate();
return result>0;
    } catch (Exception ex) {
    ex.printStackTrace();
    }
    return  false;
}
public Boolean delete(int id){
String sql = "delete from SinhVien where id = ?";
    try(Connection con = ConnectSQL.getConnection();
        PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setObject(1, id);
        int result = ps.executeUpdate();
        return result>0;
    } catch (Exception e) {
        e.printStackTrace();
    }
    return  false;
}
public sinhvien findById(int id){
sinhvien sv = new sinhvien();
String sql = "select * from SinhVien\n" +
"where id=?";
    try (Connection con = ConnectSQL.getConnection();
        PreparedStatement ps = con.prepareStatement(sql)){
        ps.setObject(1, id);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
        sv.setId(rs.getInt("id"));
sv.setHoTen(rs.getString("HoTen"));
sv.setDiaChi(rs.getString("DiaChi"));
sv.setTuoi(rs.getInt("NamSinh"));
sv.setTrangThai(rs.getInt("TrangThai"));
return sv;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
return  null;
}
    public static void main(String[] args) {
        SinhVienRepository svr = new SinhVienRepository();
        ArrayList<sinhvien> lst = svr.getList();
        for (sinhvien sv : lst) {
            System.out.println(sv.toString());
        }
    }
}

