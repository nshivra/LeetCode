/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }
        
        ListNode s = head;
        ListNode f = head;
        int count = 0;
        while(f!=null && count < n){
            f = f.next;
            count++;
        }
        
        ListNode prev = null;
        while(f!=null){
            prev = s;
            s = s.next;
            f = f.next;
        }
        
        if(prev == null){
            head = head.next;
            return head;
        }
        else{
            prev.next = s.next;
        }
        return head;
    }
}
