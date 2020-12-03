/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.VeMayBayDAO;
import DTO.VeMayBayDTO;
import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class VeMayBayBUS {

    public static ArrayList<VeMayBayDTO> dsVeMayBay;

    public void docDSVeMayBay() {
        VeMayBayDAO data = new VeMayBayDAO();
        if (dsVeMayBay == null) {
            dsVeMayBay = new ArrayList<>();
        }
        dsVeMayBay = data.docDSVeMayBay();
    }

    public void them(VeMayBayDTO vmb) {
        docDSVeMayBay();
        VeMayBayDAO data = new VeMayBayDAO();
        data.them(vmb);
        dsVeMayBay.add(vmb);
    }

    public void xoa(String MaVe) {
        VeMayBayDAO data = new VeMayBayDAO();
        data.xoa(MaVe);
        dsVeMayBay.remove(MaVe);
    }

    public void sua(VeMayBayDTO vmb) {
        VeMayBayDAO data = new VeMayBayDAO();
        data.sua(vmb);
    }

    public ArrayList timkiemVeMayBay(String GiaBD, String GiaKT, String MaChuyenBay) throws ParseException {
        ArrayList<VeMayBayDTO> list = new ArrayList<>();
        for (VeMayBayDTO x : dsVeMayBay) {
            if (GiaBD != GiaKT) {
                list.add(x);
            }
        }
        return list;
    }

    public ArrayList timkiemNC(int GiaBD, int GiaKT) throws ParseException {
        ArrayList<VeMayBayDTO> list = new ArrayList<>();
        for (VeMayBayDTO x : dsVeMayBay) {
            if (GiaBD < GiaKT) {
                if (GiaBD <= x.Gia && GiaKT >= x.Gia) {
                    list.add(x);
                }
            }
        }
        return list;
    }

    public ArrayList timKiem(String keyword) throws ParseException {
        docDSVeMayBay();
        ArrayList<VeMayBayDTO> list = new ArrayList<>();
        for (VeMayBayDTO x : dsVeMayBay) {
            if (x.getMaVe().equals(keyword)) {
                list.add(x);
            }
        }
        return list;
    }
    public int dtHD(String keyword) throws ParseException{
        docDSVeMayBay();
        int tongdthd=0;
        ArrayList<VeMayBayDTO> list = new ArrayList<>();
        for (VeMayBayDTO x : dsVeMayBay) {
            if (x.getMaVe().equals(keyword)) {
                tongdthd = tongdthd + x.getGia();
            }
    }return tongdthd;

    }

}
