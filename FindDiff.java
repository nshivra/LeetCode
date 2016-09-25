// Code for finding the letter that was added in t

public class Solution {
    public char findTheDifference(String s, String t) {
        StringBuilder sb = new StringBuilder(t);
        for(int i=0;i<s.length();i++){
            if(sb.indexOf(String.valueOf(s.charAt(i)))!=-1){
                sb.deleteCharAt(sb.indexOf(String.valueOf(s.charAt(i))));
            }
        }
        return sb.charAt(0);
    }
}
