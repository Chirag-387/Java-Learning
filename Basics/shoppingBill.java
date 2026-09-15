package Basics;
import java.util.Scanner;

public class shoppingBill {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("<--- SHOPPING BILL GENERATOR --->");

        // Number of items and storing the amount
        System.out.print("Enter the number of items: ");
        int numOfItems = sc.nextInt();

        double[] list = new double[numOfItems];

        for(int i = 0; i < numOfItems; i++) {
            System.out.printf("<--- Enter Item %d --->\n", i + 1);

            System.out.print("Name of the item: ");
            sc.next();
            sc.nextLine();

            System.out.print("Enter the quantity of the item: ");
            int quantity = sc.nextInt();

            System.out.print("Enter the price of item: ");
            double price = sc.nextDouble();

            list[i] = price * quantity;
        }

        // Total bill and discount
        double sumOfValue = 0;

        for(double value: list) sumOfValue += value;

        if(sumOfValue >= 2000) {
            sumOfValue -= 0.1 * sumOfValue;
            System.out.println("Total Bill: " + sumOfValue);
        }

        else System.out.println("Total Bill: " + sumOfValue);

        System.out.println("<--- PROGRAM ENDED --->");

        sc.close();

    }
}
