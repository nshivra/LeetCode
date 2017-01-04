public class Solution {
    
    HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();

    public int catalan(int n) {
        int res = 0;
        if(h.containsKey(n)) return h.get(n);
        if(n<=1) return 1;
        for (int i = 0; i < n; i++) {
            res += catalan(i) * catalan(n - i - 1);
        }
        h.put(n,res);
        return res;
    }
    
    public int numTrees(int n) {
        if(n == 0) return 0;
        else
        {
            h.put(1,1);
            return catalan(n);
        }
    }
}
