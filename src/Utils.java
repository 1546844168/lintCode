import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author 江峰
 * @create 2019-11-27   10:55
 */
public class Utils {

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
