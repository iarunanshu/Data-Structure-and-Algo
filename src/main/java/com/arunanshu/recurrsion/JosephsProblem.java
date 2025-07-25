package com.arunanshu.recurrsion;
//q8
public class JosephsProblem {
    public static void main(String[] args) {
        System.out.println(jos(6,3)+1);
    }
    public static int jos(int n,int k){
        if(n==1)
            return 0;

        return (jos(n-1,k)+k)%n;
    }
}

