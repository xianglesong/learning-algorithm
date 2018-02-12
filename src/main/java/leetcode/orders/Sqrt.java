package leetcode.orders;

/**
 * Created by rollin on 18/2/12.
 */
public class Sqrt {

    public int mySqrt(int x) {
//        if (x < 0) throw  new RuntimeException("input not correct.");
//
//        return (int) Math.sqrt(x);

        if (x == 0)
            return 0;

        int left = 1, right = Integer.MAX_VALUE;
        while (true) {
            int mid = left + (right - left) / 2;
            if (mid > x / mid) {
                right = mid - 1;
            } else {
                if (mid + 1 > x / (mid + 1))
                    return mid;
                left = mid + 1;
            }
        }
    }

    public static void main(String[] args) {
        Sqrt sqrt = new Sqrt();
        int result = sqrt.mySqrt(5);
        System.out.println(result);
    }
}
