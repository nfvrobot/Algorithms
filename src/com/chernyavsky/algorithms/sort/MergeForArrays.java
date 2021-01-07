package com.chernyavsky.algorithms.sort;

public class MergeForArrays {

    public static int[] mergeForTwoArrays(int[] arrayOne, int[] arrayTwo) {
        int[] resultArray = new int[arrayOne.length + arrayTwo.length];
        int arrayOneLength = 0;
        int arrayTwoLength = 0;
        while (arrayOneLength + arrayTwoLength < resultArray.length) {
            if (arrayOneLength == arrayOne.length) {
                resultArray[arrayOneLength + arrayTwoLength] = arrayTwo[arrayTwoLength++];
            } else if (arrayTwoLength == arrayTwo.length) {
                resultArray[arrayOneLength + arrayTwoLength] = arrayOne[arrayOneLength++];
            } else if (arrayOne[arrayOneLength] < arrayTwo[arrayTwoLength]) {
                resultArray[arrayOneLength + arrayTwoLength] = arrayOne[arrayOneLength++];
            } else {
                resultArray[arrayOneLength + arrayTwoLength] = arrayTwo[arrayTwoLength++];
            }
        }
        return resultArray;
    }
}
