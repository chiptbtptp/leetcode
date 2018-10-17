package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 帕斯卡三角（杨辉三角）
 * @author
 * @since 1.0
 */
public class T118PascalTriangle {

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>(numRows);
        if (numRows==0) return pascalTriangle;
        List<Integer> l1 = new ArrayList<>();
        l1.add(0,1);
        pascalTriangle.add(0, l1);

        for (int i=1;i<numRows;i++) {
            List<Integer> tempList = new ArrayList<>(i+1);
            tempList.add(0, 1);

            for (int j=1;j<i;j++) {
                tempList.add(j,pascalTriangle.get(i-1).get(j-1)+pascalTriangle.get(i-1).get(j));
            }
            tempList.add(i, 1);
            pascalTriangle.add(i,tempList);
        }
        return pascalTriangle;
    }
}
