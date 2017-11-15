package basic.search;

/**
 * Given an array of integers that is already sorted in ascending order, find two numbers such that
 * they add up to a specific target number.
 *
 * The function twoSum should return indices of the two numbers such that they add up to the target,
 * where index1 must be less than index2. Please note that your returned answers (both index1 and
 * index2) are not zero-based.
 *
 * You may assume that each input would have exactly one solution and you may not use the same
 * element twice.
 *
 * Input: numbers={2, 7, 11, 15}, target=9 Output: index1=1, index2=2
 *
 * @author ma.rulin
 * @date 17/5/4
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] x = new int[]{1, 2, 3, 4, 5};

        int key = 5;

        int low = 0;
        int high = x.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            System.out.println("mid: " + mid);
            if (x[mid] > key) {
                high = mid - 1;
            } else if (x[mid] < key) {
                low = mid + 1;
            } else if (x[mid] == key) {
                System.out.println("find: " + mid);
                return;
            }
        }

        return;
    }
}
