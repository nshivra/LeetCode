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
    List<String> l = new ArrayList<String>();
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null) return l;
        if(root.left == null && root.right == null)
        {
            l.add(""+root.val);
        }
        else
        {
            StringBuilder s = new StringBuilder();
            btHelper(root,s);
        }
        return l;
    }
    
    public void btHelper(TreeNode root, StringBuilder sb) {
        StringBuilder str = new StringBuilder(sb);
        if(root.left == null && root.right == null)
        {
                str.append(root.val);
                l.add(str.toString());
                return;
        }
        else
        {
            
            str.append(root.val+"->");
            if(root.right != null)
            {
                btHelper(root.right,str);
            }
            if(root.left != null)
            {
                btHelper(root.left,str);
            }
        }
    }
     
}
