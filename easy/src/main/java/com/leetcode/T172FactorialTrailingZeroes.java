package com.leetcode;

/**
 * Given an integer n, return the number of trailing zeroes in n!.
 * 求阶乘后面有多少个0
 * @author
 * @since 1.0
 */
public class T172FactorialTrailingZeroes {
    public static void main(String[] args) {
        System.out.println(trailingZeroes(6));
    }

    public static int trailingZeroes(int n) {
        int count = 0;
        while (n / 5 != 0) {
            count += n / 5;
            n = n / 5;
        }
        return count;
    }
}
