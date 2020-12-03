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
public class CTKhuyenMaiDTO {
    public String MaKM,DieuKienKM;
    public int GiamGia;
    public CTKhuyenMaiDTO(){    
    }
    public String getMaKM(){
        return MaKM;
    }
    public void setMaKM(String MaKM){
        this.MaKM=MaKM;
    }
    public String getDieuKienKM(){
        return DieuKienKM;
    }
    public void setDieuKienKM(String DieuKienKM){
        this.DieuKienKM=DieuKienKM;
    }
    public int getGiamGia(){
        return GiamGia;
    }
    public void setGiamGia(int GiamGia){
        this.GiamGia=GiamGia;
    }
}
