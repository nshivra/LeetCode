public class Solution {
    public boolean isPalindrome(String s) {
        s = s.trim().toLowerCase();
        HashMap<Character,Boolean> h = new HashMap<Character,Boolean>();
        h.put('a',true);h.put('e',true);h.put('i',true);h.put('m',true);h.put('q',true);h.put('u',true);h.put('x',true);
        h.put('b',true);h.put('f',true);h.put('j',true);h.put('n',true);h.put('r',true);h.put('v',true);h.put('y',true);
        h.put('c',true);h.put('g',true);h.put('k',true);h.put('o',true);h.put('s',true);h.put('w',true);h.put('z',true);
        h.put('d',true);h.put('h',true);h.put('l',true);h.put('p',true);h.put('t',true);h.put('0',true);h.put('1',true);
        h.put('2',true);h.put('3',true);h.put('4',true);h.put('5',true);h.put('6',true);h.put('7',true);h.put('8',true);h.put('9',true);
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(h.containsKey(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        
        if(sb.toString().equals(sb.reverse().toString())){
            return true;
        }
        else return false;
        
    }
}
