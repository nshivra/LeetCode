public class Solution {
    public boolean repeatedSubstringPattern(String str) {
        int n = str.length();
        for(int i=n/2;i>=1;i--)
        {
            if(n%i == 0)
            {
                int m = n/i;
                StringBuilder sb = new StringBuilder();
                String s = str.substring(0,i);
                for(int j=0;j<m;j++)
                {
                    sb.append(s);
                }
                if(str.equals(sb.toString()))
                {
                    return true;
                }
            }
        }
        return false;
    }
}
