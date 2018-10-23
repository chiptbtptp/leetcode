package com.leetcode;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.Map;

/**
 * 判断两个字符串是否同形
 *
 * @author
 * @since 1.0
 */
public class T205IsomorphicStrings {

    public static void main(String[] args) {
        String s = "ab";
        String t = "aa";
        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s,String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map1.put(s.charAt(i), t.charAt(i));
            map2.put(t.charAt(i), s.charAt(i));
        }
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i=0;i< s.length();i++) {
            sb1.append(map1.get(s.charAt(i)).toString());
            sb2.append(map2.get(t.charAt(i)).toString());
        }
        return sb1.toString().equals(t)&& sb2.toString().equals(s);
    }
}
