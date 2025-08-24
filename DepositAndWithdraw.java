/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package depositandwithdraw;

/**
 *
 * @author User
 */
class BankAccount {
    String owner;
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + "Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + "Balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

public class DepositAndWithdraw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BankAccount acc = new BankAccount();
        acc.owner = "Neo";
        acc.balance = 8000;

        acc.deposit(500);
        acc.withdraw(600);
        acc.withdraw(1500);
    }
    
}
