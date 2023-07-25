/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Ashilatul.Dao;
import Ashilatul.Model.Buku;
import java.util.List;
/**
 *
 * @author Ashilatul
 */
public interface BukuDao {
   void save(Buku buku);
    void update(int index, Buku buku);
    void delete(int index);
    Buku getBuku(int index);
    List<Buku> getAll();
}