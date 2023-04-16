package com.course.syntax;
import java.util.Scanner;

public class StepFourTaskFour {

    public static void main(String[] args) {
        while (true) {
            System.out.print("Enter your age ");
            Scanner scan = new Scanner(System.in);
            int age = scan.nextInt();
            if (age <= 0 || age > 140) {
                System.out.println("error");
            }
            else {
                System.out.println("great");
                break;
            }
        }
    }
}
