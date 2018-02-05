package lintcode.level.easy;

/**
 * Created by rollin on 17/12/15.
 */
public class CompareStr {
    /*
     * 由于是在字符串strA中确定是否包含字符串strB中的所有字符<br/>
     * 故只需要将字符串strB中的每一个字符在字符串strA中遍历，当在字符串strA中不存在时，则直接返回false<br/>
     * 当存在是，则进行字符串strB的下一个字符查找<br/>
     * @param A: A string
     * @param B: A string
     * @return: if string A contains all of the characters in B return true else return false
     */
    public static boolean compareStrings(String A, String B) {
        // write your code here
        for (int i = 0, bLen = B.length(); i < bLen; i++) {
            if (!comp(A, B.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean comp(String A, char B) {
        // write your code here
        int aLen = A.length();
        int[] arr = new int[aLen];
        for (int i = 0; i < aLen; i++) {
            if (B == A.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // true
        System.out.println(compareStrings("ABCD", "ACD"));
        // false
        System.out.println(compareStrings("ABCD", "AABC"));
    }
}
