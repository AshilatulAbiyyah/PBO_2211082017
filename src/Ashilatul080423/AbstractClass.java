/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ashilatul080423;

/**
 *
 * @author Ashilatul
 */
public class AbstractClass {
    public static void main(String[] args) {
        
        Shape circle = new Circle(14);
        System.out.println("Area of " + circle.getName() + " with radius " + ((Circle) circle).getadius()  + " is " + circle.getArea());

        System.out.println();
        
        Shape square(int) = new Square(12);
        System.out.println("Area of " + square.getName() + " with side " + ((Square) square).getSide()  +  " is " + square.getArea());
    }
}