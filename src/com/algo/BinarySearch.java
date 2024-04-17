package com.algo;

public class BinarySearch {
    public static void main(String[] args) {
        int ar[] = {100, 78, 67, 56, 45, 34, 23, 12};
        int key = 45;
        int res = binarySearch(ar, key);
        System.out.println(res);
    }

    static int binarySearch(int[] ar, int key) {
        int Start = 0;
        int End = ar.length - 1;
        boolean isAcesOrDecs = ar[Start] < ar[End];
        int mid = -1;
        if (isAcesOrDecs) {
            while (Start <= End) {
                mid = Start + (End - Start / 2);
                if (key == ar[mid]) {
                    return mid;
                } else if (key < ar[mid]) {
                    End = mid - 1;
                } else {
                    Start = mid + 1;
                }
            }
            //end while

        } else {
            while (Start <= End) {
                mid = Start + (End - Start / 2);
                if (key == ar[mid]) {
                    return mid;
                } else if (key > ar[mid]) {
                    End = mid - 1;
                } else {
                    Start = mid + 1;
                }
            }
        }
        return -1;
    }
}
