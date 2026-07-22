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
            return rev(newhead.next);
        }

        ListNode curr = newhead;
        
        for(int i = 1; i < n-1;i++){
            curr=curr.next;
            
        }
        curr.next = curr.next.next;
        return rev(newhead);
         
    }
}
