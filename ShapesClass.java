/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shapesclass;

/**
 *
 * @author User
 */
public class ShapesClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create shape objects
        Circle circle = new Circle(5.0);
        Square square = new Square(4.0);
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        
        // Display shape information
        System.out.println("Circle - Area: " + circle.area() + 
                         ", Perimeter: " + circle.perimeter());
        System.out.println("Square - Area: " + square.area() + 
                         ", Perimeter: " + square.perimeter());
        System.out.println("Triangle - Area: " + triangle.area() + 
                         ", Perimeter: " + triangle.perimeter());
    }
}

// Abstract Shape class
abstract class Shape {
    public abstract double area();
    public abstract double perimeter();
}

// Circle subclass
class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

// Square subclass
class Square extends Shape {
    private double side;
    
    public Square(double side) {
        this.side = side;
    }
    
    @Override
    public double area() {
        return side * side;
    }
    
    @Override
    public double perimeter() {
        return 4 * side;
    }
}

// Triangle subclass
class Triangle extends Shape {
    private double side1, side2, side3;
    
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
    
    @Override
    public double area() {
        // Using Heron's formula
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
