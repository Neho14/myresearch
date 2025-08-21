/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package largestifelse;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class LargestIfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largest;
        if (a >= b && a >= c) largest = a;
        else if (b >= a && b >= c) largest = b;
        else largest = c;

        System.out.println("Largest number is: " + largest);
    }
    
}
