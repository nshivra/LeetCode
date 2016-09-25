/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null ||  head.next == null) return true;
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        prev.next = null;
        
        ListNode cur = slow;
        prev = null;
        ListNode next;
        while(cur!=null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        cur = prev;
        
        ListNode h = head;
        while(cur!=null && h!=null){
            if(cur.val != h.val)
            {
                return false;
            }
            cur = cur.next;
            h = h.next;
        }
        
        return true;
    }
}
