package DAO;

import DTO.ChuyenBayDTO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


/**
 *
 * @author Dell
 */
public class ChuyenBayDAO {

    MySQLConnect ketnoi = new MySQLConnect();
    Connection conn = ketnoi.conn;
    Statement st = ketnoi.st;
    ResultSet rs = ketnoi.rs;

    public ArrayList docDSCB() {
        ArrayList <ChuyenBayDTO> dscb = new ArrayList<ChuyenBayDTO>();
        try {
            String qry = "select * from ChuyenBay";
            st = conn.createStatement();
            rs = st.executeQuery(qry);
            while (rs.next()) {
                ChuyenBayDTO cb = new ChuyenBayDTO();
                cb.setMaChuyen(rs.getString(1));
                cb.setMaLoTrinh(rs.getString(2));
                cb.setMaMB(rs.getString(3));
                cb.setNgayDi(rs.getString(4));
                cb.setNgayDen(rs.getString(5));
                cb.setTGDi(rs.getString(6));
                cb.setTGDen(rs.getString(7));
                cb.setSoGheDB(rs.getInt(8));
                cb.setSoGheVIPDB(rs.getInt(9));
                dscb.add(cb);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi đọc thông tin Chuyến bay");
        }
        return dscb;
    }

    public void them(ChuyenBayDTO cb) {
        try {
            String qry = "Insert into ChuyenBay Values(";
            qry = qry + "'" + cb.getMaChuyen() + "'";
            qry = qry + "," + "'" + cb.getMaLoTrinh() + "'";
            qry = qry + "," + "'" + cb.getMaMB() + "'";
            qry = qry + "," + "'" + cb.getNgayDi() + "'";
            qry = qry + "," + "'" + cb.getNgayDen() + "'";
            qry = qry + "," + "'" + cb.getTGDi() + "'";
            qry = qry + "," + "'" + cb.getTGDen() + "'";
            qry = qry + "," + "'" + cb.getSoGheDB() + "'";
            qry = qry + "," + "'" + cb.getSoGheVIPDB() + "'";
            qry = qry + ");";
            st = (Statement) conn.createStatement();
            st.executeUpdate(qry);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi ghi thông tin Chuyến bay");
        }
    }

    public void xoa(String MaChuyen) {
        try {
            String qry = "Delete from Chuyenbay where MaChuyen='" + MaChuyen + "'";
            st = conn.createStatement();
            st.executeUpdate(qry);
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi xóa Chuyến bay.");
        }
    }

    public void sua(ChuyenBayDTO cb) {
        try {
            String qry = "Update ChuyenBay set ";
            qry = qry + "MaChuyen=" + "'" + cb.getMaChuyen() + "'";
            qry = qry + ",MaLoTrinh=" + "'" + cb.getMaLoTrinh() + "'";
            qry = qry + ",MaMB=" + "'" + cb.getMaMB() + "'";
            qry = qry + ",NgayDen=" + "'" + cb.getNgayDen() + "'";
            qry = qry + ",NgayDi=" + "'" + cb.getNgayDi() + "'";
            qry = qry + ",TGDi=" + "'" + cb.getTGDi() + "'";
            qry = qry + ",TGDen=" + "'" + cb.getTGDen() + "'";
            qry = qry + ",SoGheDB=" + "'" + cb.getSoGheDB() + "'";
            qry = qry + ",SoGheVIPDB=" + "'" + cb.getSoGheVIPDB() + "'";
            qry = qry + " " + "where MaChuyen='" + cb.getMaChuyen() + "'";
            st = conn.createStatement();
            st.executeUpdate(qry);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi cập nhật Chuyến bay");
        }
    }

    public ArrayList timkiemDSCB(Date tkNgayDi, Date tkNgayDen) {
        ArrayList dscb = new ArrayList<ChuyenBayDTO>();
        ChuyenBayDTO cb = new ChuyenBayDTO();
        try {
            String qry = "select*from ChuyenBay where";
            qry = qry + "NgayDi>=" + "'" + tkNgayDi + "'";
            qry = qry + "NgayDen<=" + "'" + tkNgayDen + "'";
            st = conn.createStatement();
            st.executeUpdate(qry);
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi xóa Chuyến bay.");
        }
        return dscb;
    }

    public void ExportExcelDatabase() {
        try {
            String sql = "SELECT * FROM chuyenbay";
            st=conn.createStatement();
           st.executeQuery(sql);
            XSSFWorkbook workbook = new XSSFWorkbook();           
            XSSFSheet sheet = workbook.createSheet("ChuyenBay");
            
            XSSFFont font = workbook.createFont();
            font.setFontHeightInPoints((short) 12);
            font.setBold(true);
            
            XSSFCellStyle style = workbook.createCellStyle();
            style.setFont(font);
            
            XSSFRow row = sheet.createRow(0);
            XSSFCell cell;
            cell = row.createCell(0);
            cell.setCellValue("Mã Chuyến");
            cell.setCellStyle(style);
            cell = row.createCell(1);
            cell.setCellValue("Mã lộ trình");
            cell.setCellStyle(style);
            cell = row.createCell(2);
            cell.setCellValue("Mã máy bay");
            cell.setCellStyle(style);
            cell = row.createCell(3);
            cell.setCellValue("Ngày đi");
            cell.setCellStyle(style);
            cell = row.createCell(4);
            cell.setCellValue("Ngày Đến");
            cell.setCellStyle(style);
            cell = row.createCell(5);
            cell.setCellValue("T.Gian Đi");
            cell.setCellStyle(style);
            cell = row.createCell(6);
            cell.setCellValue("T.Gian Đến");
            cell.setCellStyle(style);
            cell = row.createCell(7);
            cell.setCellValue("Số ghế H.Có");
            cell.setCellStyle(style);
            cell = row.createCell(8);
            cell.setCellValue("Số ghế VIP H.Có");
            cell.setCellStyle(style);           
            int i = 1;
            while (rs.next()) {
                row = sheet.createRow(i);
                cell = row.createCell(0);
                cell.setCellValue(rs.getString("MaChuyen"));
                cell = row.createCell(1);
                cell.setCellValue(rs.getString("MaLoTrinh"));
                cell = row.createCell(2);
                cell.setCellValue(rs.getString("MaMB"));
                cell = row.createCell(3);
                cell.setCellValue(rs.getString("NgayDi"));
                cell = row.createCell(4);
                cell.setCellValue(rs.getString("NgayDen"));
                cell = row.createCell(5);
                cell.setCellValue(rs.getString("TGDi"));
                cell = row.createCell(6);
                cell.setCellValue(rs.getString("TGDen"));
                cell = row.createCell(7);
                cell.setCellValue(rs.getInt("SoGheDB"));
                cell = row.createCell(8);
                cell.setCellValue(rs.getInt("SoGheVIPDB")); 
                i++;
            }

            for (int colNum = 0; colNum < row.getLastCellNum(); colNum++) {
                sheet.autoSizeColumn((short) (colNum));
            }
            FileOutputStream out = new FileOutputStream(new File("C:/Zreport/ChuyenBayExcel.xlsx"));
            workbook.write(out);
            out.close();
            System.out.println("Xuat file thanh cong");

        } catch (SQLException | IOException ex) {
            Logger.getLogger(ChuyenBayDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }

    public void ImportExcelDatabase(File file) {
        try {
            FileInputStream in = new FileInputStream(file);
            XSSFWorkbook workbook = new XSSFWorkbook(in);
            XSSFSheet sheet = workbook.getSheetAt(0);
            Row row;
            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                row = sheet.getRow(i);
                String MaChuyen = row.getCell(0).getStringCellValue();
                String MaLoTrinh = row.getCell(1).getStringCellValue();
                String MaMB = row.getCell(2).getStringCellValue();
                Date NgayDi = row.getCell(3).getDateCellValue();
                Date NgayDen = row.getCell(4).getDateCellValue();
                String TGDi = row.getCell(5).getStringCellValue();
                String TGDen = row.getCell(6).getStringCellValue();
                int SoGheDB = (int) row.getCell(7).getNumericCellValue();
                int SoGheVIPDB = (int) row.getCell(7).getNumericCellValue();
                String sql_check = "SELECT * FROM Chuyenbay WHERE MaChuyen='" + MaChuyen + "'";
                ResultSet rs = st.executeQuery(sql_check);
                if (!rs.next()) {
                    String sql = "INSERT INTO laptop VALUES (";
                    sql += "'" + MaChuyen + "',";
                    sql += "'" + MaLoTrinh + "',";
                    sql += "'" + MaMB + "',";
                    sql += "'" + NgayDi + "',";
                    sql += "'" + NgayDen + "',";
                    sql += "'" + TGDi + "',";
                    sql += "'" + TGDen + "',";
                    sql += "'" + SoGheDB + "',";
                    sql += "'" + SoGheVIPDB + "',";
                    sql += ")";
                    System.out.println(sql);
                    st.executeUpdate(sql);
                } else {
                    String sql = "UPDATE chuyenbay SET ";
                    sql += "MaLoTrinh='" + MaLoTrinh + "', ";
                    sql += "MaMayBay='" + MaMB + "', ";
                    sql += "NgayDi='" + NgayDi + "', ";
                    sql += "NgayDen='" + NgayDen + "', ";
                    sql += "TGDi='" + TGDi + "', ";
                    sql += "TGDen='" + TGDen + "', ";
                    sql += "SoGheDB='" + SoGheDB + "', ";
                    sql += "SoGheVIPDB='" + SoGheVIPDB + "', ";
                    sql += "WHERE MaChuyen='" + MaChuyen + "'";
                    sql += ")";
                    System.out.println(sql);
                    st.executeUpdate(sql);
                }
            }
            in.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ChuyenBayDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | SQLException ex) {
            Logger.getLogger(ChuyenBayDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void themghe(String maChuyen,int SL){
        try{
             String qry = "Update ChuyenBay set ";
            qry = qry + "SoGheDB=" + "'" + SL+1 + "'";
            qry = qry + " " + "where MaChuyen='" + maChuyen + "'";
            st = conn.createStatement();
            st.executeUpdate(qry);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi cập nhật Chuyến bay");
        }
            
        }
    }
