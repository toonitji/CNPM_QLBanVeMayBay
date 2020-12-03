/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import DAO.MySQLConnect;
import DTO.NhanVienDTO;
import com.mysql.jdbc.MySQLConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;







/**
 *
 * @author Super
 */
public class NhanVienDAO extends MySQLConnect {
//    SQLServerConnect ketnoi = new SQLServerConnect();
//    Connection conn = ketnoi.conn;
//    Statement st = ketnoi.st;
//    ResultSet rs = ketnoi.rs;
    public ArrayList docDSNV() {
        ArrayList<NhanVienDTO> dsnv = new ArrayList<NhanVienDTO>();
        try {
            String qry = "select * from nhanvien";
            st = (Statement) conn.createStatement();
            rs = st.executeQuery(qry);
            while (rs.next()) {
                NhanVienDTO nv = new NhanVienDTO();
                nv.maNv = rs.getString(1);
                nv.ho = rs.getString(2);
                nv.ten = rs.getString(3);
                nv.diaChi = rs.getString(4);
                nv.eMail = rs.getString(5);
                nv.sDT = rs.getString(6);
                nv.luong = rs.getString(7);
                nv.soTK = rs.getString(8);
                nv.maQuyen = rs.getString(9);
                nv.pass = rs.getString(10);
                dsnv.add(nv);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi đọc thông tin nhân viên");
        }
        return dsnv;
    }

    public void them(NhanVienDTO nv) {
        try {
            String qry = "Insert into nhanvien Values(";
            qry = qry + "'" + nv.maNv + "'";
            qry = qry + "," + "'" + nv.ho + "'";
            qry = qry + "," + "'" + nv.ten + "'";
            qry = qry + "," + "'" + nv.diaChi + "'";
            qry = qry + "," + "'" + nv.eMail + "'";
            qry = qry + "," + "'" + nv.sDT + "'";
            qry = qry + "," + "'" + nv.luong + "'";
            qry = qry + "," + "'" + nv.soTK + "'";
            qry = qry + "," + "'" + nv.maQuyen + "'";
            qry = qry + "," + "'" + nv.maNv + "'";
            qry = qry + ")";
            st = (Statement) conn.createStatement();
            st.executeUpdate(qry);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi ghi thông tin nhân viên");
        }
    }

    public void xoa(String maNv) {
        try {
            String qry = "Delete from NhanVien where MaNV='" + maNv + "'";
            st = conn.createStatement();
            st.execute(qry);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi xóa Nhân viên.");
        }
    }

    public void sua(NhanVienDTO nv) {
        
        try { 
            String qry = "Update NhanVien set ";
            qry = qry + "MaNV='" + nv.getMaNv() + "'";
            qry = qry + ",HoNV=" + "'" + nv.getHo() + "'";
            qry = qry + ",TenNV=" + "'" + nv.getTen() + "'";
            qry = qry + ",Diachi=" + "'" + nv.getDiaChi() + "'";
            qry = qry + ",Email=" + "'" + nv.geteMail() + "'";
            qry = qry + ",SDT=" + "'" + nv.getsDT() + "'";
            qry = qry + ",Luong=" + "'" + nv.getLuong()+ "'";
            qry = qry + ",STK=" + "'" + nv.getSoTK() + "'";
            qry = qry + ",MaQuyen=" + "'" + nv.getMaQuyen()+ "'";
            qry = qry + ",PASS=" + "'" + nv.getMaNv()+ "'";
            qry = qry + " "+"where MaNV='" +nv.getMaNv()+"'";


            st = conn.createStatement();
            st.executeUpdate(qry);
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi cập nhật Nhân Viên");
        }
    }
    
    public void suaMK(NhanVienDTO nv){
        try {
            String qry = "Update NhanVien set ";
            qry = qry + "PASS='"+nv.getPass()+"'";
            qry = qry + " "+"where MaNV='"+nv.getMaNv()+"'";
            
            st = conn.createStatement();
            st.executeUpdate(qry);
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi cập nhật Nhân Viên");
        }
    }
    
//    public ArrayList timkiemDSNV(String maNv) {
//        ArrayList dscb = new ArrayList<NhanVienDTO>();
//        NhanVienDTO cb = new NhanVienDTO();
//        try {
//            String qry = "select*from ChuyenBay where";
//            qry = qry + "MaNV>=" + "'" + maNv + "'";
//            
//            st = conn.createStatement();
//            st.executeUpdate(qry);
//            conn.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Lỗi xóa Chuyến bay.");
//        }
//        return dscb;
//    }
//    
        
}