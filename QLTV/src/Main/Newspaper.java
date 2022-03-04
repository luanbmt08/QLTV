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
public class Newspaper {
    String IdTaiLieu,TenNXB,SoBPH,NgayPH;
    public Newspaper(){
        
    }

    public Newspaper(String IdTaiLieu, String TenNXB, String SoBPH, String NgayPH) {
        this.IdTaiLieu = IdTaiLieu;
        this.TenNXB = TenNXB;
        this.SoBPH = SoBPH;
        this.NgayPH = NgayPH;
    }

    public String getIdTaiLieu() {
        return IdTaiLieu;
    }

    public void setIdTaiLieu(String idTaiLieu) {
        this.IdTaiLieu = idTaiLieu;
    }

    public String getTenNXB() {
        return TenNXB;
    }

    public void setTenNXB(String TenNXB) {
        this.TenNXB = TenNXB;
    }

    public String getSoBPH() {
        return SoBPH;
    }

    public void setSoBPH(String SoBPH) {
        this.SoBPH = SoBPH;
    }

    public String getNgayPH() {
        return NgayPH;
    }

    public void setNgayPH(String NgayPH) {
        this.NgayPH = NgayPH;
    }

    
}
