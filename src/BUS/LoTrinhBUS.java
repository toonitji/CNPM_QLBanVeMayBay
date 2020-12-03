/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.LoTrinhDAO;
import DTO.LoTrinhDTO;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class LoTrinhBUS {
     public static ArrayList<LoTrinhDTO> dslt;
    //////////////
    public void docDSLT() {
        LoTrinhDAO data = new LoTrinhDAO();
        if (dslt == null) {
            dslt = new ArrayList<>();
        }
        dslt = data.docDSLT();
    }
//////////////
    public void them(LoTrinhDTO lt) {
       docDSLT();
       LoTrinhDAO data = new LoTrinhDAO();
        data.them(lt);
        dslt.add(lt);
    }
    /////////
    public void xoa(String MaLoTrinh){
        LoTrinhDAO data=new LoTrinhDAO();
        data.xoa(MaLoTrinh);
        dslt.remove(MaLoTrinh);
    }
    
/////////////////
    LoTrinhDTO timKiem(String ma) {
        LoTrinhDTO cb = new LoTrinhDTO();
        //code here
        return cb;
    }
    public void sua(LoTrinhDTO lt){
        LoTrinhDAO data=new LoTrinhDAO();
        data.sua(lt);
    }
}

