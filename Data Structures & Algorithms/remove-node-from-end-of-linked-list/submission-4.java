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

    public ListNode rev(ListNode head){

        if(head == null || head.next == null) return head;

        ListNode newhead = rev(head.next);
        head.next.next = head;
        head.next = null;
        return newhead;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode newhead = rev(head);
        System.out.println(newhead.val);
        if(n == 1){
            newhead = newhead.next;
            ListNode newhead2 = rev(newhead);
           // System.out.println(newhead2.val);
            return newhead2;
        }

        ListNode curr = newhead;
        int i = 1;
        while( i < n-1 && curr.next.next != null){
            curr=curr.next;
            i++;
        }
        curr.next = curr.next.next;
        ListNode newhead3 = rev(newhead);
         System.out.println(newhead3.val);
        return newhead3;
    }
}
