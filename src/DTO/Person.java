package DTO;

import java.util.Scanner;

public class Person {
    public String ho;
    public String ten;
    public String diaChi;
    public String sDT;
    public String eMail;

    public Person() {
    }

    public Person(String ho, String ten, String diaChi, String sDT, String eMail) {
        this.ho = ho;
        this.ten = ten;
        this.diaChi = diaChi;
        this.sDT = sDT;
        this.eMail = eMail;
    }
    
    public void intputInfo(){
        Scanner input = new Scanner(System.in);
        
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getsDT() {
        return sDT;
    }

    public void setsDT(String sDT) {
        this.sDT = sDT;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    
    
}
