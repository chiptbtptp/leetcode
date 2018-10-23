package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 翻转二叉树
 * 其实很简单，递归就好了，反转子树，这样左右子树也会随着父节点的翻转而左右子树的子树反转
 *
 * @author
 * @since 1.0
 */
public class T226InvertBinaryTree {

    //递归
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

    //非递归
    public TreeNode invertTree2(TreeNode root) {
        if (root == null) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            TreeNode temp = current.left;
            current.left = current.right;
            current.right = temp;
            if (current.left !=null) queue.add(current.left);
            if (current.right!=null) queue.add(current.right);
        }
        return root;
    }


}
