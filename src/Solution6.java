/**
 * @author 潇潇暮雨
 * @create 2018-09-04   15:25
 * <p>
 * <p>
 * 6. 合并排序数组 II
 * 合并两个排序的整数数组A和B变成一个新的数组。
 * <p>
 * 样例
 * 给出A=[1,2,3,4]，B=[2,4,5,6]，返回 [1,2,2,3,4,4,5,6]
 * <p>
 * 挑战
 * 你能否优化你的算法，如果其中一个数组很大而另一个数组很小？
 */

public class Solution6 {
    public static int[] mergeSortedArray(int[] A, int[] B) {
        int[] result = new int[A.length + B.length];

        int cur = 0;
        int i = 0;
        int j = 0;
        while (i < A.length && j < B.length) {
            if (A[i] <= B[j]) {
                result[cur++] = A[i];
                i++;
            } else {
                result[cur++] = B[j];
                j++;
            }
        }
        while (j <= B.length - 1) {
            result[cur++] = B[j++];
        }
        while (i <= A.length - 1) {
            result[cur++] = A[i++];
        }

        return result;
    }

}
