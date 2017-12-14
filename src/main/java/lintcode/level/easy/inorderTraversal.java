package lintcode.level.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rollin on 17/11/21.
 */
public class InorderTraversal {

    List<Integer> list = new ArrayList<Integer>();

    /*
     * @param root: A Tree
     * @return: Preorder in ArrayList which contains node values.
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        // write your code here
        if (root == null) return null;

        if (root != null) {
            inorderTraversal(root.left);
            list.add(root.val);
            inorderTraversal(root.right);
        }

        return list;
    }

    public static void main(String[] args) {
        InorderTraversal preorderTraversal = new InorderTraversal();
        TreeNode root = new TreeNode(1);

        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        preorderTraversal.inorderTraversal(root);

        for (Integer i : preorderTraversal.list) {
            System.out.println(i);
        }
    }
}
