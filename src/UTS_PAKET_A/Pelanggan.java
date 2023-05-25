/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_PAKET_A;

/**
 *
 * @author Ashilatul
 */
public class Pelanggan {
    private String Kodepelanggan;
    private String Namapelanggan;
    private String Jenispelanggan;
    
    public Pelanggan(){
    }
    
    public 
        Pelanggan(String Kodepelanggan, String Namapelanggan, String Jenispelanggan) {
        this.Kodepelanggan = Kodepelanggan;
        this.Namapelanggan = Namapelanggan;
        this.Jenispelanggan = Jenispelanggan;
    }
    
    public String getKodepelanggan(){
        return Kodepelanggan;
    }
    
    public void setNobp(String Kodepelanggan){
        this.Kodepelanggan = Kodepelanggan;
    }
    
    public String getNamapelanggan(){
        return Namapelanggan;
    }
    
    public void setNamapelanggan(String Namapelanggan){
        this.Namapelanggan = Namapelanggan;
    }
    
    public String getJenispelanggan(){
        return Jenispelanggan;
    }
    
    public void setJenispelanggan(String Jenispelanggan){
        this.Jenispelanggan = Jenispelanggan;
    }    
}