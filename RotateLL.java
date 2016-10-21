/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    public ListNode revLL(ListNode head){
        ListNode prev = null;
        ListNode h = head;
        ListNode next;
        while(h!=null){
            next = h.next;
            h.next= prev;
            prev = h;
            h = next;
        }
        
        return prev;
        
    }
    
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null || k == 0) return head;
        
        int length = 0;
        ListNode h = head;
        while(h!=null){
            length++;
            h = h.next;
        }
        

        while(length <= k){
            k = k - length;
        }
        
        if(length == k) return head;
        
        int count =0;
        ListNode prev = null;
        h = head;
        while(count<length-k){
            prev = h;
            h = h.next;
            count++;
        }
        
        prev.next = null;
        
        ListNode head1 = revLL(h);
        ListNode head2 = revLL(head);
        
        h = head2;
        while(h.next!=null){
            h = h.next;
        }
        
        h.next = head1;
        
        return revLL(head2);
    }
}
