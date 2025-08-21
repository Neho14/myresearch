/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package largestamongthree;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class LargestAmongThree {

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

        int largest = a > b ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Largest number is: " + largest);
    }
    
}
