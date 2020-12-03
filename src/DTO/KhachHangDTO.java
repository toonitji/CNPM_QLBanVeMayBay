
package DTO;

/**
 *
 * @author Super
 */
public class KhachHangDTO extends Person {
    public String maKH;

    public KhachHangDTO(String maKH) {
        this.maKH = maKH;
    }

    public KhachHangDTO(String maKH, String ho, String ten, String diaChi, String sDT, String eMail) {
        super(ho, ten, diaChi, sDT, eMail);
        this.maKH = maKH;
    }

    public KhachHangDTO() {
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }
    
}
