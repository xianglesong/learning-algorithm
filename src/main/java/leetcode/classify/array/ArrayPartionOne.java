package leetcode.classify.array;

import java.util.Arrays;

/**
 * Created by rollin on 17/11/15. Given an array of 2n integers, your task is to group these
 * integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of
 * min(ai, bi) for all i from 1 to n as large as possible.
 *
 * Example 1: Input: [1,4,3,2]
 *
 * Output: 4 Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
 *
 * Note: n is a positive integer, which is in the range of [1, 10000]. All the integers in the array
 * will be in the range of [-10000, 10000].
 */
public class ArrayPartionOne {

    public int arrayPairSum(int[] nums) {
        if (nums == null) return 0;

        if (nums.length % 2 != 0) return 0;

        Arrays.sort(nums);

//        for (int i : nums) {
//            System.out.println(i);
//        }

        int sum = 0;
        int i = 0;
        while (i < nums.length) {
            sum += nums[i];
            i = i + 2;
        }

        return sum;
    }

    public static void main(String[] args) {
        ArrayPartionOne arrayPartionOne = new ArrayPartionOne();
        int[] nums = new int[]{1, 4, 3, 2};
        int result = arrayPartionOne.arrayPairSum(nums);
        System.out.println("result: " + result);
    }
}
