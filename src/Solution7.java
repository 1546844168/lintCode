/**
 * 7. 整数反转
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 123
 * 输出: 321
 * 示例 2:
 * <p>
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * <p>
 * 输入: 120
 * 输出: 21
 * 注意:
 * <p>
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 *
 * @author 江峰
 * @create 2020-04-10   9:37
 */
public class Solution7 {
    public int reverse(int x) {
        int num = 0;
        while (x != 0) {
            int pop = x % 10;
            if (num > Integer.MAX_VALUE / 10 || num == Integer.MAX_VALUE / 10 && pop > 7) {
                return 0;
            }
            if (num < Integer.MIN_VALUE / 10 || num == Integer.MIN_VALUE / 10 && pop < -8) {
                return 0;
            }
            x = x / 10;
            num = num * 10 + pop;
        }
        return num;
    }

    public static void main(String[] args) {
        int reverse = new Solution7().reverse(123);
        System.out.println("reverse = " + reverse);
    }
}
