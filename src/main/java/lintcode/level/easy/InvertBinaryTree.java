package lintcode.level.easy;

/**
 * Created by rollin on 17/11/20.
 *
 * 375. 克隆二叉树
 *
 * 深度复制一个二叉树。
 *
 * 给定一个二叉树，返回一个他的 克隆品 。
 */
public class InvertBinaryTree {

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
