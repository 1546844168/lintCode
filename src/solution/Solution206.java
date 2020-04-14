package solution; /**
 * 206. 反转链表
 * <p>
 * 反转一个单链表。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author 江峰
 * @create 2019-12-05   10:42
 */

import base.ListNode;

/**
 * Definition for singly-linked list.
 * public class base.ListNode {
 * int val;
 * base.ListNode next;
 * base.ListNode(int x) { val = x; }
 * }
 */


public class Solution206 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode last = null;
        while (head != null) {
            prev = new ListNode(head.val);
            prev.next = last;
            last = prev;
            head = head.next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l1.next.next = l3;
        l1.next.next.next = l4;
        l1.next.next.next.next = l5;
        l1.next.next.next.next.next = null;
        System.out.println(l1);
        ListNode listNode = new Solution206().reverseList(l1);
        System.out.println(listNode);
    }
}
