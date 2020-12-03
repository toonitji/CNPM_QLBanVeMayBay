/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import static BUS.HoaDonBUS.dsHoaDon;
import DAO.ThongKeDAO;
import DTO.HoaDonDTO;
import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class ThongKeBUS {
    public int tongdt;
    public int doanhthu() {
        ArrayList<HoaDonDTO> list = new ArrayList<>();
        dsHoaDon.forEach((x) -> {
            tongdt=tongdt+x.getTongTien();
        });
        return tongdt;
}
}
