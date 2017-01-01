/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode d1 = new ListNode(999);
        ListNode d2 = new ListNode(999);
        
        ListNode dum1 = d1;
        ListNode dum2 = d2;
    
        if(head == null) return null;
        else
        {
            ListNode n = head;
            while(n!=null)
            {
                if(n.val < x)
                {
                    dum1.next = new ListNode(n.val);
                    dum1 = dum1.next;
                    n = n.next;
                }
                else
                {
                    dum2.next = new ListNode(n.val);
                    dum2 = dum2.next;
                    n = n.next;                  
                }
            }
        }
        
        ListNode a = d1;
        while(a.next!=null)
        {
            a = a.next;
        }
        
        a.next = d2.next;
        
        return d1.next;
    }
}
