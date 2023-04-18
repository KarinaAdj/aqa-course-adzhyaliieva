package com.course.syntax;

import java.util.Scanner;

public class StepSixTaskOne {
    //  for given string sentence from the console delete all spaces and bring it to uppercase,
    //  after print result word by letters in column to the console.

    public static void main(String[] args) {
        System.out.print("Enter string sentence ");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        char[] result = s.replaceAll(" ", "").toUpperCase().toCharArray();
        for (int i = 0; i < result.length; i++)
            System.out.println(result[i]);
    }
}