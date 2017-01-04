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
    
    public TreeNode helper(int[] nums,TreeNode root,int low,int high)
    {
        if(low<=high)
        {
            int mid = low+(high-low)/2;
            root = new TreeNode(nums[mid]);
            root.left = helper(nums,root,low,mid-1);
            root.right = helper(nums,root,mid+1,high);
            return root;
        }
        else
        {
            return null;
        }
    }
    
    public TreeNode sortedArrayToBST(int[] nums) {
        
        TreeNode root = null;
        if(nums == null || nums.length == 0) return null;
        else if(nums.length == 1) return new TreeNode(nums[0]);
        else if(nums.length == 2)
        {
            if(nums[0] < nums[1])
            {
                root = new TreeNode(nums[1]);
            }
            root.left = new TreeNode(nums[0]);
            return root;
        }
        return helper(nums,root,0,nums.length-1);
    }
}
