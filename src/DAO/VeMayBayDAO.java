/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import DTO.VeMayBayDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class VeMayBayDAO {
    MySQLConnect ketnoi = new MySQLConnect();
    Connection conn = ketnoi.conn;
    Statement st = ketnoi.st;
    ResultSet rs = ketnoi.rs;

    public ArrayList docDSVeMayBay(){
       ArrayList dsVeMayBay = new ArrayList<VeMayBayDTO>();
        try {
            String query = "Select * from vemaybay";
            st = (Statement) conn.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                VeMayBayDTO vmb = new VeMayBayDTO();
                vmb.setMaVe(rs.getString(1));
                vmb.setMaChuyen(rs.getString(2));
                vmb.setMaLoaiVe(rs.getString(3));
                vmb.setMaLoaiGhe(rs.getString(4));
                vmb.setGia(rs.getInt(5));
                dsVeMayBay.add(vmb); 
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ðã xảy ra lôi DAO");
        }
     return dsVeMayBay;
    }
    
    
    public void them(VeMayBayDTO vmb) {
        try {
            String qry = "Insert into VeMayBay Values(";
            qry = qry + "'" + vmb.getMaVe() + "'";
            qry = qry + "," + "'" + vmb.getMaChuyen() + "'";
            qry = qry + "," + "'" + vmb.getMaLoaiVe() + "'";
            qry = qry + "," + "'" + vmb.getMaLoaiGhe() + "'";
            qry = qry + "," + "'" + vmb.getGia() + "'";
            qry = qry + ");";
            st = (Statement) conn.createStatement();
            st.executeUpdate(qry);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi thêm thông tin ");
        }
    }
    
    public void xoa(String MaVe) {
        try {
            String query = "Delete from VeMayBay where MaVe='" + MaVe + "'";
            st = conn.createStatement();
            st.executeUpdate(query);
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi xóa.");
        }
    }
    
    public void sua(VeMayBayDTO vmb) {
        try {
            String query = "Update VeMayBay set ";
            query = query + "MaVe=" + "'" + vmb.getMaVe() + "'";
            query = query + ",MaChuyen=" + "'" + vmb.getMaChuyen() + "'";
            query = query + ",MaLoaiVe=" + "'" + vmb.getMaLoaiVe() + "'";
            query = query + ",MaLoaiGhe=" + "'" + vmb.getMaLoaiGhe() + "'";
            query = query + ",Gia=" + "'" + vmb.getGia() + "'";
            query = query + " " + "where MaVe='" + vmb.getMaVe()+ "'";
            st = conn.createStatement();
            st.executeUpdate(query);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi cập nhật");
        }
    }
    
    public ArrayList timkiemDSVMB(String GiaBD,String GiaKT, String MaChuyenBay) {
        ArrayList dsVeMayBay = new ArrayList<VeMayBayDTO>();
        VeMayBayDTO vmb =new VeMayBayDTO();
        try {
           
            String qry = "select*from VeMayBay where";
            qry=qry+"Gia>="+"'"+GiaBD+"'";
            qry=qry+"Gia<="+"'"+GiaKT+"'";
            st = conn.createStatement();
            st.executeUpdate(qry);
            conn.close();
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi xóa Chuyến bay.");
        } 
        return dsVeMayBay;
    }
    
    
    
}
