/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ashilatul.Model;

/**
 *
 * @author Ashilatul
 */
public class Peminjaman {
   private Anggota anggota;
   private Buku buku;
   private String tglpinjam;
   private String tglkembali;
   
   public Peminjaman(){
   }
   
   public Peminjaman (Anggota anggota, Buku buku, String tglpinjam, String tglkembali){
       this.anggota = anggota;
       this.buku = buku;
       this.tglpinjam = tglpinjam;
       this.tglkembali = tglkembali;
   }
   
   public Anggota getAnggota(){
       return anggota;
   }
   
   public void setAngggota(Anggota anggota){
       this.anggota = anggota;
   }
   
   public Buku getBuku(){
       return buku;
   }
   
   public void setBuku(Buku buku){
       this.setBuku(buku);
   }
   
   public String getTglpinjam( String Tglpinjam){
       return tglpinjam;
   }
   
   public void setTglpinjam (String Tglpinjam){
       this.tglpinjam = Tglpinjam;
   }
   
   public String getTglkembali( String Tglkembali){
       return tglkembali;
   }
   
   public void setTglkembali(String Tglkembali){
       this.setTglkembali(Tglkembali);
   }
}