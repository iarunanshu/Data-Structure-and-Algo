package com.arunanshu.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={20,30,2,12,7,3};
        ss(arr);
        for (int x: arr){
            System.out.println(x);
        }
    }
    public static void ss(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min_idx=i;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[j]<arr[min_idx])
                    min_idx=j;
            }
            swap(arr,i,min_idx);
        }

    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
