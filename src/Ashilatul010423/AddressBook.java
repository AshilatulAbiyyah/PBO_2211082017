/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ashilatul010423;

/**
 *
 * @author User
 */
public class AddressBook {
    public static void main(String[] args) {
        // contoh penggunaan class BukuAlamat
        AddressBookEntry[] daftarAlamat = new AddressBookEntry[100];
        
        // memasukkan data
        daftarAlamat[0] = new AddressBookEntry("Atull", "Sijunjung", "082284785300", "ashilatulabiyah.com");
        daftarAlamat[1] = new AddressBookEntry("Lathif", "Pessel", "081234567891", "Lathiful.lf.zz.com");
        
        // menghapus data
        daftarAlamat[1] = null;
        
        // menampilkan seluruh data
        for (AddressBookEntry alamat : daftarAlamat) {
            if (alamat != null) {
                System.out.println("Nama: " + alamat.getName());
                System.out.println("Alamat: " + alamat.getAddress());
                System.out.println("Nomor Telepon: " + alamat.getPhoneNumber());
                System.out.println("Alamat Email: " + alamat.getEmail());
                System.out.println();
            }
        }
        
        // update data
        daftarAlamat[0].setPhoneNumber("081234567891");
        System.out.println("Nomor Telepon " + daftarAlamat[0].getName() + " telah diupdate");
        System.out.println("Nomor Telepon terbaru: " + daftarAlamat[0].getPhoneNumber());
    }

}

