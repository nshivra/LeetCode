public class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> h = new HashMap<Character,Integer>();
        for(int i= 0;i<s.length();i++){
            if(h.containsKey(s.charAt(i))){
                int val = h.get(s.charAt(i));
                val = val + 1;
                h.put(s.charAt(i),val);
            }
            else{
                h.put(s.charAt(i),1);
            }
        }
        
        for(int i= 0;i<t.length();i++){
            if(h.containsKey(t.charAt(i))){
                int val = h.get(t.charAt(i));
                val = val - 1;
                if(val == 0) h.remove(t.charAt(i));
                else h.put(t.charAt(i),val);
            }
            else{
                return false;
            }
        }
        
        return h.isEmpty();
    }
}
