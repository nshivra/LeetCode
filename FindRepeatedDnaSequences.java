public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> l = new ArrayList<String>();
        HashSet<String> h = new HashSet<String>();
        for(int i=0;i<=s.length()-10;i++)
        {
            String subs = s.substring(i,i+10);
            if(h.contains(subs) && !l.contains(subs)) l.add(subs);
            else h.add(subs);
        }
        
        return l;
    }
}
