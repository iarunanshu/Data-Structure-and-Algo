package com.arunanshu.dynamicprogramming;
/*
Given an array of different coin types (with an infinite supply of each coin type) and a target sum, how many different ways can you pick coins to achieve the given sum?

 */
public class CoinchangeNaive {
    public static void main(String[] args) {
        int coins[]={2,5,3};
        int sum=5;
        System.out.println(countways(coins,coins.length,sum));
    }
    public static int countways(int[] coins,int n,int sum){
        if(sum==0)
            return 1;
        if (sum<0)
            return 0;
        if(n==0)
            return 0;
        return countways(coins,n,sum-coins[n-1])+countways(coins,n-1,sum);
    }
}
