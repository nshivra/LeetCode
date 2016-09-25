
public class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        ArrayList<Character> a = new ArrayList<Character>();
        a.add('a');a.add('e');a.add('i');a.add('o');a.add('u');
        a.add('A');a.add('E');a.add('I');a.add('O');a.add('U');
        int i=0;
        int j= s.length()-1;
        while(i<j){
            if(!a.contains(sb.charAt(i))){
                i++;
            }
            else if(!a.contains(sb.charAt(j))){
                j--;
            }
            else if(a.contains(sb.charAt(i)) && a.contains(sb.charAt(j))){
                    char t1 = sb.charAt(i);
                    char t2 = sb.charAt(j);
                    sb.setCharAt(i,t2);
                    sb.setCharAt(j,t1);
                    i++;
                    j--;
                }
            }
            return sb.toString();
        }
}
