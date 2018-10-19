package com.leetcode;

/**
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 *  A -> 1
 *  AB -> 28
 * @author
 * @since 1.0
 */
public class T171ExcelSheetColumnNumber {
    public static void main(String[] args) {
        System.out.println(titleToNumber("ZY"));
    }

    public static int titleToNumber(String s) {
        char[] chars = s.toCharArray();
        int number = chars[0] - 'A' + 1;
        for (int i=1; i<chars.length;i++) {
            number = number * 26 + chars[i] - 'A' + 1;
        }
        return number;
    }
}
