package com.leetcode;

/**
 * @author
 * @since 1.0
 */
public class T014LongestCommonPrefix {
    public static void main(String[] args) {
        String[] s = {"abcd","ab",""};
        System.out.println(longestCommonPrefix(s));
    }

    /**
     * 优化的方案，将第一个所有char整体与下一个比较，如果不能匹配，则将第一个的最后一个char去掉，剪短，再次与后面的比较，知道第一个为“”
     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)    return "";
        String pre = strs[0];
        int i = 1;
        while(i < strs.length){
            while(strs[i].indexOf(pre) != 0)
                pre = pre.substring(0,pre.length()-1);
            i++;
        }
        return pre;
    }


    /**
     * 我的思路，将第一个的每一个char与其他比较，成功则返回
     * @param strs
     * @return
     */
    public static  String longestCommonPrefix2(String[] strs) {
        if (strs.length <1 ) return "";
        if (strs.length ==1) return strs[0];
        StringBuilder pre = new StringBuilder();
        boolean flag = true;
        char[] chars = strs[0].toCharArray();
        for (int  i=0; i<chars.length;i++) {
            for (int j=1; j<strs.length ; j++) {
                if (strs[j].length() > 0 && strs[j].length() > i)
                {
                    flag = flag && (chars[i] == strs[j].toCharArray()[i]);
                } else flag = false;
            }
            if (flag) pre.append(chars[i]);
        }
        return pre.toString();
    }

}
