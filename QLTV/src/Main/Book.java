/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author ADMIN
 */
public class Book {
    String idTaiLieu,TenNXB,TenTG,SoBPH,SoTrang;
  
    public Book(){
    }

    public Book(String idTaiLieu, String TenNXB, String TenTG, String SoBPH, String SoTrang) {
        this.idTaiLieu = idTaiLieu;
        this.TenNXB = TenNXB;
        this.TenTG = TenTG;
        this.SoBPH = SoBPH;
        this.SoTrang = SoTrang;
    }

    public String getIdTaiLieu() {
        return idTaiLieu;
    }

    public void setIdTaiLieu(String idTaiLieu) {
        this.idTaiLieu = idTaiLieu;
    }

    public String getTenNXB() {
        return TenNXB;
    }

    public void setTenNXB(String TenNXB) {
        this.TenNXB = TenNXB;
    }

    public String getTenTG() {
        return TenTG;
    }

    public void setTenTG(String TenTG) {
        this.TenTG = TenTG;
    }

    public String getSoBPH() {
        return SoBPH;
    }

    public void setSoBPH(String SoBPH) {
        this.SoBPH = SoBPH;
    }

    public String getSoTrang() {
        return SoTrang;
    }

    public void setSoTrang(String SoTrang) {
        this.SoTrang = SoTrang;
    }

   
}
