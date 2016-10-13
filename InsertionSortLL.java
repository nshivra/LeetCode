/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(999);
        ListNode cur = head;
        while(cur!=null){
            ListNode dh = dummy;
            ListNode newNode = new ListNode(cur.val);
            if(dh.next == null){
                dh.next = newNode;
            }
            else{
                ListNode prev = dummy;
                dh = dh.next;
                while(dh!=null && dh.val < cur.val){
                    prev = dh;
                    dh = dh.next;
                }
                prev.next = newNode;
                newNode.next = dh;
            }
            cur = cur.next;
        }
        return dummy.next;
    }
}
