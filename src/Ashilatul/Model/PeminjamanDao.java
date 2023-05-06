/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ashilatul.Model;
import java.util.List;

/**
 *
 * @author Ashilatul
 */
public interface PeminjamanDao {
    void save (Peminjaman pemminjaman);
    void update (int index, Peminjaman peminjaman);
    void delete (int index);
    Peminjaman getPeminjaman(int index);
    List<Peminjaman> getAll();
}