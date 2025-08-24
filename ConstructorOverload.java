/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructoroverload;

/**
 *
 * @author User
 */
class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Constructor with one parameter
    Student(String n) {
        name = n;
        age = 18;
    }

    // Constructor with two parameters
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorOverload {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student s1 = new Student();
        Student s2 = new Student("Neo");
        Student s3 = new Student("Neho", 22);

        s1.display();
        s2.display();
        s3.display();
    }
    
}
