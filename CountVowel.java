/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package countvowel;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class CountVowel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        int count = 0;
        for (char c : str.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }

        System.out.println("Number of vowels: " + count);
    }
    
}
