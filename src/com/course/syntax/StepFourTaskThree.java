package com.course.syntax;
import java.util.Scanner;
public class StepFourTaskThree {

    public static void main(String[] args) {
        System.out.print("Enter number ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println ("You entered " + number);
        int maxValue = -1;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                maxValue = i;
            }
        }
        if (maxValue == -1) {
            System.out.println("divisor not found");
        }
        else {
            System.out.println("The largest integer divisor is " + maxValue);
        }
    }
}