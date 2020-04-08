import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 26. 删除排序数组中的重复项
 * <p>
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * <p>
 * 示例 1:
 * <p>
 * 给定数组 nums = [1,1,2],
 * <p>
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 * <p>
 * 你不需要考虑数组中超出新长度后面的元素。
 * 示例 2:
 * <p>
 * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
 * <p>
 * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 * <p>
 * 你不需要考虑数组中超出新长度后面的元素。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author 江峰
 * @create 2019-11-26   13:42
 */
public class Solution26 {
    static int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (length == 0 || length == 1) {
            return length;
        }
        if (length == 2) {
            return nums[0] == nums[1] ? 1 : 2;
        }
        int count = 1;
        for (int i = 1; i < length; i++) {
            if (nums[count - 1] < nums[i]) {
                count++;
                continue;
            }
            if (nums[count - 1] == nums[i]) {
                for (int j = i; j < length - 1; j++) {
                    if (nums[j + 1] > nums[i]) {
                        nums[count] = nums[j + 1];
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }

    /**
     * 通过指针移位来判断
     *
     * @param nums
     * @return
     */
    static int removeDuplicates1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[count]) {
                // 这里可以优化一下。如果数组中的相邻元素都是不一样的，没有重复元素，就没必要原地复制一遍。
                if (i - count > 1) {
                    nums[count + 1] = nums[i];
                }
                count++;
            }
        }
        return count + 1;
    }

    public static void main(String[] args) {
        int[] nums = Utils.getOrderArray(100, 100);
        System.out.println(Arrays.toString(nums));
        System.out.println("length = " + nums.length);
        int count = removeDuplicates1(nums);
        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            set.add(num);
        }
        System.out.println("count = " + count);
        System.out.println("set.size = " + set.size());
        System.out.println(Arrays.toString(nums));
    }
}
