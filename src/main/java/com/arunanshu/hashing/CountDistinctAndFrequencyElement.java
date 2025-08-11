package com.arunanshu.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountDistinctAndFrequencyElement {
    public static void main(String[] args) {
        int[] arr={20,30,20,12,34,12,30,11,56};
        System.out.println(countDistinct(arr));
        frequency(arr);

    }
    public static int countDistinct(int arr[]){
        Set<Integer>st=new HashSet<>();
        for(int x: arr){
            st.add(x);
        }
        return st.size();
    }
    public static void frequency(int[] arr){
        Map<Integer,Integer> mp=new HashMap<>();
        for (int x:arr){
            if (mp.containsKey(x))
                mp.put(x,mp.get(x)+1);
            else mp.put(x,1);
        }
        for (Map.Entry<Integer,Integer>itr: mp.entrySet())
            System.out.println(itr.getKey()+" "+itr.getValue());
    }
}
