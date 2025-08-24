/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reversestringmethod;

/**
 *
 * @author User
 */
public class ReverseStringMethod {
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(reverse("hello"));
    }
    
}
