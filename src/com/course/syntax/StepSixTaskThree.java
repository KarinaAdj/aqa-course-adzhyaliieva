package com.course.syntax;

import java.util.Scanner;

public class StepSixTaskThree {
    public static void main(String[] args) {
        System.out.print("Enter your sentence ");
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        System.out.print("Enter your symbol ");
        Scanner scan2 = new Scanner(System.in);
        String symbol = scan2.nextLine();
        int count = 0;

        if (sentence.contains(symbol)) {
            char[] charArray = sentence.toCharArray();
            char x = symbol.charAt(0);
            for (int i = 0; i < charArray.length; i++) {
                if (charArray[i] == x) {
                    count++;
                }
            }
            System.out.println("Your sentence contains " + count + " " + "'" + symbol  + "'");
        } else {
            System.out.println("Sorry, but your sentence doesn't contain this letter ");
        }
    }
}