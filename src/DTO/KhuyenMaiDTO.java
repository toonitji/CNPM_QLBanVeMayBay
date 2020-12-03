/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Dell
 */
public class KhuyenMaiDTO {

    public String MaKM, TenKM, TGBatDau, TGKetThuc;

    public KhuyenMaiDTO() {
    }

    public String getMaKM() {
        return MaKM;
    }

    public void setMaKM(String MaKM) {
        this.MaKM = MaKM;
    }

    public String getTenKM() {
        return TenKM;
    }

    public void setTenKM(String TenKM) {
        this.TenKM = TenKM;
    }

    public String getTGBatDau() {
        return TGBatDau;
    }

    public void setTGBatDau(String TGBatDau) {
        this.TGBatDau = TGBatDau;
    }

    public String getTGKetThuc() {
        return TGKetThuc;
    }

    public void setTGKetThuc(String TGKetThuc) {
        this.TGKetThuc = TGKetThuc;
    }
}
