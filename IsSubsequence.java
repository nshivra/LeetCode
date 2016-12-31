public class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()) return false;
        int k=0;
        for(int i=0;i<s.length();i++)
        {
            int idx = t.indexOf(s.charAt(i),k);
            System.out.println(idx);
            if(idx == -1) return false;
            k = idx+1;
        }
        return true;
    }
}
