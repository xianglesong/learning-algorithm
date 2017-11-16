package lintcode;

/**
 * Created by rollin on 17/11/16.
 *
 * 452. 删除链表中的元素
 *
 * 删除链表中等于给定值val的所有节点。
 *
 * 您在真实的面试中是否遇到过这个题？ Yes 样例 给出链表 1->2->3->3->4->5->3, 和 val = 3, 你需要返回删除3之后的链表：1->2->4->5。
 */
public class ListNodeDelete {

    /*
    * @param head: a ListNode
    * @param val: An integer
    * @return: a ListNode
    */
    public ListNode removeElements(ListNode head, int val) {
        // write your code here
        if (head == null) return null;

        ListNode newListNode = null;
        while (head != null) {
            // iterator
            System.out.println("head value: " + head.val);
            if (head.val != val) {
                newListNode = add2List(newListNode, head);
                // travers(newListNode);
            }
            head = head.next;
        }

        return newListNode;
    }

    private ListNode travers(ListNode node) {
        while (node != null) {
            System.out.println("node value :" + node.val);
            node = node.next;
        }
        return node;
    }

    private ListNode add2List(ListNode newListNode, ListNode head) {
        if (newListNode == null) return new ListNode(head.val);

        ListNode node = newListNode;
        while (node != null) {
            // tail
            if (node.next == null) {
                node.next = new ListNode(head.val);
                break;
            }
            // continue
            node = node.next;
        }

        return newListNode;
    }

    public static void main(String[] args) {
        ListNodeDelete listNodeDelete = new ListNodeDelete();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(3);

        head = listNodeDelete.removeElements(head, 3);
        System.out.println("------------------------");
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

}

