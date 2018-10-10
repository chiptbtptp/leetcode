package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author
 * @since 1.0
 */
public class T013Roman2Integer {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    private static int romanToInt(String s){
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        char[] chars = s.toCharArray();
        int result = 0;

        for (int i = 0; i< chars.length-1; i++ ) {
            char c = chars[i];
            char d = chars[i + 1];
            if (map.get(c) >= map.get(d)) {
                result += map.get(c);
            } else result -= map.get(c);
        }
        result += map.get(chars[chars.length-1]);
        return result;
    }

}
