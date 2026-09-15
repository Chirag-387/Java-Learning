package Basics;
import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("<--- QUIZ GAME --->");

        // Arrays of questions, options and answers

        String[] questions = {
            "What does '%' operator returns?",
            "What is the full form of JVM?",
            "What does 5 % 3 returns?",
            "Is 'String' a primitive datatype?",
            "How to access '0th' index of a String?"
        };

        String[] options = {
            "A. Sum  B. Difference  C. Product  D. Remainder",
            "A. Java Virtual Meeting  B. Java Virtual Machine  C. Java Virtual Mechanics  D. None",
            "A. 2  B. 1  C. 0  D. -1",
            "A. Yes  B. No  C. Both A and B  D. None",
            "A. .atChar(1)  B. .atChar(0)  C. charAt(0) D. charAt(1)"
        };

        String[] answers = {
            "D",
            "B",
            "A",
            "B",
            "C"
        };

        // Representing the questions and counting the correct count
        int correct_count = 0;

        for(int i = 0; i < 5; i++) {
            System.out.println(questions[i]);
            System.out.println(options[i]);
            System.out.print("Enter your answer(A, B, C, D): ");
            String ans = sc.next();
            
            ans = ans.toUpperCase();

            if(ans.equals(answers[i])) correct_count++;

        }

        System.out.printf("Total score: %d/5\n", correct_count);

        System.out.println("<--- PROGRAM ENDED --->");

        sc.close();

    }
}
