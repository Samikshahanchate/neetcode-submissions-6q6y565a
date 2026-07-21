/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {

    public ListNode rev(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = rev(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public void merge(ListNode list1, ListNode list2) {
        while (list2 != null) {
            ListNode next1 = list1.next;
            ListNode next2 = list2.next;

            list1.next = list2;
            list2.next = next1;

            list1 = next1;
            list2 = next2;
        }
    }

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode list2 = slow.next;
        slow.next = null;

        list2 = rev(list2);

        merge(head, list2);
    }
}