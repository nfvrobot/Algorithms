package com.chernyavsky.algorithms.find;

import java.util.Arrays;

public class MinElement {

    public static int findMinElement(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
