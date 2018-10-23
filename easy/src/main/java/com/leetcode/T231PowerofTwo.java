package com.leetcode;

/**
 * 判断一个数是否是2的幂
 * @author
 * @since 1.0
 */
public class T231PowerofTwo {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(isPowerOfTwo(n));
    }
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 2 == 0) {
            n = n >> 1;
        }

        return n == 1;
    }
}
