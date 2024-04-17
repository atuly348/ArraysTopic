package com.demo;

import java.util.Arrays;

public class swap {
    public static void main(String[] args) {


        int ar[] = {1, 45, 67, 78, 90};
        System.out.println(Arrays.toString(ar));
        Swap(ar,0, 2);
        System.out.println(Arrays.toString(ar));


    }
   static public void Swap(int[] arr,int i,int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
}