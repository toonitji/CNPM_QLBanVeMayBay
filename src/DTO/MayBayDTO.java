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
public class MayBayDTO {
    public String MaMB,TenMayBay,SoDoGhe;
    public int KCGhe,SLGheThuong,SLGheVIP;
    public MayBayDTO(){
    
}
    //////////////////////////
    public String getMaMB(){
        return MaMB;
    }
    public void setMaMB(String MaMB){
        this.MaMB=MaMB;
    }
    public String getTenMayBay(){
        return TenMayBay;
    }
    public void setTenMayBay(String TenMayBay){
        this.TenMayBay=TenMayBay;
    }
    public String getSoDoGhe(){
        return SoDoGhe;
    }
    public void  setSoDoGhe(String SoDoGhe){
        this.SoDoGhe=SoDoGhe;
    }
    public int getKCGhe(){
        return KCGhe;
    }
    public void setKCGhe(int KCGhe){
        this.KCGhe=KCGhe;
    }
    public int getSLGheThuong(){
        return SLGheThuong;
    }
    public void setSLGheThuong(int SLGheThuong){
        this.SLGheThuong=SLGheThuong;
    }
    public int getSLGheVIP(){
        return SLGheVIP;
    }
    public void setSLGheVIP(int SLGheVIP){
        this.SLGheVIP=SLGheVIP;
    }
}
