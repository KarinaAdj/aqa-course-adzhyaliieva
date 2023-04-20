package com.course.syntax;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StepFiveTaskFour {

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(5, 3, 7, 1));

        Collections.sort(array);
        System.out.println(array);
    }
}