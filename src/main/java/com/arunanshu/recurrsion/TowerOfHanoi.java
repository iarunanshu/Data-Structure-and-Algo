package com.arunanshu.recurrsion;
//q7
public class TowerOfHanoi {
    public static void main(String[] args) {
        toh(3,'A','B','C');
    }
    public static void toh(int n,char A,char B,char C){
        if(n==1){
            System.out.println("move 1 from"+ A +"to"+ C);
            return;
        }
        toh(n-1,A,C,B);
        System.out.println("move n from"+A+"to"+C);
        toh(n-1,B,A,C);
    }
}
