package com.arunanshu.recurrsion;
//q10
public class Permutation {
    public static void main(String[] args) {
        permute("abcd",0);
    }
    public static void permute(String s,int i){
        if(i==s.length()-1)
            System.out.println(s);
        else {
            for (int j = i; j <= s.length() - 1; j++) {
                s = swap(s, i, j);
                permute(s, i + 1);
                s = swap(s, i, j);

            }
        }
    }
    public static String swap(String s,int i,int j){
        char temp;
        char[] charArray = s.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
