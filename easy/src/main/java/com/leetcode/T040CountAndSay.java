package com.leetcode;

/**
 *
 * @author
 * @since 1.0
 */
public class T040CountAndSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(8));
    }

    //非递归算法
    public static String countAndSay(int n){
        StringBuilder say = new StringBuilder("1");
        if (n==1) return say.toString();
        for (int i=1;i<n;i++) {
            int count = 1;
            StringBuilder temp = new StringBuilder();
            for (int j=0;j< say.length();j++) {
                if (j + 1 < say.length() && say.charAt(j) != say.charAt(j + 1)) {
                    temp = temp.append(count).append(say.charAt(j));
                    count=1;
                } else if (j + 1 < say.length() && say.charAt(j) == say.charAt(j + 1)) {
                    count++;
                } else {
                    if (j + 1 == say.length()) {
                        temp = temp.append(count).append(say.charAt(j));
                        count = 1;
                    }
                }
            }
            say = temp;
        }
        return say.toString();
    }

    //递归算法
    public String countAndSay1(int n) {
        if (n == 1) {
            return "1";
        }

        String s = countAndSay1(n - 1);
        StringBuilder sb = new StringBuilder();

        int len = s.length();
        int cnt = 0;
        for (int i = 0; i < len; i++) {
            cnt++;
            if (i == len - 1 || (i < len - 1 && s.charAt(i) != s.charAt(i + 1))) {
                sb.append(cnt);
                sb.append(s.charAt(i));
                cnt = 0;
            }
        }
        return sb.toString();
    }

}
