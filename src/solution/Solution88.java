package solution;

import java.util.Arrays;

/**
 * 88. 合并两个有序数组
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 * <p>
 *  
 * <p>
 * 说明:
 * <p>
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 *  
 * <p>
 * 示例:
 * <p>
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * <p>
 * 输出: [1,2,2,3,5,6]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author 江峰
 * @create 2020-04-23   15:56
 */
public class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m + n;
        n = n - 1;
        m = m - 1;
        while (n >= 0 && m >= 0) {
            if (nums1[m] <= nums2[n]) {
                nums1[--i] = nums2[n--];
            } else {
                nums1[--i] = nums1[m--];
            }
        }
        // nums1的长度为0时，进行复制。
        System.arraycopy(nums2, 0, nums1, 0, n + 1);
    }

    public static void main(String[] args) {
        // int[] nums1 = {1, 2, 3, 0, 0, 0, 0};
        int[] nums1 = {0, 0, 0, 0};
        int[] nums2 = {1, 3, 9, 10};
        new Solution88().merge(nums1, 0, nums2, 4);
        System.out.println(Arrays.toString(nums1));
    }
}