// Code for reversing the string
public class Solution {
    public String reverseString(String s) {
        int i = 0;
        int j = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);
        while(i<j){
            char c1 = sb.charAt(i);
            char c2 = sb.charAt(j);
            sb.setCharAt(i,c2);
            sb.setCharAt(j,c1);
            i++;
            j--;
        }
        return sb.toString();
    }
}
