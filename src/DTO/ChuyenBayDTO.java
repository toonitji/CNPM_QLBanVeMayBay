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
public class ChuyenBayDTO {

    public String MaChuyen, MaLoTrinh, MaMB,NgayDi, NgayDen, TGDi, TGDen;
    
    public int SoGheDB, SoGheVIPDB;
    public ChuyenBayDTO(){
        
    }
   

    public String getMaChuyen() {
        return MaChuyen;
    }

    public void setMaChuyen(String MaChuyen) {
        this.MaChuyen = MaChuyen;
    }

    public String getMaLoTrinh() {
        return MaLoTrinh;
    }

    public void setMaLoTrinh(String MaLoTrinh) {
        this.MaLoTrinh = MaLoTrinh;
    }

    public String getMaMB() {
        return MaMB;
    }

    public void setMaMB(String MaMB) {
        this.MaMB = MaMB;
    }

    public String getNgayDi() {
        return NgayDi;
    }

    public void setNgayDi(String NgayDi) {
        this.NgayDi = NgayDi;
    }

    public String getNgayDen() {
        return NgayDen;
    }

    public void setNgayDen(String NgayDen) {
        this.NgayDen = NgayDen;
    }

    public String getTGDi() {
        return TGDi;
    }

    public void setTGDi(String TGDi) {
        this.TGDi = TGDi;
    }

    public String getTGDen() {
        return TGDen;
    }

    public void setTGDen(String TGDen) {
        this.TGDen = TGDen;
    }

    public int getSoGheDB() {
        return SoGheDB;
    }

    public void setSoGheDB(int SoGheDB) {
        this.SoGheDB = SoGheDB;
    }

    public int getSoGheVIPDB() {
        return SoGheVIPDB;
    }

    public void setSoGheVIPDB(int SoGheVIPDB) {
        this.SoGheVIPDB = SoGheVIPDB;
    }

}
