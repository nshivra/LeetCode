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
    public void flatten(TreeNode root) {
        TreeNode n = root;
        while(n!=null){
            TreeNode right = n.right;
            if(n.left!=null){
                n.right = n.left;
                TreeNode nr = n.right;
                while(nr.right!=null){
                    nr = nr.right;
                }
                nr.right = right;            

            }
            else{
                
            }
            n.left = null;
            n = n.right;
        }
    }
}
