package Basics;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean conti = true;

        while (conti) {

            // Input from user
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            // Operation to perform
            System.out.print("Which operation to perform (+, -, *, /): ");
            char operation = sc.next().charAt(0);

            // Performing the operation
            if (operation == '+')
                System.out.printf("%d + %d = %d%n", num1, num2, num1 + num2);

            else if (operation == '-')
                System.out.printf("%d - %d = %d%n", num1, num2, num1 - num2);

            else if (operation == '*')
                System.out.printf("%d x %d = %d%n", num1, num2, num1 * num2);

            else if (operation == '/') {
                if (num2 == 0)
                    System.out.println("The second number for division cannot be zero.");
                else
                    System.out.printf("%d / %d = %d%n", num1, num2, num1 / num2);
            }

            else
                System.out.println("Invalid operation.");

            // Ask for continue
            System.out.print("Do you want to continue (Y/N): ");
            char cResult = sc.next().charAt(0);

            if (cResult == 'N' || cResult == 'n')
                conti = false;
            else if(cResult != 'Y' || cResult != 'y') System.out.println("Invalid command"); conti = false;
        }

        sc.close();

        System.out.println("Calculator closed.");
    }
}