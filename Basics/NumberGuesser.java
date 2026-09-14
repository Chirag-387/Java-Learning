package Basics;
import java.util.Scanner;
import java.util.Random;

public class NumberGuesser {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int count = 0;

        // Getting random number
        Random random = new Random();
        int randNum = random.nextInt(100) + 1;

        // Making game working
        boolean sameNum = false;

        while(!sameNum) {
            System.out.print("Guess a number: ");
            int num = sc.nextInt();
            if(num > randNum) System.out.println("Go lower");
            else if(num < randNum) System.out.println("Go higher");
            else {
                count++;
                System.out.println("You Won after " + count + " guesses.");
                sameNum = true;
            }
            if (!sameNum) {
                count++;
            }
        }

        sc.close();

    }
}
