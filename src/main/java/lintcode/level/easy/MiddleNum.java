package lintcode.level.easy;

import java.util.Arrays;

/**
 * Created by rollin on 17/12/14.
 */
public class MiddleNum {
    /*
    * @param : A list of integers
    * @return: An integer denotes the middle number of the array
    */
    public static int median(int[] nums) {
        // write your code here
        Arrays.sort(nums);
        if (nums == null) throw new RuntimeException();

        int len = nums.length;
        int result;
        if (len % 2 == 0) {
            result = nums[len / 2 - 1];
        } else {
            result = nums[len / 2];
        }
        return result;
    }


    public static void main(String[] args) {
        int[] a = new int[]{4, 5, 1, 2, 3};
        System.out.println(median(a));
        int[] b = new int[]{7, 9, 4, 5};
        System.out.println(median(b));
    }
}
