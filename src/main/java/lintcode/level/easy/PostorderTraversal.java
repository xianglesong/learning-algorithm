package lintcode.level.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rollin on 17/11/21.
 */
public class PostorderTraversal {

    List<Integer> list = new ArrayList<Integer>();

    /*
     * @param root: A Tree
     * @return: Preorder in ArrayList which contains node values.
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        // write your code here
        if (root == null) return null;

        if (root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            list.add(root.val);
        }

        return list;
    }

    public static void main(String[] args) {
        PostorderTraversal preorderTraversal = new PostorderTraversal();
        TreeNode root = new TreeNode(1);

        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        preorderTraversal.postorderTraversal(root);

        for (Integer i : preorderTraversal.list) {
            System.out.println(i);
        }
    }
}
