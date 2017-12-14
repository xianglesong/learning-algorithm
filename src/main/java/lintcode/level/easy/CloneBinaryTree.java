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
public class CloneBinaryTree {

    /*
    * @param root: The root of binary tree
    * @return: root of new tree
    */
    public TreeNode cloneTree(TreeNode root) {
        // write your code here
        if (root == null) return null;

        if (root != null) {
            System.out.println("treeNode: " + root.val);
            TreeNode newRoot = new TreeNode(root.val);
            if (root.left != null) {
                newRoot.left = cloneTree(root.left);
            }
            if (root.right != null) {
                newRoot.right = cloneTree(root.right);
            }

            return newRoot;
        }

        return null;
    }

    public TreeNode cloneTree2(TreeNode root) {
        // write your code here
        if (root == null) return null;

        if (root != null) {
            TreeNode treeNode = root;
            treeNode.left = cloneTree2(root.left);
            treeNode.right = cloneTree2(root.right);
            return treeNode;
        }

        return null;
    }

    public void traverse(TreeNode treeNode) {
        if (treeNode != null) {
            System.out.println("treeNode: " + treeNode.val);
            traverse(treeNode.left);
            traverse(treeNode.right);
        }
    }

    public static void main(String[] args) {
        CloneBinaryTree cloneBinaryTree = new CloneBinaryTree();
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        TreeNode result = cloneBinaryTree.cloneTree(root);

        System.out.println("---------------------");
        cloneBinaryTree.traverse(result);
    }

}
