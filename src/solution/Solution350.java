package solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 350. 两个数组的交集 II
 * <p>
 * 给定两个数组，编写一个函数来计算它们的交集。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2,2]
 * 示例 2:
 * <p>
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [4,9]
 * 说明：
 * <p>
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
 * 我们可以不考虑输出结果的顺序。
 * 进阶:
 * <p>
 * 如果给定的数组已经排好序呢？你将如何优化你的算法？
 * 如果 nums1 的大小比 nums2 小很多，哪种方法更优？
 * 如果 nums2 的元素存储在磁盘上，磁盘内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/intersection-of-two-arrays-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author 江峰
 * @create 2019-11-29   9:37
 */
public class Solution350 {
    /**
     * 使用Hash表来实现：
     * 时间复杂度O(n)，空间复杂度O(n)
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> m1 = new HashMap<Integer, Integer>(nums1.length / 2);
        for (int n1 : nums1) {
            m1.put(n1, m1.getOrDefault(n1, 0) + 1);
        }
        int size = 0;
        for (int n2 : nums2) {
            Integer k1 = m1.get(n2);
            if (k1 != null && k1 >= 1) {
                nums2[size++] = n2;
                m1.put(n2, --k1);
            }
        }
        return Arrays.copyOf(nums2, size);
    }

    /**
     * 先对数组进行排序。如果数组是有序的话推荐使用这个方法
     * <p>
     * 时间复杂度：\mathcal{O}(n\log{n} + m\log{m})O(nlogn+mlogm)。其中 nn，mm 分别代表了数组的大小。我们对数组进行了排序然后进行了线性扫描。
     * 空间复杂度：O(1)O(1)，我们忽略存储答案所使用的空间，因为它对算法本身并不重要。
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersect1(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                nums1[k++] = nums1[i++];
                j++;
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }

    public static void main(String[] args) {
        int[] num1 = {1, 1, 2, 3, 4, 4, 5};
        int[] num2 = {2, 3, 6, 4, 7, 9, 4, 2};
        int[] intersect = new Solution350().intersect1(num1, num2);
        System.out.println(Arrays.toString(intersect));
    }
}
