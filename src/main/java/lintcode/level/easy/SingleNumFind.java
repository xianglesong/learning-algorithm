package lintcode.level.easy;

/**
 * Created by rollin on 17/11/17.
 *
 * 82. 落单的数
 *
 * 给出2*n + 1 个的数字，除其中一个数字之外其他每个数字均出现两次，找到这个数字。
 *
 * 样例 给出 [1,2,2,1,3,4,3]，返回 4
 */
public class SingleNumFind {

    /*
     * @param A: An integer array
     * @return: An integer
     */
    public int singleNumber(int[] A) {
        // write your code here
        if (A == null) return 0;
        if (A.length == 0) return 0;

        int result = A[0];
        int len = A.length;
        for (int i = 1; i < len; i++) {
            result = result ^ A[i];
        }

        return result;
    }

    public static void main(String[] args) {
        SingleNumFind singleNumFind = new SingleNumFind();

        int[] A = new int[]{1, 2, 2, 1, 3, 4, 3};

        int result = singleNumFind.singleNumber(A);

        System.out.println(result);
    }
}
