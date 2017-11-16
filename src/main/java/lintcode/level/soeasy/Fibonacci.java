package lintcode.level.soeasy;

/**
 * Created by rollin on 17/11/15.
 *
 * 366. 斐波纳契数列 查找斐波纳契数列中第 N 个数。
 *
 * 所谓的斐波纳契数列是指：
 *
 * 前2个数是 0 和 1 。 第 i 个数是第 i-1 个数和第i-2 个数的和。 斐波纳契数列的前10个数字是：
 *
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ...
 */
public class Fibonacci {

    /*
    * @param n: an integer
    * @return: an ineger f(n)
    */
    public int fibonacci(int n) {
        // write your code here
        if (n == 1) return 0;
        if (n == 2) return 1;

        int result = 0;
        int pre = 1;
        int prepre = 0;
        int i = 3;
        while (i <= n) {
            result = pre + prepre;
            prepre = pre;
            pre = result;
            i++;
        }

        return result;
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fibonacci(10));
    }
}
