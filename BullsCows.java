public class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        HashMap<Character,Integer> h = new HashMap<Character,Integer>();
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i) == guess.charAt(i)){
                bulls++;
            }
            else{
                if(h.containsKey(secret.charAt(i))){
                    int val = h.get(secret.charAt(i));
                    val = val+1;
                    h.put(secret.charAt(i),val);
                }
                else{
                    h.put(secret.charAt(i),1);
                }
            }
        }
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i) != guess.charAt(i) && h.containsKey(guess.charAt(i))){
                cows++;                
                int val = h.get(guess.charAt(i));
                if(val == 1) h.remove(guess.charAt(i)); 
                else{
                    val = val - 1;
                    h.put(guess.charAt(i),val);
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(bulls));
        sb.append("A");
        sb.append(String.valueOf(cows));
        sb.append("B");
        
        return sb.toString();
    }
}
