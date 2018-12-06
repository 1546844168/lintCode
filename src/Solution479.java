/**
 * @author 潇潇暮雨
 * @create 2018-09-05   17:35
 *
 * 479. 数组第二大数
 * 在数组中找到第二大的数
 *
 * 样例
 * 给出 [1, 3, 2, 4], 返回 3.
 *
 * 给出 [1, 2], 返回 1.
 *
 * 注意事项
 * 你可以假定至少有两个数字
 *
 */
public class Solution479 {
    /**
     * @param nums: An integer array
     * @return: The second max number in the array.
     */
    public int secondMax(int[] nums) {
        // write your code here
        int oneBigNum = nums[0];
        int twoBigNum = nums[1];
        if (nums[1] > nums[0]){
            oneBigNum = nums[1];
            twoBigNum = nums[0];
        }
        for (int i = 2; i < nums.length; i++) {
            if (oneBigNum <= nums[i]){
                twoBigNum = oneBigNum;
                oneBigNum = nums[i];
            }
            if (oneBigNum  > nums[i]){
                if (nums[i] > twoBigNum)
                    twoBigNum = nums[i];
            }
        }
        return twoBigNum ;
    }
}
