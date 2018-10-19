package com.leetcode;

/**
 * 给定一个数，求出在excel 列中，该数对应的列名
 *
 * @author
 * @since 1.0
 */
public class T168ExcelSheetColumnTitle {
    public static void main(String[] args) {
        System.out.println(convertToTitle(701));
    }

    public static String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (--n / 26 != 0) {
            int i1 = n % 26;
            char c1 = (char) (i1 + 'A');
            sb.append(c1);
            n /= 26;
        }
        sb.append((char) (n % 26 + 'A'));
        return sb.reverse().toString();
    }
}
