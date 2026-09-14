package Basics;

import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        System.out.println("*** STUDENT GRADE CALCULATOR ***");

        Scanner sc = new Scanner(System.in);

        // Input student name and its marks of 5 subjects.
        System.out.print("Enter the student's name: ");
        String stdName = sc.nextLine();

        int[] marks = new int[5];

        System.out.print("Enter the marks of all subjects: ");

        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }

        System.out.println("The result of " + stdName + " is:");

        // Performing the calculations
        int total = 0;

        for (int mark : marks)
            total += mark;

        double percentage = (total / 500.0) * 100;

        // Assigning the grade
        if (percentage >= 90)
            System.out.println("Grade: A");
        else if (percentage >= 80)
            System.out.println("Grade: B");
        else if (percentage >= 70)
            System.out.println("Grade: C");
        else if (percentage >= 60)
            System.out.println("Grade: D");
        else
            System.out.println("Grade: F");

        sc.close();

        System.out.println("*** PROGRAM ENDED ***");
    }
}