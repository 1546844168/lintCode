package solution;

/**
 * @author 潇潇暮雨
 * @create 2018-09-06   11:09
 *
 * 2. 尾部的零
 * 设计一个算法，计算出n阶乘中尾部零的个数
 *
 * 样例
 * 11! = 39916800，因此应该返回 2
 *
 * 挑战
 * O(logN)的时间复杂度
 *
 */
public class Solution2 {
    public long trailingZeros(long n) {
        if (n < 5)
            return 0;
        long num = n;
        long count = 0;
        while (num >= 5){
            num= num / 5;
            count += num;

        }
        return count;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        long l = s.trailingZeros(105L);
        System.out.println("l = " + l);
        System.out.println(Long.MAX_VALUE);
    }
}
