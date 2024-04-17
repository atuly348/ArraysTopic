package com.demo;

import java.util.Arrays;

public class Min {
    public static void main(String[] args) {


        int ar[] = {15, 45, 67, 78, 90, 98,1};
        System.out.println(min(ar));

        System.out.println(Arrays.toString(ar));
    }
    static int min(int[] arr){
        int min=arr[0];
        for (int a:arr){

            if(min>a)
            {
                min=a;
            }
        }
return  min ;
    }
}
