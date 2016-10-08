/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {

    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    ListNode dummy;
    int length = 0;
    HashMap<Integer,Integer> n = new HashMap<Integer,Integer>();
    public Solution(ListNode head) {
        dummy = head;
        length = 0;
        while(dummy!= null){
            n.put(length,dummy.val);
            length++;
            dummy = dummy.next;
        }
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
        int random = (int) (Math.random()*length);
        return n.get(random);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
