package lintcode.level.easy;

import static java.lang.Math.max;

/**
 * Created by rollin on 17/11/17.
 */
public class TreeNodeMaxDepth {

    /**
     * @param root: The root of binary tree.
     * @return: An integer.
     */
    public int maxDepth(TreeNode root) {
        // write your code here
        if (root == null) return 0;
        int depth = 1;

        depth = max(maxDepth(root.left), maxDepth(root.right)) + 1;

        return depth;
    }

    public static void main(String[] args) {
        TreeNodeMaxDepth treeNodeMaxDepth = new TreeNodeMaxDepth();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        int max = treeNodeMaxDepth.maxDepth(root);

        System.out.println(max);
    }

}
