package com.course.syntax;

public class StepFiveTaskOne {
    // calculate average value of given array with numbers and print this value to the console.
    // Program must calculate average value for array with any number of elements
    public static void main(String[] args) {
        int [] array = {2,1,35,2};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Average value is " + (sum / array.length));
    }
}
