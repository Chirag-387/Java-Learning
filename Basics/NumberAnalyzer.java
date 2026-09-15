package Basics;
import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("<-- NUMBER ANALYZER -->");

        // Take user and store it
        System.out.print("Enter the number of values: ");
        int count = sc.nextInt();

        int[] values = new int[count];

        System.out.print("Enter the values: ");
        for(int i = 0; i < count; i++) {
            values[i] = sc.nextInt();
        }

        int pos = 0;
        int neg = 0;
        int odd = 0;
        int even = 0;
        int zero = 0;

        for(double value: values) {
            if(value % 2 == 0) even++;
            if(value % 2 != 0) odd++;
            if(value > 0) pos++;
            if(value < 0) neg++;
            if(value == 0) zero++;
        }

        System.out.println("Total positive number: " + pos);
        System.out.println("Total negative number: " + neg);
        System.out.println("Total zero: " + zero);
        System.out.println("Total even nummbers: " + even);
        System.out.println("Total odd numbers: " + odd);

        System.out.println("<--- PROGRAM ENDED --->");

        sc.close();

    }
}
