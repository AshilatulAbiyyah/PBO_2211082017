/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ashilatul010423;

/**
 *
 * @author Ashilatul
 */
public class StudentRecordExample {
    public static void main(String[] args){
        StudentRecord anna = new StudentRecord();
        StudentRecord cris = new StudentRecord();
        StudentRecord ali = new StudentRecord("ali");
        
        //isi data
        anna.setName("Anna");
        anna.setAddress("Padang");
        anna.setAge(18);
        anna.setmathGrade(80);
        anna.setenglishGrade(98);
        
        cris.setName("Kris");
        cris.setAddress("Bukittinggi");
        cris.setAge("22");
        
        ali.setName("Ali");
        ali.setAddress("Bandung");
        ali.setAge("20");
        
        //menampilkan
        System.out.println("Data Objek Anna");
        System.out.println("Nama    :" + anna.getName());
        System.out.println("Alamat  :" + anna.getAddress());
        System.out.println("Umur    :" + anna.getAge()); 
        System.out.println("Math Grade  :" + anna.getmathGrade());
        System.out.println("English Grade   :" + anna.getenglishGrade()); 
        System.out.println("Science Grade :" + anna.getscienceGrade());
        System.out.println("Rata-rata  :" + anna.getAverage());
        System.out.println("Nilai Huruf  :" + anna.getnilaiHuruf()); 
        
        System.out.println("");
        
        //memanggil method print
        System.out.println("Data Objek Kris");
        cris.print("");
        cris.print(70,80,90);
        
        System.out.println("Data Objek Ali");
        System.out.println("");
        ali.print("");
        
        //menampilkan jumlah siswa
        System.out.println("");
        System.out.println("Count =" +StudentRecord.getStudentCount());     
    }
}