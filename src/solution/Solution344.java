package solution;

import java.util.Arrays;

/**
 * 344. 反转字符串
 * <p>
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 * <p>
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 * <p>
 * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：["h","e","l","l","o"]
 * 输出：["o","l","l","e","h"]
 * 示例 2：
 * <p>
 * 输入：["H","a","n","n","a","h"]
 * 输出：["h","a","n","n","a","H"]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author 江峰
 * @create 2019-12-03   9:31
 */
public class Solution344 {
    public void reverseString(char[] s) {
        int length = s.length;
        int half = length >> 1;
        int index = 0;
        for (int i = length - 1; i >= 0; i--) {
            char temp = s[i];
            s[i] = s[index];
            s[index++] = temp;
            if (index == half) {
                break;
            }
        }
        System.out.println(Arrays.toString(s));
    }

    /**
     * 代码稍作优化，更加简洁。
     *
     * @param s
     */
    public void reverseString1(char[] s) {
        int k = s.length;
        int halfLen = s.length >> 2;
        for (int i = 0; i < halfLen; i++) {
            char temp = s[i];
            s[i] = s[--k];
            s[k] = temp;
        }
        System.out.println(Arrays.toString(s));
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'i', 'l', 'o', '1'};
        new Solution344().reverseString(s);
    }
}
