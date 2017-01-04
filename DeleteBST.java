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
    
    public int minRight(TreeNode root)
    {
        int minv = root.val;
        while(root.left!=null)
        {
            minv = root.left.val;
            root = root.left;
        }
        return minv;
    }
    
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return root;   
        if(root.val > key)
        {
            root.left = deleteNode(root.left,key);
        }
        else if(root.val < key)
        {
            root.right = deleteNode(root.right,key);
        }
        else
        {
            if(root.left == null) return root.right;
            else if(root.right == null) return root.left;
            else
            {
                root.val = minRight(root.right);
                root.right = deleteNode(root.right,root.val);
            }
        }
        return root;
    }
}
