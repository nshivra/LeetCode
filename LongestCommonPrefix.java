public class Solution {
    
    public boolean findCP(String pre,String[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(!pre.equals(arr[i].substring(0,pre.length()))) return false;
        }
        return true;
    }
    
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        if(strs.length == 1) return strs[0];
        
        int minIndex = 0;
        int minLength= strs[0].length() ;
        for(int i=1;i<strs.length;i++)
        {
            if(strs[i].length()<minLength)
            {
                minIndex = i;
                minLength = strs[i].length();
            }
        }
        
        StringBuilder temp = new StringBuilder(strs[minIndex]);
        boolean flag = false;
        while(!flag)
        {
            flag = findCP(temp.toString(),strs);
            if(!flag) temp.setLength(temp.length() - 1);
        }
        return temp.toString();
    }
}
