/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import DTO.KhuyenMaiDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author Dell
 */
    public class KhuyenMaiDAO {

    MySQLConnect ketnoi = new MySQLConnect();
    Connection conn = ketnoi.conn;
    Statement st = ketnoi.st;
    ResultSet rs = ketnoi.rs;

    public ArrayList docDSKM() {
        ArrayList <KhuyenMaiDTO> dscb = new ArrayList<KhuyenMaiDTO>();
        try {
            String qry = "select * from KhuyenMai";
            st = conn.createStatement();
            rs = st.executeQuery(qry);
            while (rs.next()) {
                KhuyenMaiDTO cb = new KhuyenMaiDTO();
                cb.setMaKM(rs.getString(1));
                cb.setTenKM(rs.getString(2));
                cb.setTGBatDau(rs.getString(3));
                cb.setTGKetThuc(rs.getString(4));
                dscb.add(cb);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi đọc thông tin Khuyến Mãi");
        }
        return dscb;
    }

    public void them(KhuyenMaiDTO cb) {
        try {
            String qry = "Insert into KhuyenMai Values(";
            qry = qry + "'" + cb.getMaKM() + "'";
            qry = qry + "," + "'" + cb.getTenKM() + "'";
            qry = qry + "," + "'" + cb.getTGBatDau() + "'";
            qry = qry + "," + "'" + cb.getTGKetThuc() + "'";
            qry = qry + ");";
            st = (Statement) conn.createStatement();
            st.executeUpdate(qry);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi ghi thông tin Khuyến Mãi");
        }
    }

    public void xoa(String MaKM) {
        try {
            String qry = "Delete from KhuyenMai where MaKM='" + MaKM + "'";
            st = conn.createStatement();
            st.executeUpdate(qry);
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi xóa Khuyến Mãi.");
        }
    }

    public void sua(KhuyenMaiDTO cb) {
        try {
            String qry = "Update KhuyenMai set ";
            qry = qry + "TenKM=" + "'" + cb.getTenKM() + "'";
            qry = qry + ",TGBatDau=" + "'" + cb.getTGBatDau() + "'";
            qry = qry + ",TGKetThuc=" + "'" + cb.getTGKetThuc() + "'";
            qry = qry + " " + "where MaKM='" + cb.getMaKM() + "'";
            st = conn.createStatement();
            st.executeUpdate(qry);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi cập nhật Khuyến Mãiy");
        }
    }

    public ArrayList timkiemDSKM(Date tkNgayDi, Date tkNgayDen) {
        ArrayList dscb = new ArrayList<KhuyenMaiDTO>();
        KhuyenMaiDTO cb = new KhuyenMaiDTO();
        try {
            String qry = "select*from KhuyenMai where";
            qry = qry + "TGBatDau>=" + "'" + tkNgayDi + "'";
            qry = qry + "TGKetThuc<=" + "'" + tkNgayDen + "'";
            st = conn.createStatement();
            st.executeUpdate(qry);
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi xóa Khuyến Mãi.");
        }
        return dscb;
    }
}
