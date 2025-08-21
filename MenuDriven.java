/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menudriven;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class MenuDriven {
    Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //TO DO code logic here
    do {
        System.out.println("Calculate Area");
        System.out.println("Choose your shape:");
        System.out.println("1. Rectangle");
        System.out.println("2. Triangle");
        System.out.println("3. Circle");
        System.out.print("Enter your choice: ");

        int choice = input.nextInt();
        double area = 0;

        switch (choice) {
            case 1:
                // Rectangle
                System.out.print("Enter length (meters): ");
                double length = input.nextDouble();
                System.out.print("Enter width (meters): ");
                double width = input.nextDouble();
                area = length * width;
                break;

            case 2:
                // Triangle
                System.out.print("Enter base (meters): ");
                double base = input.nextDouble();
                System.out.print("Enter height (meters): ");
                double height = input.nextDouble();
                area = (base * height) / 2;
                break;

            case 3:
                // Circle
                System.out.print("Enter radius (meters): ");
                double radius = input.nextDouble();
                area = Math.PI * radius * radius;
                break;

            default:
                System.out.println("Invalid choice. Try again.");
                continue;
        }
        //2 decimal places and squared
         System.out.printf("Calculated area = %.2f m squared", area);

        //land size
        if (area < 500) {
            System.out.println("Land Classification: Small");
        } else if (area < 2000) {
            System.out.println("Land Classification: Medium");
        } else {
            System.out.println("Land Clasification: Big");
        }

        } while (true);
    }
    
}
