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
public class PengembalianDaoImpl implements PengembalianDao{
    List<Pengembalian> data = new ArrayList<>();
    public PengembalianDaoImpl(){
        PeminjamanDaoImpl data1 = new PeminjamanDaoImpl();
        data.add(new Pengembalian(data1.getPeminjaman(0).getTglkembali(),"29/04/2034"));
        data.add(new Pengembalian("",""));
    }
    
    public void save(Pengembalian pengembalian){
        data.add(pengembalian);
    }
    
    public void update(int idx, Pengembalian pengembalian){
        data.set(idx, pengembalian);
    }
    
    public void delete(int idx){
        data.remove(idx);
    }
    
    public Pengembalian getPengembalian(int idx){
        return data.get(idx);
    }
    
    public List<Pengembalian> getAll(){
        return data;
    }
}