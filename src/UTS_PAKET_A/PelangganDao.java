/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package UTS_PAKET_A;
import Ashilatul.Model.Anggota;
import java.util.List;
/**
 *
 * @author Ashilatul
 */
public interface PelangganDao {
    void save (Pelanggan pelanggan);
    void update(int index, Pelanggan pelanggan);
    void delete(int index);
    Anggota getPelanggan(int index);
    List<Pelanggan> getAll();
}