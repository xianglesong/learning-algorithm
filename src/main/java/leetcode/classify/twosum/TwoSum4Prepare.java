package leetcode.classify.twosum;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rollin on 17/10/27. Definition for a binary tree node. public class TreeNode { int
 * val; TreeNode left; TreeNode right; TreeNode(int x) { val = x; } }
 */
public class TwoSum4Prepare {

    /**
     * @param root [5,3,6,2,4,null,7]
     * @param k    9
     * @return true if found, false not found.
     */
    public static boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;

        List<Integer> list = new ArrayList<Integer>();
        inOrder(root, list);

        int i = 0, j = list.size() - 1;
        while (i < j) {
            int sum = list.get(i) + list.get(j);
            if (sum == k) return true;
            if (sum < k) {
                i++;
            } else {
                j--;
            }
        }

        return false;
    }

    private static void inOrder(TreeNode root, List<Integer> list) {
        if (root == null) return;

        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }

    public static TreeNode build() {
        Integer[] array = {5, 3, 6, 2, 4, -1, 7};
        TreeNode treeNode = buildTree(array);

        return treeNode;
    }

    private static TreeNode buildTree(Integer[] array) {
        TreeNode treeNode = null;

        for (Integer i : array) {
            System.out.println(i);
            treeNode = insertTreeNode(treeNode, i);
        }

        return treeNode;
    }

    private static TreeNode insertTreeNode(TreeNode treeNode, Integer i) {
        if (treeNode == null) {
            // rootNode
            TreeNode rootTreeNode = new TreeNode(i);
            return rootTreeNode;
        }
        //
        if (treeNode.val > i) {
            // add to left
            if (treeNode.left == null) {
                TreeNode t = new TreeNode(i);
                treeNode.left = t;
            } else {
                insertTreeNode(treeNode.left, i);
            }
        } else if (treeNode.val < i) {
            // add to right
            if (treeNode.right == null) {
                TreeNode t = new TreeNode(i);
                treeNode.right = t;
            } else {
                insertTreeNode(treeNode.right, i);
            }
        } else if (treeNode.val == i) {
            throw new RuntimeException("data should not same");
        }

        return treeNode;
    }

    public static void main(String[] args) {
        TreeNode rootTreeNode = build();
        // traverTree
        List<Integer> list = new ArrayList<Integer>();
        inOrder(rootTreeNode, list);
        for (Integer t : list) {
            System.out.println("t: " + t);
        }
        // findTree
    }
}
