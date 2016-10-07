public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> h = new  HashMap<Character,Integer>();
        for(int i=0;i<magazine.length();i++){
            if(h.containsKey(magazine.charAt(i))){
                int val = h.get(magazine.charAt(i)) + 1;
                h.put(magazine.charAt(i),val);
            }
            else{
                h.put(magazine.charAt(i),1);
            }
        }
        
        for(int i=0;i<ransomNote.length();i++){
            if(h.containsKey(ransomNote.charAt(i))){
                int val = h.get(ransomNote.charAt(i));
                if(val == 1) h.remove(ransomNote.charAt(i));
                else h.put(ransomNote.charAt(i),val-1);
            }
            else{
                return false;
            }
        }
    return true;
    }
}
