public class Solution {
    
    public boolean nonRep(String s1, String s2)
    {
        HashSet<Character> h1 = new HashSet<Character>();
        for(int i=0;i<s1.length();i++)  h1.add(s1.charAt(i));
        for(int i=0;i<s2.length();i++)
        {
            if(h1.contains(s2.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }
    
    public int maxProduct(String[] words) {
        int l = 0;
        for(int i=0;i<words.length-1;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                if(nonRep(words[i],words[j]))
                {
                    int l1 = words[i].length();
                    int l2 = words[j].length();
                    if(l<l1*l2)
                    {
                        l = l1*l2;
                    }
                }
            }
        }
        
        return l;
    }
}
