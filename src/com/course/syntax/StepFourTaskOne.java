package com.course.syntax;
import java.util.Scanner;
public class StepFourTaskOne {
    public static void main(String[] args) {
        System.out.print("Enter number ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println ("You entered " + number);

        if (number < 0) {
            System.out.println("error");
        }
        else {
            for (int i = 0; i <= number; i++) {
                if (i % 2 == 0 && i > 0) {
                    System.out.println("The number '" + i + "' is even");
                }
                else if (i % 3 == 0 && i > 0) {
                    System.out.println("The number '" + i + "' multiple to 3");
                }
                else {
                    System.out.println("The number '" + i + "'");
                }
            }
        }
    }
}
