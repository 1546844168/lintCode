package solution;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 江峰
 * @create 2019-11-27   10:23
 * <p>
 * <p>
 * 136. 只出现一次的数字
 * <p>
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * <p>
 * 说明：
 * <p>
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * <p>
 * 示例 1:
 * <p>
 * 输入: [2,2,1]
 * 输出: 1
 * 示例 2:
 * <p>
 * 输入: [4,1,2,1,2]
 * 输出: 4
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/single-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution136 {
    /**
     * 方案1：通过hash表来实现。空间复杂度不符合要求
     * Time: O(n)O(n) Space: O(n)O(n)
     *
     * @param nums
     * @return
     */
    public static int singleNumber1(int[] nums) {
        int length = nums.length;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(length / 2);
        for (int num : nums) {
            Integer count = map.get(num);
            count = count == null ? 1 : ++count;
            map.put(num, count);
        }

        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            if (integerIntegerEntry.getValue() == 1) {
                return integerIntegerEntry.getKey();
            }
        }
        return -1;
    }


    /**
     * 既满足时间复杂度又满足空间复杂度，就要提到位运算中的异或运算 XOR，主要因为异或运算有以下几个特点：
     * 一个数和 0 做 XOR 运算等于本身：a⊕0 = a
     * 一个数和其本身做 XOR 运算等于 0：a⊕a = 0
     * XOR 运算满足交换律和结合律：a⊕b⊕a = (a⊕a)⊕b = 0⊕b = b
     * 时间复杂度：O(n)O(n)，空间复杂度：O(1)O(1)
     *
     * @param nums
     * @return
     */
    public static int singleNumber2(int[] nums) {
        int num = nums[0];
        int length = nums.length;
        for (int i = 1; i < length; i++) {
            num ^= nums[i];
        }
        return num;
    }

    public static void main(String[] args) {
        int[] nums = {4, 4, 1, 2, 1, 2, 55, 66, 66, 55, 8};
        // int[] nums = {4, 4, 1};
        // int i = singleNumber1(nums);
        int i = singleNumber2(nums);
        System.out.println("i = " + i);
    }
}
