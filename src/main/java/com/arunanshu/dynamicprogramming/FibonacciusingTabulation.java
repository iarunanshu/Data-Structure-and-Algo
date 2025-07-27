package com.arunanshu.dynamicprogramming;

import java.util.Scanner;

public class FibonacciusingTabulation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int[] dp=new int[x+1];
        dp[0]=0;
        dp[1]=1;
        for (int i=2;i<=x;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        System.out.println(dp[x]);
    }
}
