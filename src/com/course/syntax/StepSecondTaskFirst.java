package com.course.syntax;

public class StepSecondTaskFirst {
    public static void main(String[] args) {
        int firstSide = 6;
        int secondSide = 8;
        int thirdSide = 5;
        float p = (firstSide + secondSide + thirdSide)/2f;
        float s = p*((p-firstSide)*(p-secondSide)*(p-thirdSide));
        System.out.println(Math.sqrt(s));
    }
}

