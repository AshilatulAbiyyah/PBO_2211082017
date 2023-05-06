/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ashilatul.Model;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ashilatul
 */
public class PeminjamanDaoImpl implements PeminjamanDao{
    List<Peminjaman> daftarPeminjaman = new ArrayList<>();
    
    public PeminjamanDaoImpl (){
        AnggotaDao daoAnggota = new AnggotaDaolmpl();
        BukuDao daoBuku = new BukuDaolmpl();
        daftarPeminjaman.add(new Peminjaman(daoAnggota.getAnggota(0),daoBuku.getBuku(0),"27042023","30042023"));
        daftarPeminjaman.add(new Peminjaman(daoAnggota.getAnggota(1),daoBuku.getBuku(1),"27042023","10052023"));
    }
  
   public void save(Peminjaman peminjaman){
       daftarPeminjaman.add(peminjaman);
   }
   
   public void update(int index, Peminjaman peminjaman){
       daftarPeminjaman.set(index, peminjaman);
   }
   
   public void delete(int index){
       daftarPeminjaman.remove(index);
   }
   
   public Peminjaman getPeminjaman(int index){
       return daftarPeminjaman.get(index);
   }
   
   public List<Peminjaman>getAll(){
       return daftarPeminjaman;
    }
}
