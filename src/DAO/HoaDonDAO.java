
package DAO;

import DTO.HoaDonDTO;
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
public class HoaDonDAO {
    MySQLConnect ketnoi = new MySQLConnect();
    Connection conn = ketnoi.conn;
    Statement st = ketnoi.st;
    ResultSet rs = ketnoi.rs;

    public ArrayList docDSHoaDon(){
       ArrayList dsHoaDon = new ArrayList<HoaDonDTO>();
        try {
            String query = "Select * from hoadon";
            st = (Statement) conn.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                HoaDonDTO hd = new HoaDonDTO();
                hd.setMaHD(rs.getString(1));
                hd.setMaNV(rs.getString(2));
                hd.setMaKH(rs.getString(3));
                hd.setNgayMua(rs.getString(4));               
                hd.setTongTien(rs.getInt(5));
                hd.setGhichu(rs.getString(6)); 
                dsHoaDon.add(hd); 
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ðã xảy ra lôi DAO");
        }
     return dsHoaDon;
    }
    
    
    public void them(HoaDonDTO hd) {
        try {
          String qry = "Insert into hoadon values (";
          qry = qry + "'" + hd.getMaHD() + "'";
          qry = qry + "," + "'" + hd.getMaNV()+ "'";
          qry = qry + "," + "'" + hd.getMaKH()+ "'";
          qry = qry + "," + "'" + hd.getNgayMua()+ "'";
          qry = qry + "," + "'" + hd.getTongTien()+ "'";
          qry = qry + "," + "'" + hd.getGhichu()+ "'";
          qry = qry + ");";
          
            st = (Statement) conn.createStatement();
            st.executeUpdate(qry);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi thêm thông tin ");
        }
    }
    
    public void xoa(String MaHD) {
        try {
            String query = "Delete from hoadon where MaHD='" + MaHD + "'";
            st = conn.createStatement();
            st.executeUpdate(query);
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi xóa.");
        }
    }
    
    public void sua(HoaDonDTO hd) {
        try {
           String query = "Update hoadon set ";
            query = query + "MaHD=" + "'" + hd.getMaHD()+ "'";
            query = query + ",MaNV=" + "'" + hd.getMaNV()+ "'";
            query = query + ",MaKH=" + "'" + hd.getMaKH()+ "'";
            query = query + ",NgayMua=" + "'" + hd.getNgayMua()+ "'";
            
            query = query + ",TongTien=" + "'" + hd.getTongTien()+ "'";
            query = query + ",GhiChu=" + "'" + hd.getGhichu()+ "'";
            query = query + " " + "where MaHD='" + hd.getMaHD()+ "'";

            st = conn.createStatement();
            st.executeUpdate(query);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi cập nhật");
        }
    }
}




