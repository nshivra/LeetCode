public class Solution {
    public boolean isIsomorphic(String s, String t) {
         if(s.length() != t.length()) return false; 
         HashMap<Character,Character> map = new HashMap<Character,Character>(); 
         HashMap<Character,Character> revMap = new HashMap<Character,Character>(); 
          
         for(int i=0;i<s.length();i++){ 
             if(map.containsKey(s.charAt(i))){ 
                 if(t.charAt(i) != (map.get(s.charAt(i)))){ 
                     return false; 
                 } 
             } 
             else{ 
                 map.put(s.charAt(i),t.charAt(i)); 
             } 
              
             if(revMap.containsKey(t.charAt(i))){ 
                 if(s.charAt(i) != revMap.get(t.charAt(i))){ 
                     return false; 
                 } 
             } 
             else{ 
                 revMap.put(t.charAt(i),s.charAt(i)); 
             } 
         } 
         return true; 

    }
}
