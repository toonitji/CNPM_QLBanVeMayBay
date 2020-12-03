/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.ChiTietLoaiGheDTO;
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
public class ChiTietLoaiGheDAO {
    MySQLConnect ketnoi = new MySQLConnect();
    Connection conn = ketnoi.conn;
    Statement st = ketnoi.st;
    ResultSet rs = ketnoi.rs;
    
    public ArrayList docDSTable(){
        ArrayList dsTable = new ArrayList<ChiTietLoaiGheDTO>();
        try {
            String query = "Select*from chitietghe";
            st = (Statement) conn.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                ChiTietLoaiGheDTO tb = new ChiTietLoaiGheDTO();
                tb.setMaLoaiGhe(rs.getString(1));
                tb.setMaChuyen(rs.getString(2));
                tb.setTenLoai(rs.getString(3));
                tb.setGiaVe(rs.getInt(4));
                dsTable.add(tb); 
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Đã xảy ra lỗi DAO");
        }
    return dsTable;
    }
    
    public void them(ChiTietLoaiGheDTO tb) {
        try {
            String qry = "Insert into chitietghe Values(";
            qry = qry + "'" + tb.getMaLoaiGhe()+ "'";
            qry = qry + "," + "'" + tb.getMaChuyen() + "'";
            qry = qry + "," + "'" + tb.getTenLoai() + "'";
            qry = qry + "," + "'" + tb.getGiaVe() + "'";
            qry = qry + ");";
            st = (Statement) conn.createStatement();
            st.executeUpdate(qry);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi thêm thông tin ");
        }
    }
    public void xoa(String MaLoaiGhe) {
        try {
            String query = "Delete from chitietghe where MaLoaiGhe='" + MaLoaiGhe + "'";
            st = conn.createStatement();
            st.executeUpdate(query);
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi xóa.");
        }
    }
    
     public void sua(ChiTietLoaiGheDTO tb) {
        try {
            String query = "Update chitietghe set ";
            query = query + "MaLoaiGhe=" + "'" + tb.getMaLoaiGhe() + "'";
            query = query + ",MaChuyen=" + "'" + tb.getMaChuyen() + "'";
            query = query + ",TenLoai=" + "'" + tb.getTenLoai() + "'";
            query = query + ",GiaVe=" + "'" + tb.getGiaVe() + "'";
            query = query + " " + "where MaLoaiGhe='" + tb.getMaLoaiGhe()+ "'";
            st = conn.createStatement();
            st.executeUpdate(query);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi cập nhật");
        }
    }
    
}
