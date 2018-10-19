package com.leetcode;

/**
 * 给定一个升序数组和一个值，求数组中是否存在两个元素，其和等于给定的值。
 * 每个元素只能使用一次
 * @author
 * @since 1.0
 */
public class T167TwoSum2 {

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        System.out.println(twoSum(numbers, target));
    }
    public static int[] twoSum(int[] numbers, int target){
        int[] indices = new int[2];
        for (int i=0,j=numbers.length-1; i<j;) {
            int sum = numbers[i] + numbers[j];
            if ( sum == target) {
                indices[0] = i;
                indices[1] = j;
                return indices;
            } else if (sum > target) {
                j--;
            }else{
                i++;
            }
        }
        return indices;
    }
}
