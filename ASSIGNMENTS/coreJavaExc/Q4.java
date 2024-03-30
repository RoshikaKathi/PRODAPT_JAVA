package coreJavaExc;

import java.util.Arrays;

class MyIntArrayUtil {
    // Static method to sort an array of integers in increasing order
    public static void sortIncreasing(int[] arr) {
        Arrays.sort(arr);
    }
}

public class Q4 {
    public static void main(String[] args) {
        // Creating an array of ten int values (randomly chosen from 1 to 100)
        int[] myArr = new int[10];
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = (int) (Math.random() * 100) + 1;
        }

        // To show the elements of the array on screen
        System.out.println("Original array:");
        for (int num : myArr) {
            System.out.print(num + " ");
        }
        System.out.println(); // Newline for clarity

        // Sorting the elements of the array increasingly
        MyIntArrayUtil.sortIncreasing(myArr);

        // Showing the sorted elements of the array on screen
        System.out.println("Sorted array (increasing order):");
        for (int num : myArr) {
            System.out.print(num + " ");
        }
    }
}