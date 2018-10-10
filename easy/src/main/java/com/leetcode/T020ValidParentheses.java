package com.leetcode;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * 括号校验
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * 1. Open brackets must be closed by the same type of brackets。
 * 2. Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 * Example 1:
 *  Input: "()"
 *  Output: true
 *
 *  Input: "([)]"
 *  Output: false
 *
 *  Input: "{[]}"
 *  Output: true
 * @author wangkun@cetiti.com
 * @since 1.0
 */
public class T020ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("([)]"));
    }

    /**
     *  仅仅包含括号这些字符，不包含其他字符
     * @param s string
     * @return boolean
     */

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }

}
