package com.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 判断一个字符串是否是另一个字符串的字母重组
 * 考虑非字母字符
 * @author
 * @since 1.0
 */
public class T242ValidAnagram {
    public static void main(String[] args) {
        String s = "rat";
        String t = "cat";
        System.out.println(isAnagrame(s,t));
    }

    public static boolean isAnagrame(String s, String t) {
        if (s.length()!=t.length()) return false;
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chart);
        for (int i=0; i<chars.length;i++) {
            if (chars[i] != chart[i]) {
                return false;
            }
        }
        return true;
    }
}
