public class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack == null) return -1;
        if(needle == null) return -1;
        if(haystack.length() < needle.length()) return -1;
        if(haystack.length() == needle.length()) {
            if(haystack.equals(needle)) return 0;
            else{
                return -1;
            }
        }
        
        for(int i=0;i<=haystack.length()-needle.length();i++){
            StringBuilder sb = new StringBuilder();
             for(int j=0;j<needle.length();j++){
                 sb.append(haystack.charAt(i+j));
             }
             
             if(needle.equals(sb.toString())) return i;
        }
        return -1;
    }
}
