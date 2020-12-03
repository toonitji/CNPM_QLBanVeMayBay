/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Super
 */
public class NhanVienDTO extends Person{
   public String maNv;
   public String luong;
   public String soTK;
   public String maQuyen;

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
   public String pass;

    public NhanVienDTO(String maNv, String luong, String soTK, String maQuyen) {
        this.maNv = maNv;
        this.luong = luong;
        this.soTK = soTK;
        this.maQuyen = maQuyen;
    }
   

    public String getMaNv() {
        return maNv;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

    public String getLuong() {
        return luong;
    }

    public void setLuong(String luong) {
        this.luong = luong;
    }

    public String getSoTK() {
        return soTK;
    }

    public void setSoTK(String soTK) {
        this.soTK = soTK;
    }

    public String getMaQuyen() {
        return maQuyen;
    }

    public void setMaQuyen(String maQuyen) {
        this.maQuyen = maQuyen;
    }

    public NhanVienDTO() {
    }

    public NhanVienDTO(String ho, String ten, String diaChi, String sDT, String eMail) {
        super(ho, ten, diaChi, sDT, eMail);
    }

   
    
    
}
