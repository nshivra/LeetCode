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
    
    public int depth(TreeNode root){
        if(root == null) return 0;
        else return 1+Math.max(depth(root.left),depth(root.right));
    }
    
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if(Math.abs(depth(root.left) - depth(root.right)) > 1) return false;
        else return (isBalanced(root.left) && isBalanced(root.right));
    }
}
