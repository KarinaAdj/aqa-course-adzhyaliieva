package com.course.syntax;
import java.util.Scanner;
public class StepThreeTaskOne {
    public static void main(String[] args) {
        System.out.print("Введите число ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println ("Вы ввели число " + number);

        if (number == 0) {
            System.out.println("равно 0");
        }
        else if (number < 10) {
            System.out.println("меньше 10");
        }
        else if (number > 10) {
            System.out.println("больше 10");
        }

    }
}
