package lintcode.level.soeasy;

/**
 * Created by rollin on 17/11/15.
 */
public class TreeNodeMax {

    static TreeNode maxNode;

    /*
     * @param root: the root of tree
     * @return: the max node
     */
    public TreeNode maxNode(TreeNode root) {
        // write your code here
        if (root == null) return null;
        maxNode = root;
        maxNode = traverse(root);
        return maxNode;
    }

    private TreeNode traverse(TreeNode node) {
        if (node != null) {
            if (node.val > maxNode.val) {
                maxNode = node;
                System.out.println("node value: " + node.val + " max value: " + maxNode.val);
            }
            traverse(node.left);
            traverse(node.right);
        }
        return maxNode;
    }


    public static void main(String[] args) {
        TreeNodeMax treeNodeMax = new TreeNodeMax();
        TreeNode treeNode = treeNodeMax.maxNode(null);
        System.out.println(treeNode);

        //
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode = treeNodeMax.maxNode(treeNode1);
        System.out.println(treeNode);

    }

}

class TreeNode {
    public int val;
    public TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "left=" + left +
                ", val=" + val +
                ", right=" + right +
                '}';
    }
}