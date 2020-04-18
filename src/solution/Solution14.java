package solution;

/**
 * 14. 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 * 示例 1:
 * <p>
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 * <p>
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 * <p>
 * 所有输入只包含小写字母 a-z 。
 *
 * @author 江峰
 * @create 2020-04-18   10:29
 */
public class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null) {
            throw new IllegalArgumentException("参数不能为空");
        }
        if (strs.length <= 1) {
            return strs.length == 0 ? "" : strs[0];
        }
        int right = getRight(strs);
        return strs[0].substring(0, right);
    }

    private int getRight(String[] strs) {
        int len = strs.length;
        int i = 0;
        for (; i < strs[0].length(); i++) {
            for (int j = 1; j < len; j++) {
                char c = strs[0].charAt(i);
                if (i < strs[j].length()) {
                    if (strs[j].charAt(i) != c) {
                        return i;
                    }
                } else {
                    return i;
                }
            }
        }
        return i;
    }

    /**
     * 先求出数组中所有字符串的最小长度，然后根据最小长度遍历比较。
     *
     * @param strs
     * @return
     */
    public String longestCommonPrefix2(String[] strs) {
        if (strs == null) {
            throw new IllegalArgumentException("参数不能为空");
        }
        if (strs.length <= 1) {
            return strs.length == 0 ? "" : strs[0];
        }
        int minLen = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < minLen) {
                minLen = strs[i].length();
            }
        }
        int i = 0;
        for (; i < minLen; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (c != strs[j].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0].substring(0, i);
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"abab", "aba", "a"};
        System.out.println(new String("").length());
        System.out.println("strs.length = " + strs.length);
        String s = new Solution14().longestCommonPrefix2(strs);
        System.out.println("s = " + s);
    }
}