/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        if(root == null) return l;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        int rev = 0;
        while(!q.isEmpty())
        {
            int size = q.size();
            int count = 0;
            List<Integer> innerL = new ArrayList<Integer>();
            while(count<size)
            {
                TreeNode n = q.remove();
                innerL.add(n.val);
                if(n.left!=null) q.add(n.left);
                if(n.right!=null) q.add(n.right);
                count++;
            }
            if(rev%2 == 1) Collections.reverse(innerL);
            rev++;
            l.add(innerL);
        }
   return l;

    }
}
