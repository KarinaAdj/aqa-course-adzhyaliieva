package com.course.syntax;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StepFiveTaskTwo {
    //  merge 2 given arrays. Result must be an array, that contains all elements from first and second arrays.
    //  Value must be calculated for arrays with any length.

    public static void main(String[] args) {
        methodFirst();
        methodSecond();
    }

    public static void methodFirst() {
        int[] array1 = {42, 11, 35};
        int[] array2 = {5, 15};
        int[] array3 = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = array1.length, j = 0; i < array3.length; i++, j++) {
            array3[i] = array2[j];
        }
        System.out.println("result: " + Arrays.toString(array3));
    }

    // other method
    public static void methodSecond() {
        ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(4, 5, 6, 7));

        array1.addAll(array2);

        System.out.println("result: " + array1);
    }
}