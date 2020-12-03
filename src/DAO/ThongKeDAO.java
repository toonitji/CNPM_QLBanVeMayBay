/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.ChuyenBayDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class ThongKeDAO {

    MySQLConnect ketnoi = new MySQLConnect();
    Connection conn = ketnoi.conn;
    Statement st = ketnoi.st;
    ResultSet rs = ketnoi.rs;
    public String doanhthu;

    public String doanhthu() {
        ArrayList<ChuyenBayDTO> dscb = new ArrayList<ChuyenBayDTO>();
        try {
            String qry = "select SUM(tongtien) as doanhthu from HoaDon";
            st = conn.createStatement();
            rs = st.executeQuery(qry);
            doanhthu = rs.getString(1);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi ghi thông tin Chuyến bay");
        }
        return doanhthu;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void abc() {
        String dt;
        try {
            String qry = "Select Sum(TongTien) as tongdt from hoadon";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(qry);
            conn.close();
        } catch (SQLException ex) {          
            JOptionPane.showMessageDialog(null,"Loi tinh doanh thu");
        }
 
    }

}
