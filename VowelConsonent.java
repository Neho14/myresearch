/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vowelconsonent;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class VowelConsonent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = Character.toLowerCase(sc.next().charAt(0));

        if (ch >= 'a' && ch <= 'z') {
            if ("aeiou".indexOf(ch) != -1) System.out.println(ch + " is a vowel.");
            else System.out.println(ch + " is a consonant.");
        } else {
            System.out.println("Invalid input.");
        }
    }
    
}
