package com.chernyavsky.algorithms.sort;

public class SelectionSortAlgorithm {

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int leftIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    leftIndex = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[leftIndex] = temp;
        }
    }
}
