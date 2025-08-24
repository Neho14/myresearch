/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractclassesmethods;

/**
 *
 * @author User
 */
abstract class Animal {
    abstract void sound();

    void sleep() {
        System.out.println("Animals sleep");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}
public class AbstractClassesMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal a = new Cat();
        a.sound();
        a.sleep();
    }
    
}
