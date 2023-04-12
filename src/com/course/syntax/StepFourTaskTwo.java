package com.course.syntax;

import java.util.Scanner;

public class StepFourTaskTwo {
    public static void main(String[] args) {
        System.out.print("Enter number ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int fact = 1;
        System.out.println ("You entered " + number);
        for (int i = 1; i <= number ; i++) {
            fact = fact * i;
        }
        System.out.println(fact);

    }
}
