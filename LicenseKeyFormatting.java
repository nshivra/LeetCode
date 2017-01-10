public class Solution {
    public String licenseKeyFormatting(String S, int K) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i=S.length()-1;i>=0;i--)
        {
            if(S.charAt(i) == '-') continue;
            if(count<K)
            {
                sb.append((S.charAt(i)+"").toUpperCase());
                count++;
            }
            else
            {
                sb.append("-");
                sb.append((S.charAt(i)+"").toUpperCase());
                count = 1;
            }
        }
        
        return sb.reverse().toString();
    }
}
