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
    public String countAndSay2(int n) {
        if(n == 1){
            return "1";
        }
        //递归调用，然后对字符串处理
        String str = countAndSay(n-1) + "*";//为了str末尾的标记，方便循环读数
        char[] c = str.toCharArray();
        int count = 1;
        String s = "";
        for(int i = 0; i < c.length - 1;i++){
            if(c[i] == c[i+1]){
                count++;//计数增加
            }else{
                s = s + count + c[i];//上面的*标记这里方便统一处理
                count = 1;//初始化
            }
        }
        return s;
    }

}
