/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.CTKhuyenMaiDAO;
import DTO.CTKhuyenMaiDTO;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class CTKhuyenMaiBUS {
     public static ArrayList<CTKhuyenMaiDTO> dsctkm;
    //////////////
    public void docDSCTKM() {
        CTKhuyenMaiDAO data = new CTKhuyenMaiDAO();
        if (dsctkm == null) {
            dsctkm = new ArrayList<>();
        }
        dsctkm = data.docDSCTKM();
    }
//////////////
    public void them(CTKhuyenMaiDTO lt) {
       docDSCTKM();
       CTKhuyenMaiDAO data = new CTKhuyenMaiDAO();
        data.themctkm(lt);
        dsctkm.add(lt);
    }
    /////////
    public void xoa(String MaCTKhuyenMai){
        CTKhuyenMaiDAO data=new CTKhuyenMaiDAO();
        data.xoactkm(MaCTKhuyenMai);
        dsctkm.remove(MaCTKhuyenMai);
    }
    
/////////////////
    CTKhuyenMaiDTO timKiem(String ma) {
        CTKhuyenMaiDTO cb = new CTKhuyenMaiDTO();
        //code here
        return cb;
    }
    public void sua(CTKhuyenMaiDTO lt){
        CTKhuyenMaiDAO data=new CTKhuyenMaiDAO();
        data.suactkm(lt);
    }
}


