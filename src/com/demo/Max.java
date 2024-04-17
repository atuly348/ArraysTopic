package com.demo;

import java.util.Arrays;

public class Max {
    public static void main(String[] args) {


        int ar[] = {1, 45, 67, 78, 90,98};
        System.out.println(Arrays.toString(ar));
        System.out.println(max(ar));
        System.out.println(Arrays.toString(ar));


    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}