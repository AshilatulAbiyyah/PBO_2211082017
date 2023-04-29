/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ashilatul080423;

/**
 *
 * @author Ashilatul
 */
public class StudentRecordExtends {
    private double Computer; 
     public StudentRecordExtends(String a, String b){
         super(a,b);
     }
     public void setComputer(double Computer){
        this.Computer = Computer;
    } 
     public double getComputer(){
        return Computer;
    }
     public double getAverage(){
        average = (mathGrade + englishGrade + scienceGrade + Computer) /4;
        return average;
    }
}