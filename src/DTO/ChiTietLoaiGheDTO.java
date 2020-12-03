/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author USER
 */
public class ChiTietLoaiGheDTO {
    public String MaLoaiGhe,MaChuyen,TenLoai;
    public int GiaVe;

    public ChiTietLoaiGheDTO() {
    }

    public ChiTietLoaiGheDTO(String MaLoaiGhe, String MaChuyen, String TenLoai, int GiaVe) {
        this.MaLoaiGhe = MaLoaiGhe;
        this.MaChuyen = MaChuyen;
        this.TenLoai = TenLoai;
        this.GiaVe = GiaVe;
    }

    public String getMaLoaiGhe() {
        return MaLoaiGhe;
    }

    public String getMaChuyen() {
        return MaChuyen;
    }

    public String getTenLoai() {
        return TenLoai;
    }

    public int getGiaVe() {
        return GiaVe;
    }

    public void setMaLoaiGhe(String MaLoaiGhe) {
        this.MaLoaiGhe = MaLoaiGhe;
    }

    public void setMaChuyen(String MaChuyen) {
        this.MaChuyen = MaChuyen;
    }

    public void setTenLoai(String TenLoai) {
        this.TenLoai = TenLoai;
    }

    public void setGiaVe(int GiaVe) {
        this.GiaVe = GiaVe;
    }
    
}
