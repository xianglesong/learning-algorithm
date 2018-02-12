package leetcode.orders;

/**
 * #461 Created by rollin on 18/2/12.
 */
public class HammingDistance {

    public int hammingDistance(int x, int y) {
        int xor = x ^ y, count = 0;
        // logic
        for (int i = 0; i < 32; i++) count += (xor >> i) & 1;
        return count;
    }

    public static void main(String[] args) {
        HammingDistance hammingDistance = new HammingDistance();
        int result = hammingDistance.hammingDistance(1, 4);
        System.out.println(result);
    }
}
