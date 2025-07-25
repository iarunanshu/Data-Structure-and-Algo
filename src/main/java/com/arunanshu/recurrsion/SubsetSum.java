package com.arunanshu.recurrsion;

import java.util.Arrays;

//q9
public class SubsetSum {
    public static void main(String[] args) {
        int[] arr={10,15,20};
        System.out.println(subset(arr,3,25));
    }
    public static int subset(int[] arr,int n,int sum){
        if(n==0){
            return (sum==0?1:0);
        }
        return subset(arr,n-1,sum)+subset(arr,n-1,sum-arr[n-1]);
    }
}
