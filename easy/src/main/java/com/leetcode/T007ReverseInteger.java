package com.leetcode;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * Note: Assume we are dealing with an environment which could only store integers within the 32-bit signed integer
 * range: [−2^31,  2^31 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed
 * integer overflows.
 *
 * @author wangkun@cetiti.com
 *
 */
public class T007ReverseInteger {
    public static void main(String[] args) {
        System.out.print(reverse(123));
    }

    private static int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            //判断溢出
            if (result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE/10 && pop > 7 )) return 0;
            if (result < Integer.MIN_VALUE/10 || (result == Integer.MIN_VALUE/10 && pop < -8)) return 0;
            result = result * 10 + pop;
        }
        return result;
    }
}
