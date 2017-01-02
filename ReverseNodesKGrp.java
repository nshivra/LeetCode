/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next==null) return head;
        else 
        {
            int size = 0;
            ListNode temp = head;
            while(temp!=null)
            {
                temp = temp.next;
                size++;
            }
            if(size>=k)
            {
                int count = 0;
                ListNode c = head;
                ListNode n;
                ListNode p = null;
    
                while(count<k && c!=null)
                {
                    n = c.next;
                    c.next = p;
                    p = c;
                    c = n;
                    count++;
                }
                if(c!=null)
                {
                    head.next = reverseKGroup(c,k);
                }
                return p;
            }
            else
            {
                return head;
            }
        }
    }
}
