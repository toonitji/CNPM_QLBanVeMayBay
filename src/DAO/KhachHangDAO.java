/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAO.MySQLConnect;
import DTO.KhachHangDTO;
import DTO.NhanVienDTO;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Super
 */
public class KhachHangDAO extends MySQLConnect{
    public ArrayList docDSKH() {
        ArrayList dsnv = new ArrayList<KhachHangDTO>();
        try {
            String qry = "select * from KhachHang";
            st = (Statement) conn.createStatement();
            rs = st.executeQuery(qry);
            while (rs.next()) {
                KhachHangDTO kh = new KhachHangDTO();
                kh.maKH = rs.getString(1);
                kh.ho = rs.getString(2);
                kh.ten = rs.getString(3);
                kh.diaChi = rs.getString(4);
                kh.eMail = rs.getString(5);
                kh.sDT = rs.getString(6);
                dsnv.add(kh);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi đọc thông tin nhân viên");
        }
        return dsnv;
    }

    public void them(KhachHangDTO kh) {
        try {
            String qry = "Insert into KhachHang Values(";
            qry = qry + "'" + kh.maKH + "'";
            qry = qry + "," + "'" + kh.ho + "'";
            qry = qry + "," + "'" + kh.ten + "'";
            qry = qry + "," + "'" + kh.diaChi + "'";
            qry = qry + "," + "'" + kh.eMail + "'";
            qry = qry + "," + "'" + kh.sDT + "'";
            qry = qry + ")";
            st = (Statement) conn.createStatement();
            st.executeUpdate(qry);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi ghi thông tin khách hàng");
        }
    }

    public void xoa(String maNv) {
        try {
            String qry = "Delete from KhachHang where MaNV='" + maNv + "'";
            st = conn.createStatement();
            st.execute(qry);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi xóa Khách Hàng.");
        }
    }

    public void sua(KhachHangDTO kh) {
        //NhanVienDTO nv = new NhanVienDTO();
        try {
            
            // String qry = "UPDATE `nhanvien` SET `MaNV`='"+nv.maNv+"',`HoNV`='"+nv.maNv+"',`TenNV`='"+nv.maNv+"',`DiaChi`='"+
            //        nv.maNv+"',`Email`='"+nv.maNv+"',`SĐT`='"+nv.maNv+"',`Luong`='"+nv.maNv+"',`STK`='"+nv.maNv+"',`MaQuyen`='"+nv.maNv+"' WHERE 1";
            
            String qry = "Update KhachHang set ";
            qry = qry + "ma='" + kh.getMaKH() + "'";
            qry = qry + ",ho=" + "'" + kh.getHo() + "'";
            qry = qry + ",ten=" + "'" + kh.getTen() + "'";
            qry = qry + ",diachi=" + "'" + kh.getDiaChi() + "'";
            qry = qry + ",email=" + "'" + kh.geteMail() + "'";
            qry = qry + ",sdt=" + "'" + kh.getsDT() + "'";
//            qry = qry + "where MaNV='" + nv.maNv + "'";
            qry = qry + " "+"where ma= '" +kh.getMaKH()+"'";


            st = conn.createStatement();
            st.executeUpdate(qry);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Lỗi cập nhật Khách Hàng");
        }
    }
    
}
