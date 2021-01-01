package com.chernyavsky.algorithms.find;

public class BinarySearch {

    public static int binarySearchAlgorithm(int[] array, int element) {
        int firstIndex = 0;
        int lastIndex = array.length - 1;
        int indexOfElement = 0;

        while (firstIndex <= lastIndex) {
            int midIndex = (firstIndex + lastIndex) / 2;
            int guess = array[midIndex];
            if (guess == element) {
                indexOfElement = midIndex;
            }
            if (guess > element) {
                lastIndex = midIndex - 1;
            } else {
                firstIndex = midIndex + 1;
            }
        }
        return indexOfElement;
    }
}
