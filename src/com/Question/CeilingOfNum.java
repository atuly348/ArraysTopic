package com.Questiom;

public class CeilingOfNum {
    public static void main(String[] args) {
        int ar[] = {10,12,15,19,23,29,38,39,49,78,87,98};
        int key = 22 ;
        int res = binarySearch(ar, key);
        System.out.println(res);
    }

    static int binarySearch(int[] ar, int key) {
        int Start = 0;
        int End = ar.length - 1;
        boolean isAcesOrDecs = ar[Start] < ar[End];
        int mid = -1;
        int s=-1;
        int v=-1;
        if (isAcesOrDecs) {
            while (Start <= End) {
                mid = Start + (End - Start / 2);
                if (key == ar[mid]) {
                    return mid;
                } else if (key < ar[mid]) {
                    End = mid - 1;
                    v=End;
                } else if (key > ar[mid]) {
                    Start = mid + 1;
                    s=Start;
                }else {
                    return ar[Start];
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
        return ar[s];
    }
}
