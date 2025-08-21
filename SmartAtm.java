/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package smartatm;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class SmartAtm {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int CORRECT_PIN = 3691;
        int attempts = 0;
        double balance = 10000.00;
        boolean authenticated = false;
        int choice = -1; 

        // PIN Verification
        while (attempts < 3) {
            System.out.print("Enter your 4digit PIN: ");
            int enteredPin = scanner.nextInt();

            if (enteredPin == CORRECT_PIN) {
                authenticated = true;
                break;
            } else {
                System.out.println("Incorrect PIN.");
                attempts++;
            }
        }

        if (!authenticated) {
            System.out.println("Too many failed attempts. Exiting");
            scanner.close();
            return;
        }

        do {
            System.out.println("\n Welcome to MyATM!");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            if (!scanner.hasNextInt()) {
                System.out.println(" Invalid input. Please enter a number.");
                scanner.next(); // skip bad input
                continue;
            }

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf(" Your current balance is: M%.2f\n", balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: M");
                    double deposit = scanner.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.printf(" M%.2f deposited successfully.\n", deposit);
                    } else {
                        System.out.println(" Invalid deposit amount.");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: M");
                    double withdraw = scanner.nextDouble();
                    if (withdraw > 0) {
                        if (withdraw <= balance) {
                            balance -= withdraw;
                            System.out.printf(" M%.2f withdrawn successfully.\n", withdraw);
                            System.out.println(" Receipt: Please keep this slip for your records.");
                        } else {
                            System.out.println(" Insufficient balance.");
                        }
                    } else {
                        System.out.println(" Invalid withdrawal amount.");
                    }
                    break;

                case 4:
                    System.out.println(" Thank you for using ATM. bye!");
                    break;

                default:
                    System.out.println(" Invalid option. Please choose 1-4.");
                    break;
            }

        } while (choice != 4);

        scanner.close();
    }
}