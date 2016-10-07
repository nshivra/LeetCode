public class Solution {
    public String reverseWords(String s) {
        if(s == null) return s;
        String[] c = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = c.length-1;i>=0;i--)
        {
            sb.append(c[i]+" ");
        }
        
        return sb.toString().trim();
    }
}
