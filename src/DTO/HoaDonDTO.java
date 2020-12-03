package DTO;

/**
 *
 * @author USER
 */
public class HoaDonDTO {

    public String MaHD, MaNV, MaKH, NgayMua, Ghichu, MaKM;
    public int TongTien;

    public HoaDonDTO() {
    }

    public String getMaHD() {
        return MaHD;
    }

    public String getMaNV() {
        return MaNV;
    }

    public String getMaKH() {
        return MaKH;
    }

    public String getNgayMua() {
        return NgayMua;
    }

    public String getGhichu() {
        return Ghichu;
    }

    public String getMaKM() {
        return MaKM;
    }

    public int getTongTien() {
        return TongTien;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public void setNgayMua(String NgayMua) {
        this.NgayMua = NgayMua;
    }

    public void setGhichu(String Ghichu) {
        this.Ghichu = Ghichu;
    }

    public void setMaKM(String MaKM) {
        this.MaKM = MaKM;
    }

    public void setTongTien(int TongTien) {
        this.TongTien = TongTien;
    }
}
