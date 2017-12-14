package lintcode.level.easy;

/**
 * Created by rollin on 17/11/23.
 */
public class IsIdentical {

    /*
     * @param a: the root of binary tree a.
     * @param b: the root of binary tree b.
     * @return: true if they are identical, or false.
     */
    public boolean isIdentical(TreeNode a, TreeNode b) {
        // write your code here
        if (a == null && b == null) return true;
        if (a == null && b != null) return false;
        if (a != null && b == null) return false;

        if (a != null && b != null) {
            if (a.val != b.val) return false;

            return (isIdentical(a.left, b.left) && isIdentical(a.right, b.right));
        }

        return false;
    }
}
