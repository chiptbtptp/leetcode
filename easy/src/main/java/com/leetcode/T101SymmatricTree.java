package com.leetcode;

/**
 * 判断二叉树是否对称
 * 注意点：
 *  左子数的左子节点与右子树的右子节点比较,左子树的右节点与右子树左节点比较
 *
 * @author
 * @since 1.0
 */
public class T101SymmatricTree {
    private static boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }

    private static boolean isMirror(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            return p == q;
        }

        return (p.val == q.val) && isMirror(p.left,q.right) && isMirror(p.right, q.left);
    }
}
