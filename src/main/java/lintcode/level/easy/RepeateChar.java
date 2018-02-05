package lintcode.level.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by rollin on 17/12/15.
 */
public class RepeateChar {

    /*
     * @param str: A string
     * @return: a boolean
     */
    public static boolean isUnique(String str) {
        // write your code here
        if (str == null) return false;
        if (str.equals("")) return false;

        int[] tmp = new int[256];
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i);
            if (++tmp[index] > 1) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "aab";
        System.out.println(isUnique(str));
        str = "abc";
        System.out.println(isUnique(str));
    }
}
