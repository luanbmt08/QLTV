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
public class Jounary {
    String IdTaiLieu,TenNXB,SoBPH,SoPH,ThangPH;
    public Jounary(){
        
    }

    public Jounary(String IdTaiLieu, String TenNXB, String SoBPH, String SoPH, String ThangPH) {
        this.IdTaiLieu = IdTaiLieu;
        this.TenNXB = TenNXB;
        this.SoBPH = SoBPH;
        this.SoPH = SoPH;
        this.ThangPH = ThangPH;
    }

    public String getIdTaiLieu() {
        return IdTaiLieu;
    }

    public void setIdTaiLieu(String IdTaiLieu) {
        this.IdTaiLieu = IdTaiLieu;
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

    public String getSoPH() {
        return SoPH;
    }

    public void setSoPH(String SoPH) {
        this.SoPH = SoPH;
    }

    public String getThangPH() {
        return ThangPH;
    }

    public void setThangPH(String ThangPH) {
        this.ThangPH = ThangPH;
    }
    
}
