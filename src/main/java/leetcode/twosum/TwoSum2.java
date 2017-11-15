package leetcode.twosum;

import java.util.HashMap;
import java.util.Map;

/**
 * ID: 167
 *
 * Created by rollin on 17/10/27. Given an array of integers that is already sorted in ascending
 * order, find two numbers such that they add up to a specific target number.
 *
 * The function twoSum should return indices of the two numbers such that they add up to the target,
 * where index1 must be less than index2. Please note that your returned answers (both index1 and
 * index2) are not zero-based.
 *
 * You may assume that each input would have exactly one solution and you may not use the same
 * element twice.
 *
 * Input: numbers={2, 7, 11, 15}, target=9 Output: index1=1, index2=2
 */
public class TwoSum2 {

    public static int[] twoSum(int[] numbers, int target) {
        // map solve
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        if (numbers != null) {
            int i = 1;
            for (int m : numbers) {
                map.put(m, i++);
            }

            int j = 1;
            for (int n : numbers) {
                int v = target - n;
                if (map.containsKey(v) && map.get(v) != j) {
                    i = map.get(v);
                    if (i > j) {
                        return new int[]{j, i};
                    }
                    return new int[]{i, j};
                }
                j++;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

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
