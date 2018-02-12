package leetcode.orders;

import java.util.HashSet;
import java.util.Set;

/**
 * # 771 Created by rollin on 18/2/12.
 */
public class JewelsAndStones {

    public int numJewelsInStones(String J, String S) {
        int res = 0;
        Set setJ = new HashSet();
        for (char j : J.toCharArray()) setJ.add(j);
        for (char s : S.toCharArray()) if (setJ.contains(s)) res++;
        return res;
    }

    public static void main(String[] args) {
        JewelsAndStones jewelsAndStones = new JewelsAndStones();
        String J = "aA", S = "aAAbbbb";
        int result = jewelsAndStones.numJewelsInStones(J, S);
        System.out.println(result);
    }

}
