package lintcode.level.easy;

/**
 * Created by rollin on 17/12/6.
 */
public class Zero {


    public static long trailingZerosCorrect(long n) {
        // write your code here
        long count = 0;
        long temp = n / 5;
        while (temp != 0) {
            count += temp;
            temp /= 5;
        }
        return count;
    }

    public static long trailingZeros(long n) {
        // write your code here, try to do it without arithmetic operators.
        if (n < 0) throw new RuntimeException("error");
        if (n == 0) return 1;

        long result = 1;

        while (n > 0) {
            result = n * result;
            n = n - 1;
        }

        System.out.println("result 1: " + result);

        int num = 0;

        while ((result % 10) == 0) {
            num++;
            result = result / 10;
            System.out.println("result 2: " + result);
        }

        return num;
    }

    public static void main(String[] args) {
        long num = trailingZeros(5);
        System.out.println(num);
    }
}
