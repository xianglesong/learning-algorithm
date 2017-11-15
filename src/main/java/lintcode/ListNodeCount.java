package lintcode;

/**
 * Created by rollin on 17/11/15.
 *
 * 466. 计算链表中有多少个节点.
 *
 * 您在真实的面试中是否遇到过这个题？ Yes 样例 给出 1->3->5, 返回 3.
 */
public class ListNodeCount {

    public int countNodes(ListNode head) {
        // write your code here
        if (head == null) return 0;

        int count = 1;
        while (head.next != null) {
            head = head.next;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        ListNodeCount listNodeCount = new ListNodeCount();
        int result = listNodeCount.countNodes(new ListNode(1));
        System.out.println(result);
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}