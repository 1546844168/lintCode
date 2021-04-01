/**
 * @author 江峰
 * @create 2019-11-26   13:34
 */
public class Main {

    public static void main(String[] args) {
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null) {
            return "";
        }
        if (strs.length <= 1) {
            return strs.length == 0 ? "" : strs[0];
        }
        int minLen = 0;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() <= minLen) {
                minLen = strs[i].length();
            }
        }

        for (int i = 0; i < minLen; i++) {
            char str = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (str != strs[i].charAt(j)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0].substring(0, minLen);
    }
}