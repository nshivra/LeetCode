/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
        {
            return head;
        }
        else if(head.next == null) return head;
        else if(head.next.next == null)
        {
            if(head.val == head.next.val) return null;
            else return head;
        }
        else
        {
           ListNode startSen = new ListNode(Integer.MAX_VALUE);
           startSen.next = head;
           head = startSen;
           if(head.val == head.next.val) return null;
           ListNode n = head;
           while(n!=null && n.next!=null && n.next.next!=null)
           {
                ListNode next = n.next.next;
                if(n.next.val == next.val)
                {
                    while(n.next!=null && n.next.val == next.val)
                    {
                       n.next = n.next.next;
                    }
                }
                else
                {
                    n = n.next;
                }
           }
        }
        if(head.val == Integer.MAX_VALUE && head.next == null) return null;
        return head.next;
    }
}
