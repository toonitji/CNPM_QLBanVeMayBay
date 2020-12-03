/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.LoaiVeDTO;
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
public class LoaiVeDAO {
    MySQLConnect ketnoi = new MySQLConnect();
    Connection conn = ketnoi.conn;
    Statement st = ketnoi.st;
    ResultSet rs = ketnoi.rs;
    public ArrayList docDSLoaiVe(){
        ArrayList dsLoaiVe = new ArrayList<LoaiVeDTO>();
        try {
            String query = "Select * from LoaiVe";
            st = (Statement) conn.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                LoaiVeDTO lv = new LoaiVeDTO();
                lv.setMaLoaiVe(rs.getString(1));
                lv.setTenLoai(rs.getString(2));
                lv.setGiaTien(rs.getInt(3));
                dsLoaiVe.add(lv); 
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Đã xảy ra lỗi DAO");
        }
    return dsLoaiVe;
    }

    public void them(LoaiVeDTO lv) {
        try {
            String qry = "Insert into loaive Values(";
            qry = qry + "'" + lv.getMaLoaiVe() + "'";
            qry = qry + "," + "'" + lv.getTenLoai()+ "'";
            qry = qry + "," + "'" + lv.getGiaTien()+ "'";
            qry = qry + ");";
            st = (Statement) conn.createStatement();
            st.executeUpdate(qry);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi thêm thông tin ");
        }
    }

    public void xoa(String MaLoaiVe) {
        try {
            String query = "Delete from LoaiVe where MaLoaiVe='" + MaLoaiVe + "'";
            st = conn.createStatement();
            st.executeUpdate(query);
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi xóa.");
        }
    }

    public void sua(LoaiVeDTO lv) {
      try {
            String query = "Update LoaiVe set ";
            query = query + "MaLoaiVe=" + "'" + lv.getMaLoaiVe() + "'";
            query = query + ",TenLoai=" + "'" + lv.getTenLoai()+ "'";
            query = query + ",GiaTien=" + "'" + lv.getGiaTien()+ "'";
            query = query + " " + "where MaLoaiVe='" + lv.getMaLoaiVe()+ "'";
            
            st = conn.createStatement();
            st.executeUpdate(query);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi cập nhật");
        }
    }
}
