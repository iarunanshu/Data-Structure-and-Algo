package com.arunanshu.recurrsion;
//q5
public class RopeCuttingProblem {
    public static void main(String[] args) {
        System.out.println(maxpieces(23,12,9,11));
    }
    public static int maxpieces(int x,int a,int b,int c){
        if(x==0)
            return 0;
        if(x<0)
            return -1;
        int res=Math.max(maxpieces(x-a,a,b,c),Math.max(maxpieces(x-b,a,b,c),maxpieces(x-c,a,b,c)));
        if(res==-1)
            return -1;
        return res+1;
    }
}
