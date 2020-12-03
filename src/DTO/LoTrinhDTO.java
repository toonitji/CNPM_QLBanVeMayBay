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
public class LoTrinhDTO {

    public String MaLoTrinh, NoiDi, NoiDen;
    public float TGBay;

    public LoTrinhDTO() {
    }
    ////////////////////
    public String getMaLoTrinh() {
        return MaLoTrinh;
    }

    public void setMaLoTrinh(String MaLoTrinh) {
        this.MaLoTrinh = MaLoTrinh;
    }

    public String getNoiDi() {
        return NoiDi;
    }

    public void setNoiDi(String NoiDi) {
        this.NoiDi = NoiDi;
    }

    public String getNoiDen() {
        return NoiDen;
    }

    public void setNoiDen(String NoiDen) {
        this.NoiDen = NoiDen;
    }

    public float getTGBay() {
        return TGBay;
    }

    public void setTGBay(float TGBay) {
        this.TGBay = TGBay;
    }
}
