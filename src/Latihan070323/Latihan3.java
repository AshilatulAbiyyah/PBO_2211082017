/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan070323;

/**
 *
 * @author LABSIKOMP03
 */
public class Latihan3 {
    public static void main(String[] args){
        int number1 = 10;
        int number2 = 23;
        int number3 = 5;
        int score = 0;
        
       score = (number2 > number3)? (number2 >number1)? number2:number1:number3;
        
        System.out.println("number 1 = "+number1);
        System.out.println("number 2 = "+number2); 
        System.out.println("number 3 = "+number3);
        System.out.println("nilai tertinggi = "+score);
    }
    
}
