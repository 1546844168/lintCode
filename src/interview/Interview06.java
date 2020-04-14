package interview;

import base.ListNode;

import java.util.Stack;

/**
 * 面试题06. 从尾到头打印链表
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 * <p>
 * <p>
 * 限制：
 * <p>
 * 0 <= 链表长度 <= 10000
 *
 * @author 江峰
 * @create 2020-04-14   11:04
 */
public class Interview06 {
    /**
     * 1. 遍历拿到链表长度
     * 2. 创建数组
     * 3. 遍历聊表反向插入数组
     *
     * @param head
     * @return
     */
    public int[] reversePrint1(ListNode head) {
        int len = 0;
        ListNode tmp = head;
        while (tmp != null) {
            len++;
            tmp = tmp.next;
        }
        int[] arr = new int[len];
        tmp = head;
        while (tmp != null) {
            arr[--len] = tmp.val;
            tmp = tmp.next;
        }
        return arr;
    }

    /**
     * 使用stack
     *
     * @param head
     * @return
     */
    public int[] reversePrint2(ListNode head) {
        Stack<ListNode> stack = new Stack<ListNode>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        int[] arr = new int[stack.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop().val;
        }
        return arr;
    }
}
