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
        if(head == null) return head;
        if(head.next == null) return head;
        while(head.next!=null && head.val == head.next.val) head = head.next;
        ListNode h = head;
        while(h.next!=null){
            if(h.val == h.next.val){
                h.next = h.next.next;
            }
            else{
                h = h.next;
            }
        }
        return head;
    }
}
