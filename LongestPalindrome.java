public class Solution {
    public int longestPalindrome(String s) {
        if(s == null) return 0;
        HashMap<Character,Integer> h = new HashMap<Character,Integer>();
        for(int i = 0;i<s.length();i++){
            if(h.containsKey(s.charAt(i))){
                int val = h.get(s.charAt(i));
                val = val + 1;
                h.put(s.charAt(i),val);
            }
            else{
                h.put(s.charAt(i),1);
            }
        }
        
        int sum = 0;
        boolean isOdd = false;
        for(Map.Entry<Character,Integer> e:h.entrySet()){
            if(e.getValue()%2 == 0) sum = sum + e.getValue();
            else{
                sum = sum + e.getValue() - 1;
                isOdd = true;
            }
        }
        if(isOdd) sum = sum + 1;
        
        return sum;
    }
}
