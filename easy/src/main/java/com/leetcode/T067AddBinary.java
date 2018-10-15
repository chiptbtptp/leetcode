package com.leetcode;

/**
 * @author
 * @since 1.0
 */
public class T067AddBinary {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a,b));
    }

    //思想：有时候用倒序的append然后reverse比正序更方便快捷
    private static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry!=0) sb.append(carry);
        return sb.reverse().toString();
    }
}
