package com.arunanshu.hashing;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoUnsortedArray {
    public static void main(String[] args) {
        int[] a={20,23,34,56,78,12};
        int[] b={23,12,11,55,34,78};
        intersectElement(a,b);
    }
    public static void intersectElement(int[] arr1,int[] arr2){
        Set<Integer> st=new HashSet<>();
        for(int x:arr1){
            st.add(x);
        }
        for (int x:arr2){
            if (st.contains(x))
                System.out.println(x);
        }
    }
}
