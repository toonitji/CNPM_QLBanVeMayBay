/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.MayBayDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
/**
 *
 * @author Dell
 */
public class MayBayDAO {

    MySQLConnect ketnoi = new MySQLConnect();
    Connection conn = ketnoi.conn;
    Statement st = ketnoi.st;
    ResultSet rs = ketnoi.rs;

    public ArrayList docDSMB() {
        ArrayList dsmb = new ArrayList<MayBayDTO>();
        try {
            String qry = "select*from MayBay";
            st = (Statement) conn.createStatement();
            rs = st.executeQuery(qry);
            while (rs.next()) {
                MayBayDTO mb = new MayBayDTO();
                mb.setMaMB(rs.getString(1));
                mb.setTenMayBay(rs.getString(2));
                mb.setSoDoGhe(rs.getString(3));
                mb.setKCGhe(rs.getInt(4));
                mb.setSLGheThuong(rs.getInt(5));
                mb.setSLGheVIP(rs.getInt(6));
                dsmb.add(mb);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi đọc thông tin Chuyến bay");
        }
        return dsmb;
    }

    public void them(MayBayDTO mb) {
        try {
            String qry = "Insert into MayBay Values(";
            qry = qry + "'" + mb.getMaMB() + "'";
            qry = qry + "," + "'" + mb.getTenMayBay() + "'";
            qry = qry + "," + "'" + mb.getSoDoGhe() + "'";
            qry = qry + "," + "'" + mb.getKCGhe() + "'";
            qry = qry + "," + "'" + mb.getSLGheThuong() + "'";
            qry = qry + "," + "'" + mb.getSLGheVIP() + "'";
            qry = qry + ");";
            st = (Statement) conn.createStatement();
            st.executeUpdate(qry);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi ghi thông tin Máy bay");
        }
    }

    public void xoa(String MaMB) {
        try {
            String qry = "Delete from Maybay where MaMB='" + MaMB + "'";
            st = conn.createStatement();
            st.executeUpdate(qry);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi xóa Máy bay.");
        }
    }
    public void sua(MayBayDTO mb){
        try{
            String qry="Update maybay set";
            qry=qry+",TenMayBay="+"'"+mb.getTenMayBay()+"'";
            qry=qry+",KCGhe="+"'"+mb.getKCGhe()+"'";
            qry=qry+",SoDoGhe="+"'"+mb.getSoDoGhe()+"'";
            qry=qry+",SLGheThuong="+"'"+mb.getSLGheThuong()+"'";
            qry=qry+",SLGheVIP="+"'"+mb.getSLGheVIP()+"'";
            qry=qry+"where MaMB="+"'"+mb.getMaMB()+"'";
            st=(Statement) conn.createStatement();
            st.executeUpdate(qry);
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Lỗi cập nhật Máy bay.");
        }
    }
}
