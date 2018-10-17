package com.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 返回一个二叉树从下到上顺序的数值，从左到右，一层一层从叶到根
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 * [
 *  [15,7],
 *  [9,20],
 *  [3]
 * ]
 * @author
 * @since 1.0
 */
public class T107BinaryTreeLevelOrderTraversal {

    private static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return result;
        }

        queue.offer(root);
        //什么时候用循环什么时候用递归？
        //循环是广度遍历，递归式深度遍历
        //下面是广度遍历BFS
        while (!queue.isEmpty()) {
            int levelNums = queue.size();
            List<Integer> levelList = new ArrayList<>();
            for (int i = 0; i < levelNums; i++) {
                if (queue.peek().left != null) {
                    queue.offer(queue.peek().left);
                }
                if (queue.peek().right != null) {
                    queue.offer(queue.peek().right);
                }
                levelList.add(queue.poll().val);
            }
            result.add(0, levelList);
        }
        return result;
    }

    //深度遍历DFS
    //深度遍历用的是递归
    private List<List<Integer>> levelOrderBottom2(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        levelMaker(result, root, 0);
        return result;
    }

    private void levelMaker(List<List<Integer>> list, TreeNode root, int level) {
        if(root==null) return;
        if (level >= list.size()) {
            list.add(0, new LinkedList<>());
        }
        levelMaker(list, root.left, level + 1);
        levelMaker(list, root.right, level + 1);
        list.get(list.size() - level - 1).add(root.val);
    }
}
