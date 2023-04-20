package com.course.syntax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StepFiveTaskThree {

    public static void main(String[] args) {
        maxValue();
        ArrayListMethod();
    }

    public static void maxValue() {
        int[] array = {4, 3, 35, 1, 66, 5};
        int maxValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        System.out.println("The biggest number is: " + maxValue);
    }


    // other method
    public static void ArrayListMethod() {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3));
        Integer maxValue = Collections.max(array);

        System.out.println("The biggest number is: " + maxValue);
    }
}