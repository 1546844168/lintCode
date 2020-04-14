package interview;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * 面试题 16.11. 跳水板
 * 你正在使用一堆木板建造跳水板。有两种类型的木板，其中长度较短的木板长度为shorter，长度较长的木板长度为longer。你必须正好使用k块木板。编写一个方法，生成跳水板所有可能的长度。
 * <p>
 * 返回的长度需要从小到大排列。
 * <p>
 * 示例：
 * <p>
 * 输入：
 * shorter = 1
 * longer = 2
 * k = 3
 * 输出： {3,4,5,6}
 * 提示：
 * <p>
 * 0 < shorter <= longer
 * 0 <= k <= 100000
 *
 * @author 江峰
 * @create 2020-04-14   17:21
 */
public class Inteview16_11 {
    /**
     * 方法一：遍历存到set里面。
     *
     * @param shorter
     * @param longer
     * @param k
     * @return
     */
    public int[] divingBoard1(int shorter, int longer, int k) {
        Set<Integer> set = new TreeSet<Integer>();
        for (int i = 0; i <= k; i++) {
            int num = shorter * i + (k - i) * longer;
            set.add(num);
        }
        int[] arr = new int[set.size()];
        int index = 0;
        for (Integer integer : set) {
            arr[index++] = integer;
        }
        return arr;
    }

    /**
     * 方法二：采用数学思想更加优雅、高效。
     *
     * @param shorter
     * @param longer
     * @param k
     * @return
     */
    public int[] divingBoard2(int shorter, int longer, int k) {
        if (k == 0) {
            return new int[]{};
        }
        int big = longer * k;
        int d = longer - shorter;
        if (d == 0) {
            return new int[]{big};
        }
        int[] arr = new int[k + 1];
        for (int i = k; i >= 0; i--) {
            arr[i] = big;
            big -= d;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] ints = new Inteview16_11().divingBoard1(1, 2, 3);
        System.out.println(Arrays.toString(ints));
    }
}
