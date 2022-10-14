package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 4, 5, 6, 7, 8};
        bubblesort(arr);
        System.out.println(arrToString(arr));
        System.out.println(searchBinary(arr, 6));
    }

    private static void bubblesort(int[] arr) {
    }

    private static String arrToString(int[] arr) {
        return "";
    }

    public static int searchBinary(int[] arr, int x) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        int middleIndex;

        while (startIndex <= endIndex) {
            middleIndex = startIndex + (endIndex - startIndex) / 2;
            System.out.println("startIndex:" + startIndex + ", endIndex:" + endIndex + ", middleIndex:" + middleIndex);

            if (arr[middleIndex] == x) {
                System.out.println("found" + " " + x + " " + "at" + middleIndex);
                return middleIndex;
            }
            if (arr[middleIndex] > x) {
                endIndex = middleIndex - 1;
            } else {
                startIndex = middleIndex + 1;
            }
        }
        return -1;
    }
}















