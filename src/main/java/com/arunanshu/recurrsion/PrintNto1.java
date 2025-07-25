package com.arunanshu.recurrsion;
//q1
public class PrintNto1 {
    public static void main(String[] args) {
        printingNto1(20);
        printing1toN(10);
    }
    public static void printingNto1(int n){
        if(n==0)
            return;
        System.out.println(n);
        printingNto1(n-1);
    }
    public static void printing1toN(int n){
        if (n==0)
            return;
        printing1toN(n-1);
        System.out.println(n);
    }
}
