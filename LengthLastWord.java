public class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        if(s == null || "".equals(s)) return 0;
        else{
            int i = s.length()-1;
            int count = 0;
            while(i>=0 && s.charAt(i) != ' '){
                count++;
                i--;
            }
            return count;
        }
    }
}
