/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    public ListNode reverse(ListNode head) {
        ListNode cur = head;
        ListNode next = head;
        ListNode prev = null;
        while(cur!=null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
    
    public void reorderList(ListNode head) {
        if(head == null || head.next== null) return;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast !=null && fast.next!=null)
        {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode p2 = reverse(slow.next);
        slow.next = null;
        ListNode p1 = head;
        
        while (p2 != null ) {
				ListNode temp1 = p1.next;
				ListNode temp2 = p2.next;
 
				p1.next = p2;
				p2.next = temp1;		
 
				p1 = temp1;
				p2 = temp2;
	    }
    }
}
