package com.epam.task.decomposition;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createNumbersArray(1232155)));
    }

    public static int[] createNumbersArray(int n) {
        int[] numbersArray = new int[findLengthOfNumber(n)];
        while (n > 0) {
            for (int i = numbersArray.length - 1; i >= 0; i--) {
                int l = n % 10;
                n /= 10;
                numbersArray[i] = l;
            }
        }
        return filtArray(numbersArray);
    }

    public static int[] filtArray(int[] array) {
        int lengthOfRepeatingElements = array.length;
        for (int i = 0; i < lengthOfRepeatingElements; i++) {
            for (int j = i + 1; j < lengthOfRepeatingElements; j++) {
                if (array[i] == array[j]) {
                    array[j] = array[lengthOfRepeatingElements - 1];
                    lengthOfRepeatingElements--;
                    j--;
                }
            }
        }
        return Arrays.copyOf(array, lengthOfRepeatingElements);
    }

    public static int findLengthOfNumber(int n) {
        int length = 0;
        long temp = 1;
        while (temp <= n) {
            length++;
            temp *= 10;
        }
        return length;
    }
}
