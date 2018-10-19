package com.leetcode;

/**
 * 输出一个数的二进制表示中有多少个1
 * @author
 * @since 1.0
 */
public class T191Numberof1Bits {
    public static void main(String[] args) {
        System.out.println(hammingWeight(2));
    }
    public static int hammingWeight(int n) {
        int count=0;
        int cur = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & cur) == 1) {
                count++;
            }
            n >>>= 1;
        }
        return count;
    }
}
