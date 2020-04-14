/**
 * 面试题22. 链表中倒数第k个节点
 * 输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。例如，一个链表有6个节点，从头节点开始，它们的值依次是1、2、3、4、5、6。这个链表的倒数第3个节点是值为4的节点。
 * <p>
 * <p>
 * <p>
 * 示例：
 * <p>
 * 给定一个链表: 1->2->3->4->5, 和 k = 2.
 * <p>
 * 返回链表 4->5.
 *
 * @author 江峰
 * @create 2020-04-14   9:48
 */
public class Solution22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        // 双指针的问题,定义两个指针，一个快指针p，一个慢指针q。
        // p先走k步。然后pq一起走。p为null是，q就是第k个数据。
        ListNode p = head;
        ListNode q = head;
        for (int i = 0; i < k; i++) {
            p = p.next;
        }
        while (p != null) {
            q = q.next;
            p = p.next;
        }
        return q;
    }
}