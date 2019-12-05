/**
 * @author 潇潇暮雨
 * @create 2018-09-05   14:16
 * <p>
 * <p>
 * <p>
 * 452. 删除链表中的元素
 * 删除链表中等于给定值val的所有节点。
 * 样例:
 * 给出链表 1->2->3->3->4->5->3, 和 val = 3, 你需要返回删除3之后的链表：1->2->4->5。
 */

public class Solution452 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode preNode = new ListNode(0);
        preNode.next = head;
        ListNode curNode = preNode;
        while (curNode.next != null) {
            if (curNode.next.val == 3) {
                curNode.next = curNode.next.next;
            } else {
                curNode = curNode.next;
            }
        }
        return preNode.next;
    }

    public static void main(String[] args) {
//        ListNode node1 = new ListNode(1);

    }
}
