package com.course.syntax;

import java.util.Scanner;

public class StepSixTaskTwo {

    public static void main(String[] args) {
        System.out.print("Enter string sentence ");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String reversedString = new StringBuffer(s).reverse().toString();

        if (s.contains("java")) {
            System.out.println(reversedString);
        }
        else {
            String[] words = s.split(" ");
            for (int i = 0; i < words.length; i++) {
                if (i % 2 == 0){
                    System.out.print(words[i] + " ");
                }
                else {
                    System.out.print(words[i].toUpperCase() + " ");
                }
            }
        }
    }
}