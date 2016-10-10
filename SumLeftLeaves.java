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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;        
        else if(root.left != null && root.right != null){
		      if(root.left.left == null && root.left.right == null) return root.left.val+sumOfLeftLeaves(root.right);
		      else return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
	    }
        else if(root.left != null && root.right == null){
		      if(root.left.left == null && root.left.right == null) return root.left.val;
          else return sumOfLeftLeaves(root.left);
	    }
        else if(root.left == null && root.right != null) return sumOfLeftLeaves(root.right);
        else if(root.left != null && root.right != null) return sumOfLeftLeaves(root.right)+sumOfLeftLeaves(root.left);
        else return 0;
    }
}
