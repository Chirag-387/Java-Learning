package Basics;
import java.util.Scanner;

public class NumberStatics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("<--- NUMBER STATICS --->");

        // storing data values
        System.out.print("Enter the count of data value: ");
        int count = sc.nextInt();

        double[] values = new double[count];
        
        System.out.print("Enter the data values: ");
        for (int i = 0; i < count; i++) {
            values[i] = sc.nextDouble();
        }

        // Peforming calculations
        double total = 0;
        double smallest  = Integer.MAX_VALUE;
        double largest = Integer.MIN_VALUE;

        for(double value: values) {
            if(value > largest) largest = value;
            else if(value < smallest) smallest = value;
            total += value;
        }

        System.out.println("Sum: " + total);
        System.out.println("Average: " + total / count);
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
        

        System.out.println("<--- PROGRAM ENDED --->");

        sc.close();

    }
}
