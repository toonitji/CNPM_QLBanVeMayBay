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
public class VeMayBayDTO {
    public String MaVe, MaChuyen,MaLoaiVe, MaLoaiGhe;
    public int Gia;

    public VeMayBayDTO() {
    }

    public VeMayBayDTO(String MaVe, String MaChuyen, String MaLoaiVe, String MaLoaiGhe, int Gia) {
        this.MaVe = MaVe;
        this.MaChuyen = MaChuyen;
        
        this.MaLoaiVe = MaLoaiVe;
        this.MaLoaiGhe = MaLoaiGhe;
        this.Gia = Gia;
    }

    public void setMaVe(String MaVe) {
        this.MaVe = MaVe;
    }

    public void setMaChuyen(String MaChuyen) {
        this.MaChuyen = MaChuyen;
    }

    

    public void setMaLoaiVe(String MaLoaiVe) {
        this.MaLoaiVe = MaLoaiVe;
    }

    public void setMaLoaiGhe(String MaLoaiGhe) {
        this.MaLoaiGhe = MaLoaiGhe;
    }

    public void setGia(int Gia) {
        this.Gia = Gia;
    }

    public String getMaVe() {
        return MaVe;
    }

    public String getMaChuyen() {
        return MaChuyen;
    }

    

    public String getMaLoaiVe() {
        return MaLoaiVe;
    }

    public String getMaLoaiGhe() {
        return MaLoaiGhe;
    }

    public int getGia() {
        return Gia;
    }
    
    
}
