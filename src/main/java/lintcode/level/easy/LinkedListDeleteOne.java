package lintcode.level.easy;

/**
 * Created by rollin on 17/11/17.
 *
 * 372. 在O(1)时间复杂度删除链表节点
 *
 * 给定一个单链表中的一个等待被删除的节点(非表头或表尾)。请在在O(1)时间复杂度删除该链表节点。
 */
public class LinkedListDeleteOne {
    /*
     * @param node: the node in the list should be deletedt
     * @return: nothing
     */
    public void deleteNode(ListNode node) {
        // write your code here
        if (node == null) return;

        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        LinkedListDeleteOne linkedListDeleteOne = new LinkedListDeleteOne();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        ListNode head = listNode1;
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }

        linkedListDeleteOne.deleteNode(new ListNode(3));
    }
}
