public class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> l= new LinkedHashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            if(l.containsKey(s.charAt(i))){
                l.put(s.charAt(i),l.get(s.charAt(i)) + 1);
            }
            else{
                l.put(s.charAt(i),1);
            }
        }
        
        for (Map.Entry<Character,Integer> entry : l.entrySet()) {
            if(entry.getValue() == 1){
                return s.indexOf(entry.getKey());
            }
        }
        
        return -1;
    }
}
