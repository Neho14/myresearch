/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hierarchicalinheritence;

/**
 *
 * @author User
 */
class Vehicle {
    void fuel() {
        System.out.println("Vehicles needs power");
    }
}

class Bike extends Vehicle {
    void wheels() {
        System.out.println("Bike has 2 wheels");
    }
}

class Car extends Vehicle {
    void wheels() {
        System.out.println("Car has 4 wheels");
    }
}
public class HierarchicalInheritence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Bike b = new Bike();
        Car c = new Car();

        b.fuel();
        b.wheels();

        c.fuel();
        c.wheels();
    }
    
}
