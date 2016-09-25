/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        while(head!=null && head.val == val){
            head = head.next;
        }
        if(head!=null){
            ListNode h = head;
            while(h.next!=null){
                if(h.next.val == val){
                    h.next = h.next.next;
                }
                else{
                    h = h.next;
                }
            }
        }
        return head;
    }
}
