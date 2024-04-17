package com.algo;

public class Searchin2d {
    public static void main(String[] args) {
        int ar[][] = {{15, 45}, {67, 78}, {90, 98,1}};
       int ans= lSreach(ar,66);
        System.out.println(ans);
    }
    static int lSreach(int[][]arr,int key){
        for (int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr[i].length;j++)
            {
                if(key==arr[i][j]){
                    return 1;
                }
            }
        }
        return -1;
    }
}
