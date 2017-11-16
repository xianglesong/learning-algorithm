package lintcode.level.soeasy;

/**
 * Created by rollin on 17/11/16.
 *
 * 463. 整数排序
 *
 * 给一组整数，按照升序排序，使用选择排序，冒泡排序，插入排序或者任何 O(n2) 的排序算法。
 *
 * 样例 对于数组 [3, 2, 1, 4, 5], 排序后为：[1, 2, 3, 4, 5]。
 */
public class SortInteger {
    /*
   * @param A: an integer array
   * @return:
   */
    public void sortIntegers(int[] A) {
        // write your code here
        if (A == null) return;

        // choose sort
        for (int i = 0; i < A.length - 1; i++) {
            int min = A[i];
            int index = i;
            for (int j = i + 1; j < A.length; j++) {
                if (min > A[j]) {
                    min = A[j];
                    index = j;
                }
            }

            // swap
            if (A[i] > min) {
                int tmp = A[index];
                A[index] = A[i];
                A[i] = tmp;
            }
        }

    }

    public static void main(String[] args) {
        SortInteger sortInteger = new SortInteger();
        int[] A = new int[]{1, 2, 34, 5, 6, -10, 0, 23, 231, 29, 22, 33, 23, 23};

        sortInteger.sortIntegers(A);
        for (int i : A) {
            System.out.println(i);
        }
    }
}
