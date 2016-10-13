/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        else{
            ListNode n1 = head;
            ListNode p1 = null;
            
            while(n1!=null && n1.next!=null){
               ListNode n2 = n1.next;
               ListNode p2 = n1;
               if(p1 == null){
                   head = n2;
               }
               else{
                   p1.next = n2;
               }
               p2.next = n1;
               
               ListNode temp = n1.next;
               n1.next = n2.next;
               n2.next = temp;
               p1 = n1;
               n1 = n1.next;    
            }
            return head;
        }
    }
}
