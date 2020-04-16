package solution;

/**
 * 9. 回文数
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 121
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 * <p>
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 *
 * @author 江峰
 * @create 2020-04-16   9:49
 */
public class Solution9 {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        int newNum = 0;
        while (newNum < x) {
            newNum = newNum * 10 + x % 10;
            x /= 10;
        }
        return x == newNum || x == newNum / 10;
    }

    public static void main(String[] args) {
        System.out.println("palindrome = " + new Solution9().isPalindrome(1221));
        System.out.println("palindrome = " + new Solution9().isPalindrome(1231));
        System.out.println("palindrome = " + new Solution9().isPalindrome(1211));
        System.out.println("palindrome = " + new Solution9().isPalindrome(121));
    }
}
