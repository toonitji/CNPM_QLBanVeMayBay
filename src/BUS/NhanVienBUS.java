/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.NhanVienDAO;
import DTO.NhanVienDTO;
import java.util.ArrayList;


public class NhanVienBUS {
public static ArrayList<NhanVienDTO> dsnv;
        NhanVienDAO data=new NhanVienDAO();
    
    public NhanVienBUS(){
    }
    public void docDSNV(){
      //  NhanVienDAO data=new NhanVienDAO();
        if(dsnv==null) dsnv=new ArrayList<NhanVienDTO>();
        dsnv=data.docDSNV();
    }
    public void them(NhanVienDTO nv){
      //  NhanVienDAO data=new NhanVienDAO();
        data.them(nv);
        dsnv.add(nv);
    }
    public void sua(NhanVienDTO nv){
      NhanVienDAO data=new NhanVienDAO();
        data.sua(nv);
       
    }
    
     public void doiMK(NhanVienDTO nv){
         NhanVienDAO data=new NhanVienDAO();
        data.suaMK(nv);
    }
    
    public void xoa(String maNv){
      //  NhanVienDAO data = new NhanVienDAO();
        data.xoa(maNv);
        dsnv.remove(maNv);
    }
    
    public NhanVienDTO timKiem(String ma){
        
        for(NhanVienDTO nv : dsnv){
            if(nv.maNv.compareTo(ma)==0){
                return nv;
            }
        }
        return null;
    }
    
    public NhanVienDTO KTtrungMa(String ma){
        if(dsnv==null) dsnv=new ArrayList<NhanVienDTO>();
        dsnv=data.docDSNV();
        for(NhanVienDTO nv : dsnv){
            if(nv.maNv.compareTo(ma)==0){
                    return nv;
                }
            
        }
        return null;
    }
    
    public NhanVienDTO KTlogin(String ma,String pass){
        if(dsnv==null) dsnv=new ArrayList<NhanVienDTO>();
        dsnv=data.docDSNV();
        for(NhanVienDTO nv : dsnv){
            if(nv.maNv.compareTo(ma)==0){
                if(nv.pass.compareTo(pass)==0){
                    return nv;
                }
            }
        }
        return null;
    }
    
    public ArrayList<NhanVienDTO> timkiemHo(String ho){
        ArrayList<NhanVienDTO> kq = new ArrayList<NhanVienDTO>();
        for(NhanVienDTO nv: dsnv){
            if(nv.ho.indexOf(ho)>=0){
                kq.add(nv);
            }
        }
        return kq;
    }
    
    public ArrayList<NhanVienDTO> timkiemTen(String ten){
        ArrayList<NhanVienDTO> kqT = new ArrayList<NhanVienDTO>();
        for(NhanVienDTO nv: dsnv){
            if(nv.ten.indexOf(ten)>=0){
                kqT.add(nv);
            }
        }
        return kqT;
    }
    
   
}

