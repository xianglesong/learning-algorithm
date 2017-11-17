package lintcode.level.easy;

/**
 * Created by rollin on 17/11/17.
 *
 * 13. 字符串查找
 *
 * 对于一个给定的 source 字符串和一个 target 字符串，你应该在 source 字符串中找出 target 字符串出现的第一个位置(从0开始)。如果不存在，则返回 -1。
 *
 * 样例 如果 source = "source" 和 target = "target"，返回 -1。
 *
 * 如果 source = "abcdabcdefg" 和 target = "bcd"，返回 1。
 */
public class StringFind {

    /*
     * @param source: source string to be scanned.
     * @param target: target string containing the sequence of characters to match
     * @return: a index to the first occurrence of target in source, or -1  if target is not part of source.
     */
    public int strStr(String source, String target) {
        // write your code here
        if (source == null) return -1;
        if (target == null) return -1;
        return source.indexOf(target);
    }
}
