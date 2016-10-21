/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode next;
        ListNode prev = null;
        while(cur!=null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
    
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m == n) return head;
        int count = 1;
        ListNode h = head;
        ListNode fb = null;
        while(count<m){
            fb = h;
            h = h.next;
            count++;
        }
        ListNode oh = h;
        ListNode prev = fb;
        for(int i=m;i<=n;i++){
            prev = oh;
            oh = oh.next;
        }
        prev.next = null;
        
        if(fb == null){
            head = reverseList(h);
        }
        else{
            fb.next = reverseList(h);
        }
        h.next = oh;
        return head;
        
    }
}
