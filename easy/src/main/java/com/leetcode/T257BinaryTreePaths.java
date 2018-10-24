package com.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 打印出二叉树的所有路径
 * 二叉树的路径指的是根节点到叶节点的路径，叶节点是没有子节点的节点。
 * @author
 * @since 1.0
 */
public class T257BinaryTreePaths {



    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root != null) {
            StringBuilder sb = new StringBuilder();
            helper(root,sb, result);
        }
        return result;
    }

    private static void helper(TreeNode node, StringBuilder sb, List<String> result) {
        if (node != null) {
            sb.append(node.val).append("->");
            if (node.left == null && node.right == null) {
                String tempStr = sb.toString();
                tempStr = tempStr.substring(0, tempStr.length() - 2);
                result.add(tempStr);
            }
            helper(node.left, sb, result);
            helper(node.right, sb,result);
            sb.delete(sb.lastIndexOf(Integer.valueOf(node.val).toString()), sb.length());
        }
    }

    private void searchBT(TreeNode root, String path, List<String> result) {
        if (root.left == null && root.right == null) result.add(path + root.val);
        if (root.left !=null) searchBT(root.left, path + root.val + "->", result);
        if (root.right !=null) searchBT(root.right, path + root.val + "->", result);
    }




}
