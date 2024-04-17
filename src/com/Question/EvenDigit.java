package com.Question;

public class EvenDigit {
    public static void main(String[] args) {
int arr[]={1234,45,678,89,910};
FindNumber(arr);
        System.out.println(FindNumber(arr));
    }

    static int FindNumber(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }

        return count;

    }

    static boolean even(int num) {
        int numOfDigit = digit(num);
        return numOfDigit %2==0;
    }

    private static int digit(int num) {
        int count = 0;
        while (num > 0) {

            count++;
            num = num / 10;
        }
        return count;
    }

}
