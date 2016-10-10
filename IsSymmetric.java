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
    public boolean isSymmetric(TreeNode root) {
        return isMirrorCheck(root, root);
    }

    public boolean isMirrorCheck(TreeNode subT1, TreeNode subT2) {
        if (subT1 == null && subT2 == null) return true;
        if (subT1 == null || subT2 == null) return false;
        return (subT1.val == subT2.val) && isMirrorCheck(subT1.right, subT2.left) && isMirrorCheck(subT1.left, subT2.right);
    }
}
