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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q == null) return true;
        else if(p==null ^ q == null) return false;
        else if(p.val == q.val){
            boolean a = isSameTree(p.left,q.left);
            boolean b = isSameTree(p.right,q.right);
            if(a && b){
                return true;
            }
            else
            {
                return false;
            }
        }
        
        return false;
    }
}
