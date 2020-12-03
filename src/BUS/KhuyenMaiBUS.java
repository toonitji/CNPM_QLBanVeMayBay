/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import DAO.KhuyenMaiDAO;
import DTO.KhuyenMaiDTO;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Dell
 */
public class KhuyenMaiBUS {

    public static ArrayList<KhuyenMaiDTO> dskm;

    //////////////
    public void docDSKM() {
        KhuyenMaiDAO data = new KhuyenMaiDAO();
        if (dskm == null) {
            dskm = new ArrayList<>();
        }
        dskm = data.docDSKM();
    }
    public ArrayList<KhuyenMaiDTO> getList() {
        return dskm;
    }
//////////////

    public void them(KhuyenMaiDTO cb) {
        docDSKM();
        KhuyenMaiDAO data = new KhuyenMaiDAO();
        data.them(cb);
        dskm.add(cb);
    }

    /////////
    public void xoa(String MaChuyen) {
        KhuyenMaiDAO data = new KhuyenMaiDAO();
        data.xoa(MaChuyen);
        dskm.remove(MaChuyen);
    }


    public void sua(KhuyenMaiDTO cb) {
        KhuyenMaiDAO data = new KhuyenMaiDAO();
        data.sua(cb);
    }
}
