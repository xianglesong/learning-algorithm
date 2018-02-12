package leetcode.classify.twosum;

import java.util.HashMap;
import java.util.Map;

/**
 * ID: 1
 *
 * Created by rollin on 17/10/26.
 *
 * Given an array of integers, return indices of the two numbers such that they add up to a specific
 * target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same
 * element twice.
 *
 * Example: Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        // map solve
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        if (nums != null) {
            int i = 0;
            for (int m : nums) {
                map.put(m, i++);
            }

            int j = 0;
            for (int n : nums) {
                int v = target - n;
                if (map.containsKey(v) && map.get(v)!=j ) {
                    i = map.get(v);
                    if(i>j) {
                        return new int[] {j, i};
                    }
                    return new int[]{i, j};
                }
                j++;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 45, 60};
        int target = 48;

        int[] result = twoSum(nums, target);

        if (result != null) {
            for (int i : result) {
                System.out.println(i);
            }
        } else {
            System.out.println("not match found");
        }
    }
}
