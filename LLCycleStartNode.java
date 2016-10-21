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
        if(head.val == head.next.val) return head;
        
        HashMap<ListNode,Boolean> hm = new HashMap<ListNode,Boolean>();
        ListNode h = head;
        hm.put(h,true);
        h = h.next;
        while(h!=null && !hm.containsKey(h)){
            hm.put(h,true);
            h = h.next;
        }
        
        if(h == null) return null;
        else return h;
        
    }
}
