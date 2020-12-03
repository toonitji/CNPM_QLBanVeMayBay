/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.LoaiVeDAO;
import DTO.LoaiVeDTO;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class LoaiVeBUS {
    public static ArrayList<LoaiVeDTO> dsLoaiVe;
    public void docDSLoaiVe(){
        LoaiVeDAO data = new LoaiVeDAO();
        if(dsLoaiVe == null){
            dsLoaiVe = new ArrayList<>();
        }
        dsLoaiVe = data.docDSLoaiVe();
    }
    public void them(LoaiVeDTO lv){
        docDSLoaiVe();
        LoaiVeDAO data = new LoaiVeDAO();
        data.them(lv);
        dsLoaiVe.add(lv);
        
    }
   public void xoa(String MaLoaiVe){
        LoaiVeDAO data=new LoaiVeDAO();
        data.xoa(MaLoaiVe);
        dsLoaiVe.remove(MaLoaiVe);
    }
    public void sua(LoaiVeDTO lv ){
        LoaiVeDAO data = new LoaiVeDAO();
        data.sua(lv);
    }
    
}
