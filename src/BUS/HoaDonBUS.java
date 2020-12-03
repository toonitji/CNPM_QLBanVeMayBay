package BUS;

import static BUS.VeMayBayBUS.dsVeMayBay;
import DAO.HoaDonDAO;
import DTO.HoaDonDTO;
import DTO.VeMayBayDTO;
import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class HoaDonBUS {

    public static ArrayList<HoaDonDTO> dsHoaDon;
    public int tongdt;

    public void docDSHoaDon() {
        HoaDonDAO data = new HoaDonDAO();
        if (dsHoaDon == null) {
            dsHoaDon = new ArrayList<>();
        }
        dsHoaDon = data.docDSHoaDon();
    }

    public void them(HoaDonDTO hd) {
        HoaDonDAO data = new HoaDonDAO();
        data.them(hd);
        dsHoaDon.add(hd);
    }

    public void xoa(String MaHD) {
        HoaDonDAO data = new HoaDonDAO();
        data.xoa(MaHD);
        dsHoaDon.remove(MaHD);
    }

    public void sua(HoaDonDTO hd) {
        HoaDonDAO data = new HoaDonDAO();
        data.sua(hd);
    }

    public ArrayList timkiemNC(int GiaBD, int GiaKT) throws ParseException {
        ArrayList<HoaDonDTO> list = new ArrayList<>();

        for (HoaDonDTO x : dsHoaDon) {
            if (GiaBD < GiaKT) {
                if (GiaBD <= x.TongTien && GiaKT >= x.TongTien) {

                    list.add(x);
                }
            }
        }
        return list;
    }

    public ArrayList timKiem(String keyword) throws ParseException {
        ArrayList<VeMayBayDTO> list = new ArrayList<>();
        for (VeMayBayDTO x : dsVeMayBay) {
            if (x.getMaChuyen().contains(keyword)) {
                list.add(x);
            }
        }
        return list;
    }

    public int doanhthu() {
        docDSHoaDon();
        ArrayList<HoaDonDTO> list = new ArrayList<>();
        for (HoaDonDTO x : dsHoaDon) {
            tongdt = tongdt + x.getTongTien();
        }
        return tongdt;
    }

    public int dtkhachhang(String keyword) {
        int tongdtkh = 0;
        ArrayList<HoaDonDTO> list = new ArrayList<>();
        for (HoaDonDTO x : dsHoaDon) {
            if (x.getMaKH().equals(keyword)) {
                tongdtkh = tongdtkh + x.getTongTien();
            }

        }
        return tongdtkh;
    }
}
