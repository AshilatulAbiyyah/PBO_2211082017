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
public interface PengembalianDao {
    void save(Pengembalian pengembalian);
    void update(int index, Pengembalian pengembalian);
    void delete(int idx);
    Pengembalian getPengembalian(int idx);
    List<Pengembalian> getAll();
}