package com.arunanshu.hashing;

import java.util.HashSet;
import java.util.Set;

public class PairWithGivenSum {
    public static void main(String[] args) {
        int[] arr={10,20,12,45,23,56,78,34,21};
        pairs(arr,66);
    }
    public static void pairs(int[] arr,int key){
        Set<Integer> st=new HashSet<>();
        for (int x:arr){
            if (st.contains(key-x))
                System.out.println(x+" "+(key-x));
            else st.add(x);
        }
    }
}
