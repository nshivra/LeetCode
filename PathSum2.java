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
    List<List<Integer>> l = new ArrayList<List<Integer>>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<Integer> intr = new ArrayList<Integer>();
        if(root == null) return l;
        if(root.left == null && root.right == null)
        {
            intr.add(root.val);
            l.add(intr);
        }
        else
        {
            btHelper(root,intr);
        }
        
        for(int k=l.size()-1;k>=0;k--)
        {
            List<Integer> i = l.get(k);
            int sumPath = 0;
            for(Integer s :i)
            {
                sumPath = sumPath + s;
            }
            if(sumPath != sum)
            {
                l.remove(i);
            }
        }
        
        return l;
    }
    
    public void btHelper(TreeNode root, List<Integer> sb) {
        List<Integer> intr = new ArrayList<Integer>(sb);
        if(root.left == null && root.right == null)
        {
                intr.add(root.val);
                l.add(intr);
                return;
        }
        else
        {
            intr.add(root.val);
            if(root.right != null)
            {
                btHelper(root.right,intr);
            }
            if(root.left != null)
            {
                btHelper(root.left,intr);
            }
        }
    }
}
