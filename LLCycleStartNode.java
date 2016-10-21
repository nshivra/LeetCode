/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        if(head == head.next) return head;
        if(head == head.next.next) return head;
        ListNode slow= head;
        ListNode fast= head;
        slow = slow.next;
        fast=fast.next.next;
        while(fast!=null && fast.next!=null && slow!=fast){
            slow = slow.next;
            fast=fast.next.next;
        }
        if(fast == null || fast.next == null) return null;
        
        ListNode he = head;
        while(he!=slow ){
            he = he.next;
            slow = slow.next;
        }
        return he;
    }
}
