package base;

/**
 * @author 江峰
 * @create 2019-12-05   10:45
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
        next = null;
    }

    @Override
    public String toString() {
        ListNode head = this;
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val + " ");
            head = head.next;
        }
        return sb.toString();
    }
}
