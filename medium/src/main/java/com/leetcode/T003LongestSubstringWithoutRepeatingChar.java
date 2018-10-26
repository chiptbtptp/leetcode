package com.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 学习使用滑动窗口
 *
 * 给定一个字符串，找出最长的连续的没有重复字符的子字符串
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 *
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 * @author
 * @since 1.0
 */
public class T003LongestSubstringWithoutRepeatingChar {


    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring1(s));
    }

    //我的答案，类似于滑动窗口，但是不够优化，时间复杂度太高O（n^2）
    public static int lengthOfLongestSubstring(String s) {
        if (s.length()==1) return 1;
        int i=0;
        int length = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();
        for (; i < s.length(); i++) {
            if (set.add(s.charAt(i))) {
                length++;
            }else {
                max = (length > max) ? length : max;
                set.clear();
                i = i - length;
                length = 0;

            }
        }
        return max > length ? max : length;
    }

    //官方答案，滑动窗口
    public static int lengthOfLongestSubstring1(String s) {
        int n = s.length();
        int i = 0, j = 0, ans = 0;
        Set<Character> set = new HashSet<>();
        while (i < n && j < n) {
            if (set.add(s.charAt(j++))) {
                ans = Math.max(ans, j - i);
            } else {
                j--;
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
    //优化，使用hashmap存储字符的索引，每次i=j`+1,而不是i++,更快
}
