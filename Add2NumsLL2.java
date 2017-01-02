/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
	
	public ListNode reverse(ListNode head)
	{
		ListNode p = null;
		ListNode c = head;
		ListNode n;
		while(c!=null)
		{
			n = c.next;
			c.next = p;
			p = c;
			c = n;
		}
		return p;
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	   ListNode rev1 = reverse(l1);
	   ListNode rev2 = reverse(l2);
	   ListNode dum = new ListNode(999);
	   ListNode d1 = dum;
	   
	   int carry = 0;
	   
	   while(rev1!=null && rev2!=null)
	   {
		   int c = rev1.val + rev2.val + carry;
		   if(c>=10) 
		   {
			   c = c%10;
			   carry=1;
		   }
		   else
		   {
			   carry = 0;
		   }
		   d1.next = new ListNode(c);
		   d1 = d1.next;
		   rev1 = rev1.next;
		   rev2 = rev2.next;
	   }
	   
	   while(rev1!=null)
	   {
		   if(carry == 0)
		   {
			    d1.next = rev1;               
			    break;
		   }
		   else
		   {
				int c = rev1.val + carry;
				if(c>=10) 
				{
				   c = c%10;
				   carry=1;
				}
				else
				{
				   carry = 0;
				}           
				d1.next = new ListNode(c);
				d1 = d1.next;
				rev1 = rev1.next;
			}
	   }
	   
	   while(rev2!=null)
	   {
		   if(carry == 0)
		   {
			   d1.next = rev2;
			   break;
		   }
		   else
		   {
				int c = rev2.val + carry;
				if(c>=10) 
				{
				   c = c%10;
				   carry=1;
				}
				else
				{
				   carry = 0;
				}           
				d1.next = new ListNode(c);
				d1 = d1.next;
				rev2 = rev2.next;
			}     
		}
		
		if(carry == 1)
		{
			
			d1.next = new ListNode(1);
			d1 = d1.next;
		}
	   return reverse(dum.next);
	}
}
