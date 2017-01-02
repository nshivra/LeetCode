/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root == null) return;
        Queue<TreeLinkNode> q = new LinkedList<TreeLinkNode>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size = q.size();
            int count = 0;
            while(count<size)
            {
                TreeLinkNode n = q.remove();
                if(count <size-1) n.next = q.peek();
                else n.next = null;
                if(n.left!=null) q.add(n.left);
                if(n.right!=null) q.add(n.right);
                count++;
            }
        }
    }
}
