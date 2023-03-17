/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atul16032023;

/**
 *
 * @author LABP1KOMP
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Latihan61 {
    public static void main(String[] args) {
       BufferedReader dataIn = new BufferedReader (new InputStreamReader(System.in));
        int a ;
        int b ;
        int c ;
        int avg;
        
       
        try{
            System.out.print("Masukkan Nilai pertama anda : ");
            nilai1 = Integer.perseInt(dataIn.readLine());
            System.out.print("Masukkan Nilai kedua anda : ");
            nilai2 = Integer.perseInt(dataIn.readLine());
            System.out.print("Masukkan Nilai ketiga anda : ");
            nilai3 = Integer.perseInt(dataIn.readLine());
            
            avg = (nilai1+ nilai2+nilai3)/3;
            System.out.print("nilai rata-rata : "+avg);
            
    }
} 