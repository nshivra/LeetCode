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
    
    public TreeNode lowestCommonAncestor(TreeNode node, TreeNode n1, TreeNode n2) {
        if (node == null)
            return null;
        
        if (node.val > n1.val && node.val > n2.val)
            return lowestCommonAncestor(node.left, n1, n2);
        
        if (node.val < n1.val && node.val < n2.val) 
            return lowestCommonAncestor(node.right, n1, n2);
        
        return node;
    }
}
