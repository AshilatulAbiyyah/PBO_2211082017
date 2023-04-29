/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ashilatul080423;

/**
 *
 * @author Ashilatul
 */
public class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    
    public double getArea() {
        return side * side;
    }

    public String getName() {
        return "Square";
    }
    
    public double getSide() {
        return side;
    }
}