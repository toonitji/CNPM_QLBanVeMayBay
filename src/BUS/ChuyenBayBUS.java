/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.ChuyenBayDAO;
import DTO.ChuyenBayDTO;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;

/**
 *
 * @author Dell
 */
public class ChuyenBayBUS {

    public static ArrayList<ChuyenBayDTO> dscb;

    //////////////
    public void docDSCB() {
        ChuyenBayDAO data = new ChuyenBayDAO();
        if (dscb == null) {
            dscb = new ArrayList<>();
        }
        dscb = data.docDSCB();
    }

    public ArrayList<ChuyenBayDTO> getList() {
        return dscb;
    }
//////////////

    public void them(ChuyenBayDTO cb) {
        docDSCB();
        ChuyenBayDAO data = new ChuyenBayDAO();
        data.them(cb);
        dscb.add(cb);
    }

    /////////
    public void xoa(String MaChuyen) {
        ChuyenBayDAO data = new ChuyenBayDAO();
        data.xoa(MaChuyen);
        dscb.remove(MaChuyen);
    }

    public ArrayList timkiemNC(Date NgayDi, Date NgayDen) throws ParseException {
        ArrayList<ChuyenBayDTO> list = new ArrayList<>();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        for (ChuyenBayDTO x : dscb) {
            if (NgayDi.before(NgayDen)) {
                if ((df.parse(x.getNgayDi())).after(NgayDi)
                        && (df.parse(x.getNgayDi())).before(NgayDen)) {
                    list.add(x);
                }
            }
        }
        return list;
    }

    public ArrayList timKiem(String keyword) throws ParseException {
        ArrayList<ChuyenBayDTO> list = new ArrayList<>();
        for (ChuyenBayDTO x : dscb) {
            if (x.getMaChuyen().contains(keyword)) {
                list.add(x);
            }
        }
        return list;
    }

    public void sua(ChuyenBayDTO cb) {
        ChuyenBayDAO data = new ChuyenBayDAO();
        data.sua(cb);
    }

    public void ExportExcelDatabase() {
        ChuyenBayDAO spDAO = new ChuyenBayDAO();
        spDAO.ExportExcelDatabase();

    }

    public void ImportExcelDatabase(File file) {
        ChuyenBayDAO spDAO = new ChuyenBayDAO();
        spDAO.ImportExcelDatabase(file);
    }
    public void themghe(String machuyen,int SL){
        ChuyenBayDAO dao=new ChuyenBayDAO();
        dao.themghe(machuyen, SL);
    }
}
