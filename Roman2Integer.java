public class Solution {
    public int romanToInt(String s) {
        if("0".equals(s)) return -1;
        HashMap<Character,Integer> h = new HashMap<Character,Integer>();
        h.put('I',1);
        h.put('V',5);
        h.put('X',10);
        h.put('L',50);
        h.put('C',100);
        h.put('D',500);
        h.put('M',1000);
        
        int sum = 0;
        for(int i=0;i<s.length()-1;i++)
        {
            char cur = s.charAt(i);
            char next = s.charAt(i+1);
            if(h.get(cur) < h.get(next))
            {
                sum = sum + -1*(h.get(cur));
            }
            else
            {
                sum = sum + (h.get(cur));
            }
        }
        sum = sum + h.get(s.charAt(s.length()-1));
        return sum;
    }
}
