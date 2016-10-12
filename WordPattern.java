public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] c = str.split(" ");
        if(c.length != pattern.length()) return false;
        HashMap<Character,String> map = new HashMap<Character,String>();
        HashMap<String,Character> revMap = new HashMap<String,Character>();
        
        for(int i=0;i<c.length;i++){
            if(map.containsKey(pattern.charAt(i))){
                if(!c[i].equals(map.get(pattern.charAt(i)))){
                    return false;
                }
            }
            else{
                map.put(pattern.charAt(i),c[i]);
            }
            
            if(revMap.containsKey(c[i])){
                if(pattern.charAt(i) != revMap.get(c[i])){
                    return false;
                }
            }
            else{
                revMap.put(c[i],pattern.charAt(i));
            }
        }
        return true;
    }
}
