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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<Integer>();
        if(root == null) return l;
        
        Stack<TreeNode> s = new Stack<TreeNode>();
        s.push(root);
        while(!s.isEmpty())
        {
            TreeNode c = s.pop();
            l.add(c.val);
            if(c.right != null) s.push(c.right);
            if(c.left != null) s.push(c.left);
        }
        return l;
    }
}
