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
    List<List<Integer>> la = new ArrayList<List<Integer>>();
    public void helper(TreeNode node, ArrayList<Integer> a)
    {
        if(node.left == null && node.right == null)
        {
            a.add(node.val);            
            la.add(a);
            return;
        }
        else
        {
            a.add(node.val);
            if(node.left!=null)
            {
                ArrayList<Integer> aL = new ArrayList<Integer>(a);
                helper(node.left,aL);
            }
            
            if(node.right!=null)
            {
                ArrayList<Integer> aR = new ArrayList<Integer>(a);
                helper(node.right,aR);
            }
        }
    }
    
    public int sumNumbers(TreeNode root) {
        if(root == null) return 0;
        else if(root.left == null && root.right == null) return root.val;
        ArrayList<Integer> a = new ArrayList<Integer>();
        helper(root,a);
        int res = 0;
        for(List<Integer> resA:la)
        {
            StringBuilder sb = new StringBuilder();
            for(Integer i:resA)
            {
                sb.append(i+"");
            }
            res += Integer.parseInt(sb.toString());
        }
        return res;
    }
}
