package com.arunanshu.hashing;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithZeroSum {
    public static void main(String[] args) {
        int[] arr={10,20,12,-12,56,34,-20};
        System.out.println(zeroSum(arr));
    }
    public static Boolean zeroSum(int arr[]){
        Set<Integer>st=new HashSet<>();
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if(st.contains(sum)||sum==0)
                return true;
            st.add(sum);
        }
        return false;
    }

}
