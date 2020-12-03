/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.CTKhuyenMaiDTO;
import java.util.ArrayList;
import DTO.KhuyenMaiDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Dell
 */
public class CTKhuyenMaiDAO {


    MySQLConnect ketnoi = new MySQLConnect();
    Connection conn = ketnoi.conn;
    Statement st =  ketnoi.st;
    ResultSet rs = ketnoi.rs;

    public ArrayList docDSCTKM() {
        ArrayList <CTKhuyenMaiDTO> dsctkm = new ArrayList<CTKhuyenMaiDTO>();
        try {
            String qry = "select * from CTKhuyenMai";
            st = (Statement) conn.createStatement();
            rs = st.executeQuery(qry);
            while (rs.next()) {
                CTKhuyenMaiDTO ctkm = new CTKhuyenMaiDTO();
                ctkm.setMaKM(rs.getString(1));
                ctkm.setDieuKienKM(rs.getString(2));
                ctkm.setGiamGia(rs.getInt(3));
                dsctkm.add(ctkm);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi đọc thông tin Chi Tiết Khuyến Mãi");
        }
        return dsctkm;
    }

    public void themctkm(CTKhuyenMaiDTO ctkm) {
        try {
            String qry = "Insert into CTKhuyenMai Values(";
            qry = qry + "'" + ctkm.getMaKM() + "'";
            qry = qry + "," + "'" + ctkm.getDieuKienKM() + "'";
            qry = qry + "," + "'" + ctkm.getGiamGia() + "'";
            qry = qry + ");";
            st = (Statement) conn.createStatement();
            st.executeUpdate(qry);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi ghi thông tin Chi Tiết Khuyến Mãi");
        }
    }

    public void xoactkm(String MaKM) {
        try {
            String qry = "Delete from CTKhuyenMai where MaKM='" + MaKM + "'";
            st = conn.createStatement();
            st.executeUpdate(qry);
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi xóa Chi Tiết Khuyến Mãi.");
        }
    }

    public void suactkm(CTKhuyenMaiDTO ctkm) {
        try {
            String qry = "Update CTKhuyenMai set ";
            qry = qry + "MaKM=" + "'" + ctkm.getMaKM() + "'";
            
            qry = qry + " " + "where MaKM='" + ctkm.getMaKM() + "'";
            st = conn.createStatement();
            st.executeUpdate(qry);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi cập nhật Chuyến bay");
        }
    }
}

    