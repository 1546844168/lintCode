/**
 * @author 潇潇暮雨
 * @create 2018-09-05   17:26
 *
 *
 * 466. 链表节点计数
 * 计算链表中有多少个节点.
 *
 * 样例
 * 给出 1->3->5, 返回 3.
 */
public class Solution466 {
    /**
     * @param head: the first node of linked list.
     * @return: An integer
     */
    public int countNodes(ListNode head) {
        // 需要判断链表是否为空
        if (head == null)
            return 0;
        ListNode curNode = head;
        int count = 1;
        while(curNode.next != null){
            count ++;
            curNode = curNode.next;
        }
        return count;
    }
}
