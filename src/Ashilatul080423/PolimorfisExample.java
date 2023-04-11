/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ashilatul080423;

/**
 *
 * @author Ashilatul
 */
public class PolimorfisExample {
    public static void main(String[] args){
        Person ref;
        Student student = new Student();
        Employee emp = new Employee();
        student.setName("Budi");
        student.setAddress("Padang");
        emp.setName("Doni");
        emp.setAddress("Bukittinggi");
        
        printlnformation(student);
        
        printlnformation(emp);
        
        //ref = student;
        //String temp = ref.getName();
        //Stystem.out.println(temp1);
        
        //ref = emp;
        //String temp1 = ref.getName();
        //System.out.println(temp1);
    }
    
    public static void printlnformation(Person p){
        if(p instanceof Student){
            System.out.println("Nama Student    :" +p.getName());
            System.out.println("Alamat Student  :" +p.getAddress());
        }else if(p instanceof Employee){
            System.out.println("Nama Employee   :" +p.getName());
            System.out.println("Alamat Employee :" +p.getAddress());
        }
    }
}