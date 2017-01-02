/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null) return null;
        RandomListNode temp = head;
        while(temp!=null)
        {
            RandomListNode copy = new RandomListNode(temp.label);
            copy.next = temp.next;
            temp.next = copy;
            temp = copy.next;
        }
        
        temp = head;
        while(temp!=null)
        {
            if(temp.random!=null)
            {
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }
        
        temp = head;
    	RandomListNode newHead = head.next;
    	while (temp != null) {
    		RandomListNode next = temp.next;
    		temp.next = next.next;
    		if (next.next != null)
    			next.next = next.next.next;
    		temp = temp.next;
    	}
        return newHead;
    }
}
