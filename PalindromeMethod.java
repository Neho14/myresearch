/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromemethod;

/**
 *
 * @author User
 */
public class PalindromeMethod {
    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num != 0) {
            reversed = reversed * 10 + (num % 10);
            num /= 10;
        }

        return original == reversed;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(isPalindrome(121)); // true
        System.out.println(isPalindrome(123)); // false
    }
    
}
