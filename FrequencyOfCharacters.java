/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frequencyofcharacters;

/**
 *
 * @author User
 */
import java.util.Scanner;
import java.util.HashMap;
public class FrequencyOfCharacters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        HashMap<Character, Integer> freq = new HashMap<>();

        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        System.out.println("Character frequencies:");
        for (char c : freq.keySet()) {
            System.out.println(c + " -> " + freq.get(c));
        }
    }
    
}
