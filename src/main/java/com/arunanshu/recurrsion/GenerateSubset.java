package com.arunanshu.recurrsion;
//q6
public class GenerateSubset {
    public static void main(String[] args) {
        generate("abc"," ",0);
    }
    public static void generate(String s,String curr,int i){
        if(i==s.length()){
            System.out.println(curr+" ");
            return;
        }
        generate(s,curr,i+1);
        generate(s,curr+s.charAt(i),i+1);
    }
}
