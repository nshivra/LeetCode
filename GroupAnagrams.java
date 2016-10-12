import java.util.*;
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> l = new ArrayList<List<String>>();
        
        HashMap<String,ArrayList<String>> h = new HashMap<String,ArrayList<String>>();
        
        for(int i=0;i<strs.length;i++){
            char[] cur = strs[i].toCharArray();
            Arrays.sort(cur);
            String s = new String(cur);
            if(h.containsKey(s)){
                ArrayList<String> a = h.get(s);
                a.add(strs[i]);
                h.put(s,a);
            }
            else{
                ArrayList<String> a = new ArrayList<String>();
                a.add(strs[i]);
                h.put(s,a);
            }
        }
        
        for(ArrayList<String> val:h.values()){
            l.add(val);
        }
        
        return l;
    }
}
