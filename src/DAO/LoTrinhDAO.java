/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.LoTrinhDTO;
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
public class LoTrinhDAO {

    MySQLConnect ketnoi = new MySQLConnect();
    Connection conn = ketnoi.conn;
    Statement st = ketnoi.st;
    ResultSet rs = ketnoi.rs;

    public ArrayList docDSLT() {
        ArrayList dslt = new ArrayList<LoTrinhDTO>();
        try {
            String qry = "select * from LoTrinh";
            st = (Statement) conn.createStatement();
            rs = st.executeQuery(qry);
            while (rs.next()) {
                LoTrinhDTO lt = new LoTrinhDTO();
                lt.setMaLoTrinh(rs.getString(1));
                lt.setNoiDi(rs.getString(2));
                lt.setNoiDen(rs.getString(3));
                lt.setTGBay(rs.getFloat(4));
                dslt.add(lt);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi đọc thông tin Chuyến bay");
        }
        return dslt;
    }

    public void them(LoTrinhDTO lt) {
        try {
            String qry = "Insert into LoTrinh Values(";
            qry = qry + "'" + lt.getMaLoTrinh() + "'";
            qry = qry + "," + "'" + lt.getNoiDi() + "'";
            qry = qry + "," + "'" + lt.getNoiDen() + "'";
            qry = qry + "," + "'" + lt.getTGBay() + "'";
            qry = qry + ");";
            st = (Statement) conn.createStatement();
            st.executeUpdate(qry);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi ghi thông tin Chuyến bay");
        }
    }

    public void xoa(String MaLoTrinh) {
        try {
            String qry = "Delete from LoTrinh where MaLoTrinh='" + MaLoTrinh + "'";
            st = conn.createStatement();
            st.executeUpdate(qry);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi xóa Chuyến bay.");
        }
    }

    public void sua(LoTrinhDTO lt) {
        try {
            String qry = "Update LoTrinh set ";
            qry = qry + ",MaLoTrinh=" + "'" + lt.getMaLoTrinh() + "'";
            qry = qry + ",MaMB=" + "'" + lt.getNoiDi() + "'";
            qry = qry + ",NgayDen=" + "'" + lt.getNoiDen() + "'";
            qry = qry + ",NgayDi=" + "'" + lt.getTGBay() + "'";
            qry = qry + " " + "where MaLoTrinh='" + lt.getMaLoTrinh() + "'";
            st = conn.createStatement();
            st.executeUpdate(qry);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi cập nhật Lộ trình");
        }
    }
}
