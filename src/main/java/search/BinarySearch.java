package search;

/**
 * BinarySearch
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
