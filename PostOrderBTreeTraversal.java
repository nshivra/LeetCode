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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<Integer>();
        if(root == null) return l;
        Stack<TreeNode> s = new Stack<TreeNode>();
        Stack<TreeNode> sBack = new Stack<TreeNode>();
        s.push(root);
        while(!s.isEmpty())
        {
            TreeNode b = s.pop();
            sBack.push(b);
            if(b.left != null) s.push(b.left);
            if(b.right != null) s.push(b.right);
        }
        while(!sBack.isEmpty())
        {
            TreeNode b = sBack.pop();
            l.add(b.val);
        }
        return l;
    }
}
