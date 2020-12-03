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
public class LoaiVeDTO {
    public String MaLoaiVe, TenLoai;
    public int GiaTien;

    public LoaiVeDTO() {
    }

    public LoaiVeDTO(String MaLoaiVe, String TenLoai, int GiaTien) {
        this.MaLoaiVe = MaLoaiVe;
        this.TenLoai = TenLoai;
        this.GiaTien = GiaTien;
    }

    public void setMaLoaiVe(String MaLoaiVe) {
        this.MaLoaiVe = MaLoaiVe;
    }

    public void setTenLoai(String TenLoai) {
        this.TenLoai = TenLoai;
    }

    public void setGiaTien(int GiaTien) {
        this.GiaTien = GiaTien;
    }

    public String getMaLoaiVe() {
        return MaLoaiVe;
    }

    public String getTenLoai() {
        return TenLoai;
    }

    public int getGiaTien() {
        return GiaTien;
    }
    
}
