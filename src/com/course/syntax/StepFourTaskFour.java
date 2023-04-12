package com.course.syntax;
import java.util.Scanner;
public class StepFourTaskFour {
    public static void main(String[] args) {
        int age = -1;

        do {
            System.out.print("Enter your age ");
            Scanner scan = new Scanner(System.in);
            age = scan.nextInt();
            if (age <= 0 || age > 140) {
                System.out.println ("error");
            }
        }
        while (age <= 0 || age > 140);

        System.out.println ("great");






    }
}
