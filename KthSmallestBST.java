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
    
    public Stack<Integer> printTra(TreeNode n,Stack<Integer> s,int k)
    {
        if(n == null) return s;
        else if(s.size()<k)
        {
            s = printTra(n.left,s,k);
            if(s.size() == k)
            {
                return s;
            }
            s.push(n.val);
            s = printTra(n.right,s,k);
        }
        return s;
    }
    
    public int kthSmallest(TreeNode root, int k) {
        Stack<Integer> s = new Stack<Integer>();
        s = printTra(root,s,k);
        return s.pop();
    }
}
