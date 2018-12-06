/**
 * @author 潇潇暮雨
 * @create 2018-09-05   12:12
 * <p>
 * 366. 斐波纳契数列
 * 查找斐波纳契数列中第 N 个数。
 * 所谓的斐波纳契数列是指：
 * <p>
 * 前2个数是 0 和 1 。
 * 第 i 个数是第 i-1 个数和第i-2 个数的和。
 * 斐波纳契数列的前10个数字是：
 * <p>
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ...
 * <p>
 * 样例
 * 给定 1，返回 0
 * <p>
 * 给定 2，返回 1
 * <p>
 * 给定 10，返回 34
 */
public class Solution366 {

    // 时间复杂度是o(n),空间复杂度是o(1);
    public int fibonacci(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        int sn = 0;
        int n1 = 0;
        int n2 = 1;
        for (int i = 3; i <= n; i++) {
            sn = n1 + n2;
            n1 = n2;
            n2 = sn;
        }
        return sn;
    }

  /*  public static void main(String[] args) {
        System.out.println("开始");
        Solution366 s = new Solution366();
        int i = s.fibonacci(10);
        System.out.println(i);
        System.out.println(Integer.MAX_VALUE);
        System.out.println("结束");
    }

    几斤几两据了解偶刚刚不好看英镑
*/
}
