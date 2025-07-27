package com.arunanshu.dynamicprogramming;

import java.util.Arrays;
//q1
public class FibonacciUsingDp {
    public static void main(String[] args) {
        int[] arr=new int[10];
        Arrays.fill(arr,-1);
        System.out.println(fibanacci(arr,7));
    }
    public static int fibanacci(int[] dp,int n ){
        if (dp[n]==-1){
            int res;
            if(n==1 || n==0){
                return n;
            }
            else res=fibanacci(dp,n-1)+fibanacci(dp,n-2);
            dp[n]=res;
        }
        return dp[n];
    }
}
