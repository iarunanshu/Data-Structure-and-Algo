package com.arunanshu.recurrsion;
//q3
public class PalindromeCheck {
    public static void main(String[] args) {
        String s="abcbad";
        System.out.println(palindrome(s,0,s.length()-1));
    }
    public static boolean palindrome(String s,int start,int end){
        if(start>end)
            return true;
        boolean pal=s.charAt(start)==s.charAt(end);
        return pal&&palindrome(s,start+1,end-1);
    }
}
