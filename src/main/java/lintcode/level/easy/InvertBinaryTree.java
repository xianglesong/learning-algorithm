package lintcode.level.easy;

/**
 * Created by rollin on 17/11/20.
 *
 * 175. 翻转二叉树
 */
public class InvertBinaryTree {

    /**
     * 当n=0, 1的时候, 结果正确. 假设函数对于n是正确的, 函数对n+1结果也正确. 如果这两点是成立的，我们知道这个函数对于所有可能的n都是正确的。
     */

    /*
     * @param root: a TreeNode, the root of the binary tree
     * @return: nothing
     */
    public void invertBinaryTree(TreeNode root) {
        // write your code here
        if (root == null)
            return;
        invertBinaryTree(root.left);
        invertBinaryTree(root.right);

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }


    public void traverse(TreeNode treeNode) {
        if (treeNode != null) {
            System.out.println("treeNode: " + treeNode.val);
            traverse(treeNode.left);
            traverse(treeNode.right);
        }
    }

    public static void main(String[] args) {
        InvertBinaryTree cloneBinaryTree = new InvertBinaryTree();
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.right.left = new TreeNode(4);
        cloneBinaryTree.traverse(root);

        cloneBinaryTree.invertBinaryTree(root);

        System.out.println("---------------------");
        cloneBinaryTree.traverse(root);
    }

}
