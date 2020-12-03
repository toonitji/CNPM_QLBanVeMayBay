/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.MayBayDAO;
import DTO.MayBayDTO;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class MayBayBUS {

    public static ArrayList<MayBayDTO> dsmb;

    //////////////
    public void docDSMB() {
        MayBayDAO data = new MayBayDAO();
        if (dsmb == null) {
            dsmb = new ArrayList<>();
        }
        dsmb = data.docDSMB();
    }
    public void xoa(String MaMB){
        MayBayDAO data=new MayBayDAO();
        data.xoa(MaMB);
        dsmb.remove(MaMB);
    }
    public void sua(MayBayDTO mb){
        MayBayDAO data=new MayBayDAO();
        data.sua(mb);
    }
    public void them(MayBayDTO lt) {
       docDSMB();
       MayBayDAO data = new MayBayDAO();
        data.them(lt);
        dsmb.add(lt);
    }
        
}
