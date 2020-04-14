package solution;

/**
 * @author 潇潇暮雨
 * @create 2018-09-05   17:15
 *
 * 463. 整数排序
 * 给一组整数，按照升序排序，使用选择排序，冒泡排序，插入排序或者任何 O(n2) 的排序算法。
 *
 * 样例
 * 对于数组 [3, 2, 1, 4, 5], 排序后为：[1, 2, 3, 4, 5]。
 */
public class Solution463 {

    // 冒泡排序
    public void sortIntegers(int[] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length - i -1; j++) {
                if (A[j] > A[j + 1]){
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
    }
}
