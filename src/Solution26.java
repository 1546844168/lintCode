import java.util.*;

/**
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

    static int removeDuplicates1(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return length;
        }
        int count = 0;
        for (int i = 1; i < length; i++) {
            if (nums[i] != nums[count]) {
                count++;
                nums[count] = nums[i];
            }
        }
        return count + 1;
    }

    public static void main(String[] args) {
        int[] nums = getOrderArray(100, 100);
        System.out.println(Arrays.toString(nums));
        System.out.println("length = " + nums.length);
        // int count = removeDuplicates(nums);
        int count = removeDuplicates1(nums);
        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            set.add(num);
        }
        System.out.println("count = " + count);
        System.out.println("set.size = " + set.size());
        System.out.println(Arrays.toString(nums));
    }

    /**
     * 获取随机元素有序的int数组
     *
     * @param length 数组的长度
     * @param maxNum 数组里面最大的数
     * @return
     */
    public static int[] getOrderArray(int length, int maxNum) {
        Random random = new Random();
        List<Integer> integers = new ArrayList<Integer>();
        for (int i = 0; i < length; i++) {
            integers.add(random.nextInt(maxNum));
        }
        Collections.sort(integers);
        Integer[] nums = new Integer[integers.size()];
        nums = integers.toArray(nums);
        int[] ints = new int[integers.size()];
        for (int i = 0; i < nums.length; i++) {
            ints[i] = nums[i];
        }
        return ints;
    }
}
