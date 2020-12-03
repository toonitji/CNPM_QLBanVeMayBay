/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.ChiTietLoaiGheDAO;
import DTO.ChiTietLoaiGheDTO;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class ChiTietLoaiGheBUS {
    public static ArrayList<ChiTietLoaiGheDTO> dsTable;
    
    public void docDSTable() {
        ChiTietLoaiGheDAO data = new ChiTietLoaiGheDAO();
        if (dsTable == null) {
            dsTable = new ArrayList<>();
        }
        dsTable = data.docDSTable();
    }
    
    public void them( ChiTietLoaiGheDTO tb) {
        docDSTable();
        ChiTietLoaiGheDAO data = new ChiTietLoaiGheDAO();
        data.them(tb);
        dsTable.add(tb);
    }
    
    public void xoa(String MaLoaiGhe){
        ChiTietLoaiGheDAO data=new ChiTietLoaiGheDAO();
        data.xoa(MaLoaiGhe);
        dsTable.remove(MaLoaiGhe);
    }
    
    public void sua(ChiTietLoaiGheDTO tb ){
        ChiTietLoaiGheDAO data = new ChiTietLoaiGheDAO();
        data.sua(tb);
    }
}
