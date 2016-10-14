/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) return head;
        ListNode cur = head;
        ListNode prev = null;
        int length = 0;
        while(cur!=null){
            length = length + 1;
            prev = cur;
            cur = cur.next;
        }
        cur = head;
        int count = 0;
        while(count<length-1){
            ListNode even = cur.next;
            cur.next = even.next;
            prev.next = even;
            even.next = null;
            prev = prev.next;
            cur = cur.next;
            count = count+2;
        }
        
        return head;
    }
}
