package com.course.syntax;

public class StepSecondTaskSecond {

    public static void main(String[] args) {
        int n = 3;
        int a = 2 * n++;
        int b = 2 * n--;
        int c = 2 * --n;
        int d = 2 * ++n;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}