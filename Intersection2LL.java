/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if(headA == null || headB == null){
            return null;
        }
        
        ListNode h1 = headA;
        ListNode h2 = headB;
        int n1 = 0;
        while(h1!=null){
            n1 +=1;
            h1 = h1.next;
        }
        
        int n2 = 0;
        while(h2!=null){
            n2 +=1;
            h2 = h2.next;
        }
        
        int diff = Math.abs(n1-n2);
        if(n1>=n2){
            h1 = headA;
            h2 = headB;
            int count = 0;
            while(count<diff){
                h1 = h1.next;
                count++;
            }
        }
        else{
            h1 = headA;
            h2 = headB;
            int count = 0;
            while(count<diff){
                h2 = h2.next;
                count++;
            }
        }
        
        while(h1!=null && h2!=null){
            if(h1.val == h2.val){
                return h1;
            }
            h1 = h1.next;
            h2 = h2.next;
        }
        
        return null;
        
    }
}
