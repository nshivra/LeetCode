/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummy = new ListNode(999);
        ListNode dh = dummy;
        ListNode h1 = l1;
        ListNode h2 = l2;
        while(h1!=null && h2!=null){
            if(h1.val+h2.val+carry >=10){
                dh.next = new ListNode((h1.val+h2.val+carry)-10);
                carry = 1;
            }
            else{
                dh.next = new ListNode(h1.val+h2.val+carry);
                carry = 0;
            }
            dh = dh.next;
            h1 = h1.next;
            h2 = h2.next;
        }
        
        while(h1!=null){
            if(h1.val+carry >=10){
                dh.next = new ListNode((h1.val+carry)-10);
                carry = 1;
            }
            else{
                dh.next = new ListNode(h1.val+carry);
                carry = 0;
            }
            dh = dh.next;
            h1 = h1.next;
        }
        
        while(h2!=null){
            if(h2.val+carry >=10){
                dh.next = new ListNode((h2.val+carry)-10);
                carry = 1;
            }
            else{
                dh.next = new ListNode(h2.val+carry);
                carry = 0;
            }
            dh = dh.next;
            h2 = h2.next;
        }
        
        if(carry == 1){
            dh.next = new ListNode(carry);
        }
        
        return dummy.next;
    }
}
