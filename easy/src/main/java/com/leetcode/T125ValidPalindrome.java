package com.leetcode;

/**
 * 判断给定的词，字符串是否是回文，只考虑字母和数字，不考虑其他符号。
 * @author
 * @since 1.0
 */
public class T125ValidPalindrome {
    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        if (s==null || s.length()==0) return false;
        String pureStr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(pureStr);
        char[] seq = pureStr.toCharArray();
        for (int i=0;i<seq.length/2;i++) {
            if (seq[i] != seq[seq.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
