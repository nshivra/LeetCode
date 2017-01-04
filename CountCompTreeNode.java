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
    public int rightHeight(TreeNode root) {
    	int dep = 0;
    	while (root != null) {
    		root = root.right;
    		dep++;
    	}
    	return dep;
    }
    
    public int leftHeight(TreeNode root) {
    	int dep = 0;
    	while (root != null) {
    		root = root.left;
    		dep++;
    	}
    	return dep;
    }
    public int countNodes(TreeNode root) {
        int ld = leftHeight(root);
        int rd = rightHeight(root);
        if(ld == rd) return  (1<<ld) - 1;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
