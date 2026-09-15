package Basics;
import java.util.Scanner;

public class ATM_simulaor {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // ATM menu
        System.out.println("<--- ATM MENU --->");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");

        // Initial Balance is default to 10,000
        long balance = 10000;

        // Working

        boolean running = true;

        while(running) {

            System.out.print("Choose a option(1, 2, 3, 4): ");
            int option = sc.nextInt();

            if(option == 1) System.out.println("Current Balance: " + balance);
            else if(option == 2) {
                System.out.print("Enter the amount to deposit: ");
                long amount = sc.nextLong();
                balance += amount;
            }
            else if(option == 3) {
                System.out.print("Enter the amount to withdraw: ");
                long amount = sc.nextLong();
                balance -= amount;
            }
            else if(option == 4) {
                running = false;
            }
            else {
                System.out.println("Invalid option");
            }

        }

        System.out.println("<--- PROGRAM ENDED --->");

        sc.close();

    }
}
