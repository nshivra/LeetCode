/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(999);
        ListNode dh = dummy;
        ListNode lh1 = l1;
        ListNode lh2 = l2;
        while(lh1!=null && lh2!=null){
            if(lh1.val <= lh2.val){
                dh.next = new ListNode(lh1.val);
                dh = dh.next;
                lh1 = lh1.next;
            }
            else{
                dh.next = new ListNode(lh2.val);
                dh = dh.next;
                lh2 = lh2.next;
            }
        }
        
        if(lh1!=null){
            dh.next = lh1;
        }
        
        if(lh2!=null){
            dh.next = lh2;
        }
        
        return dummy.next;
    }
}
