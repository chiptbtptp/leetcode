package com.leetcode;

/**
 * 将一个数的二进制位反转，输出翻转后的十进制表示。
 * @author
 * @since 1.0
 */
public class T190ReverseBits {
    public static void main(String[] args) {
        System.out.println(reverseBits(11));
    }

    //关于二进制的问题，使用 &1 最快，也最好
    public static int reverseBits(int n) {
        int res = 0;
        for (int i=0;i<32;i++) {
            res += (res << 1) + (n & 1);
            n >>>= 1;
        }
        return res;
    }
}
