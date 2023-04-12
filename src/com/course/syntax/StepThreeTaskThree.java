package com.course.syntax;
import java.util.Scanner;
public class StepThreeTaskThree {
    public static void main(String[] args) {
        System.out.print("Введите любое число ");
        Scanner scan = new Scanner(System.in);
        double number = scan.nextDouble();
        System.out.println ("Вы ввели число " + number);
        if (number % 2 == 0 && number > 10 || number == 15) {
            System.out.print("первое смс");
        }
        else {
            System.out.print("второе смс");
        }

    }
}
