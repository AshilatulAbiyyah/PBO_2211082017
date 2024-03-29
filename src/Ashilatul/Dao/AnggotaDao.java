/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Ashilatul.Dao;

import Ashilatul.model.*;
import java.util.*;

/**
 *
 * @author Ashilatul
 */
public interface AnggotaDao {
    void insert(Anggota2 anggota) throws Exception;
    void update(Anggota2 anggota) throws Exception;
    void delete(Anggota2 anggota) throws Exception;
    Anggota2 getAnggota(String kodeanggota) throws Exception;
    List<Anggota2> getAll() throws Exception;
}