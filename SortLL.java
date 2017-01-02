/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    public ListNode merge(ListNode a, ListNode b)
    {
        ListNode dum = new ListNode(999);
        ListNode d = dum;
        while(a!=null && b!=null)
        {
            if(a.val<b.val)
            {
                d.next = new ListNode(a.val);
                a = a.next;
                d = d.next;
            }
            else
            {
                d.next = new ListNode(b.val);
                b = b.next;
                d = d.next;
            }
        }
        
        if(a!=null)
        {
            d.next = a;
        }
        if(b!=null)
        {
            d.next = b;
        }
        
        return dum.next;
    }
    
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode b = head;
        ListNode a = head;
        ListNode prev = null;
        while(a!=null && a.next!=null)
        {
            prev = b;
            b = b.next;
            a = a.next.next;
        }
        prev.next = null;
        a = head;
        return merge(sortList(a),sortList(b));
    }
}
