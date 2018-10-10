package com.leetcode;

import java.util.SplittableRandom;

/**
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *Example 1:
 *  Input: haystack = "hello", needle = "ll"
 *  Output: 2
 *
 *  注意点： needle为空返回什么？
 *  needle长度大于输入字符串怎么办？
 *
 * @author wangkun@cetiti.com
 * @since 1.0
 */
public class T028ImplementstrStr {
    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issipi";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        if (haystack.length()==0 || needle.length()==0) return 0;
        if (haystack.length()<needle.length()) return -1;
        for (int i=0;;i++) {
            for (int j=0;;j++) {
                //j标识已经匹配的长度
                //i标识匹配的位置
              if (j == needle.length()) return i;
              //如果已经匹配到haystack最后一个，且，j不是needle长度，则匹配失败，返回-1
                // 和上一句的次序不能颠倒
              if(i+j == haystack.length()) return -1;
              //如果未匹配，则到haystack下一个字符
              if(needle.charAt(j)!=haystack.charAt(i+j)) break;
            }
        }

    }
}
