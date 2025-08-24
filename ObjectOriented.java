/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objectoriented;

/**
 *
 * @author User
 */
class Car {
    String brand;
    String model;
    int year;

    void start() {
        System.out.println(brand + " " + model + " is starting...");
    }

    void drive() {
        System.out.println(brand + " " + model + " is driving...");
    }
}

public class ObjectOriented {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Car car1 = new Car();
        car1.brand = "Merc";
        car1.model = "C63";
        car1.year = 2022;

        car1.start();
        car1.drive();
    }
    
}
