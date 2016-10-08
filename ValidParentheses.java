public class Solution {
    public boolean isValid(String s) {
        Stack<Character> sta= new Stack<Character>();
        for(int i=0;i<=s.length()-1;i++){
            if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') sta.push(s.charAt(i));
            else{
                if(sta.isEmpty()) return false;
                Character c = sta.pop();
                if((c != '{' && s.charAt(i) == '}') || (c != '(' && s.charAt(i) == ')') || (c != '[' && s.charAt(i) == ']') )
                {
                    return false;
                }
            }
        }
        if(sta.isEmpty()) return true;
        else return false;
    }
}
