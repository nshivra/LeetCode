public class Solution {
    public boolean isValidSerialization(String preorder) {
        String[] s = preorder.split(",");
        int countNonHash = 0;
        int countHash = 0;
        if("#".equals(s[0]))
        {
            if(s.length>1) return false;
            else return true;
        }
        else countNonHash++;
        if(s.length == 1) return false;
        for(int i=1;i<s.length;i++)
        {
            if(s.length < i+2*countNonHash) return false;
            int count = 2*countNonHash;
            countNonHash = 0;
            while(count>0)
            {
                if(i>s.length) return false;
                if(!"#".equals(s[i]))
                {
                    countNonHash++;
                }
                i++;
                count--;
            }
            i--;
            if(countNonHash == 0 && i<s.length-1) return false;
        }
        
        return true;
    }
}
