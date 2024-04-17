package com.algo;

public class LinearS {
    public static void main(String[] args) {
       int arr[]={23,45,67,8,5,8}  ;
int ans =linearSearch(arr,8);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr, int key){
        if(arr.length==0){
            return-1;
        }
        for  (int i=0 ;i<arr.length;i++)
        {
            int element=arr[i];
            if(element==key){
                return i;
            }
        }
        return -1;
    }
}
