package solution;

/**
 * 70. 爬楼梯
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * <p>
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * <p>
 * 注意：给定 n 是一个正整数。
 * <p>
 * 示例 1：
 * <p>
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 * 示例 2：
 * <p>
 * 输入： 3
 * 输出： 3
 * 解释： 有三种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶 + 1 阶
 * 2.  1 阶 + 2 阶
 * 3.  2 阶 + 1 阶
 *
 * @author 江峰
 * @create 2020-04-24   10:03
 */
public class Solution70 {
    /**
     * 通过斐波那契数列来实现。最优解。
     * 时间复杂度O(n)
     * 空间复杂度O(1)
     *
     * @param n
     * @return
     */
    public int climbStairs1(int n) {
        if (n == 1) {
            return 1;
        }
        int prev1 = 1;
        int prev2 = 2;
        for (int i = 3; i <= n; i++) {
            int temp = prev2;
            prev2 = prev1 + prev2;
            prev1 = temp;
        }
        return prev2;
    }

    /**
     * 动态规划
     * 时间复杂度O(n)
     * 空间复杂度O(n)
     *
     * @param n
     * @return
     */
    public int climbStairs2(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        // int i = new Solution70().climbStairs1(4);
        int i = new Solution70().climbStairs2(5);
        System.out.println(i);
    }
}