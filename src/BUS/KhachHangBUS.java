/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.KhachHangDAO;
import DTO.KhachHangDTO;
import java.util.ArrayList;

/**
 *
 * @author Super
 */
public class KhachHangBUS {
    public static ArrayList<KhachHangDTO> dskh;
        KhachHangDAO data=new KhachHangDAO();

    public KhachHangBUS(){
    }
    public void docDSKH(){
      //  NhanVienDao data=new NhanVienDao();
        if(dskh==null) dskh=new ArrayList<KhachHangDTO>();
        dskh=data.docDSKH();
    }
    public void them(KhachHangDTO nv){
      //  NhanVienDao data=new NhanVienDao();
        data.them(nv);
        dskh.add(nv);
    }
    public void sua(KhachHangDTO nv){
      //  NhanVienDao data=new NhanVienDao();
        data.sua(nv);
       
    }
    
    public void xoa(String maNv){
      //  NhanVienDao data = new NhanVienDao();
        data.xoa(maNv);
        dskh.remove(maNv);
    }
    
    public KhachHangDTO timKiem(String ma){
        for(KhachHangDTO nv : dskh){
            if(nv.maKH.compareTo(ma)==0){
                return nv;
            }
        }
        return null;
    }
    
    public ArrayList<KhachHangDTO> timkiemHo(String ho){
        ArrayList<KhachHangDTO> kq = new ArrayList<KhachHangDTO>();
        for(KhachHangDTO nv: dskh){
            if(nv.ho.indexOf(ho)>=0){
                kq.add(nv);
            }
        }
        return kq;
    }
    
    public ArrayList<KhachHangDTO> timkiemTen(String ten){
        ArrayList<KhachHangDTO> kqT = new ArrayList<KhachHangDTO>();
        for(KhachHangDTO nv: dskh){
            if(nv.ten.indexOf(ten)>=0){
                kqT.add(nv);
            }
        }
        return kqT;
    }
    
}
